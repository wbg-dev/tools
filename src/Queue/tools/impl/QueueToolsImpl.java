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
        }else System.out.println("现在队列是空队列");
    }

    @Override
    public Object [] getQueue() {

        ArrayList<Object> tempArrayList=new ArrayList<>();
        int i=0;
        // 为了解决停止问题 这里使用了随机数字+字符串“end”的口令 使用该口令可以结束输入
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
    public Object[] addElementToQueue(Object [] originQueue) {
        Object[] addedArray = getQueue();
        ArrayList<Object> tempArrayList=new ArrayList<>();
        int length = addedArray.length+originQueue.length;
        Object[] newArray=new String[length];
        for (int i = 0; i < originQueue.length; i++) {
            tempArrayList.add(i,originQueue[i]);
        }
        for (int i = originQueue.length; i <length ; i++) {
            int j=0;
            tempArrayList.add(i,addedArray[j++]);
            System.out.println("已填加第"+j+"个元素");
        }
        for (int i = 0; i <length ; i++) {
            newArray[i]=tempArrayList.get(i);
        }
        return newArray;
    }

    @Override
    public Object[] deleteElementFromQueue(Object [] originQueue,int location) {
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
    public Object[] updateElementFromQueue(Object [] originQueue,int location,Object updatedElement) {
        location-=1;
        originQueue[location]=updatedElement;
        return originQueue;
    }

    @Override
    public Object[] takeElementFromQueue(Object[] originQueue, int location) {
        if (location>originQueue.length)
            System.out.println("输入的参数不合法，默认将其转为空队列");
        if (originQueue.length!=0 &&location<originQueue.length) {
            Object beTakenElement = originQueue[location - 1];
            System.out.println("取走的元素是："+beTakenElement);
            System.out.println("现在的队列：");
            return deleteElementFromQueue(originQueue,location);
        }else return null;

    }
}
