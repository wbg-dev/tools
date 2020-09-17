package Queue.tools.impl;

import Queue.tools.QueueTools;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class QueueToolsImpl implements QueueTools {


    @Override
    public void outputQueue(Object [] queue) {
        if (queue!=null) {
            for (Object Queue : queue
            ) {
                System.out.println(Queue);
            }
        }else System.out.println("Current queue is null!");
    }

    @Override
    public Object [] getQueue() {

        ArrayList<Object> tempArrayList=new ArrayList<>();
        int i=0;
        // For solving how to stop input,we adapt random number combined with the string "END" as end code !
        // For instance, "23.0END".
        // Using the end code,you could stop input!
        System.out.println("---Queue Input Start---");
        String endCode=Math.ceil(new Random().nextDouble()*100)+"END";
        System.out.println("---If You want to end Input, Please input: "+endCode+"---");
        Scanner sc=new Scanner(System.in);
        while (true){
            String element=sc.next();
            if (!element.equals(endCode)) {
                tempArrayList.add(i++, element);
            }else break;
        }
        Object [] storeInputQueue =new Object [tempArrayList.size()];
            for (int j = 0; j < tempArrayList.size(); j++) {
                storeInputQueue[j] = tempArrayList.get(j);
            }
            return storeInputQueue;

    }

    @Override
    public Object[] addElementToQueueRear(Object [] originQueue) {
        Object[] addedArray = getQueue();
        ArrayList<Object> tempArrayList=new ArrayList<>();
        int length = addedArray.length+originQueue.length;
        Object[] newArray=new String[length];
        for (int i = 0; i < originQueue.length; i++) {
            tempArrayList.add(i,originQueue[i]);
        }
        int j=0;
        for (int i = originQueue.length; i <length ; i++) {
            tempArrayList.add(i,addedArray[j++]);
            System.out.println("No." + j + "element is added!");
        }
        for (int i = 0; i <length ; i++) {
            newArray[i]=tempArrayList.get(i);
        }
        return newArray;
    }

    @Override
    public Object[] deleteElementFromQueue(Object [] originQueue) {
        int location=1;
        if (location>=originQueue.length)
            return null;
        Object [] newQueue= new Object[originQueue.length-1];
        location-=1;
        if (location >= 0)
            System.arraycopy(originQueue, 0, newQueue, 0, location);
        System.arraycopy(originQueue,location+1,newQueue,location,originQueue.length-location-1);
        return newQueue;
    }

    @Override
    public Object[] updateElementFromQueue(Object [] originQueue,Object updatedElement) {
        int location=originQueue.length;
        location-=1;
        originQueue[location]=updatedElement;
        return originQueue;
    }

    @Override
    public Object[] takeElementFromQueue(Object[] originQueue) {
        int location=1;
        if (location>originQueue.length)
            System.out.println("Illegal parameter，Using default null queue!");
        if (originQueue.length!=0 &&location<originQueue.length) {
            Object beTakenElement = originQueue[location - 1];
            System.out.println("Taken element："+beTakenElement);
            System.out.println("Current queue：");
            return deleteElementFromQueue(originQueue);
        }else return null;

    }

    @Override
    public void outputWelcomeOnConsole() {
        System.out.println("******Thanks for using SimpleQueueTools******");
    }

}
