package LoopQueue.tools.impl;

import LoopQueue.tools.LoopQueueTools;

import java.util.Random;
import java.util.Scanner;

public class LoopQueueToolsImpl implements LoopQueueTools {


    @Override
    public Object[] createLoopQueue(int length) {
        Object [] loopQueue=new Object[length];
        int count=0;
        System.out.println("--- Queue Input Start ---");
        String endCode=Math.ceil(new Random().nextDouble()*100)+"END";
        System.out.println("--- If You want to end Input, Please input: "+endCode+" ---");
        Scanner sc=new Scanner(System.in);
        while (true){
            if (count==length)
                break;
            Object element=sc.next();
            if (!element.equals(endCode)) {
                loopQueue[count++]=element;
            }else break;
        }
        return loopQueue;
    }

    @Override
    public void outputLoopQueue(Object[] loopQueue) {
        if (loopQueue==null||loopQueue.length==0){
            System.out.println("Now , This loop queue is null!");
        }else
        for (Object loop: loopQueue
             ) {
            System.out.println(loop);
        }
    }

    @Override
    public Object[] addElementToRear(Object[] loopQueue,Object[] addedElement) {
        int loopQueueMaxSize=loopQueue.length;
        int currentQueueSize=getSize(loopQueue);
        int remain=loopQueueMaxSize-currentQueueSize;

        if (addedElement.length<=remain){
            for (Object anAddedElement : addedElement) {
                loopQueue[currentQueueSize++] = anAddedElement;
            }
        }else{
            System.out.println("Illegal inserting! Using default null loop queue!");
            return null;
        }
        return loopQueue;
    }

    @Override
    public Object[] addElementToRear(Object[] loopQueue) {
        Object [] addedElement;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please input the mount of the element you want to input!");
        int addedNumber = sc.nextInt();
        System.out.println("Please input what you want add!");
        addedElement=createLoopQueue(addedNumber);
        return addElementToRear(loopQueue,addedElement);
    }

    @Override
    public Object[] takeFrontElementFromLoopQueue(Object [] loopQueue) {
        Object firstElement = loopQueue[0];
        if (getSize(loopQueue)==1){
            System.out.println("The taken element is " + firstElement);
            return null;
        }
        if (getSize(loopQueue)>1) {
            System.out.println("The taken element is " + firstElement);
            System.arraycopy(loopQueue, 1, loopQueue, 0, loopQueue.length - 1);
            loopQueue[getSize(loopQueue) - 1] = null;
            return loopQueue;
        }else {
            System.out.println("Illegal parameter! Using default null queue! ");
            return null;
        }
    }

    @Override
    public boolean isMax(Object[] loopQueue) {
        return loopQueue.length==getSize(loopQueue);
    }

    @Override
    public boolean isNull(Object[] loopQueue) {
        return loopQueue[0]==null;
    }

    @Override
    public int getSize(Object[] loopQueue) {
        int notNullNumber=0;
        for (Object aLoopQueue : loopQueue) {
            if (aLoopQueue != null)
                notNullNumber++;
        }
        return notNullNumber;
    }

    @Override
    public void outputWelcomeOnConsole() {
        System.out.println("****** Welcome using SimpleLoopQueueTools ! ******");
    }
}
