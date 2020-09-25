package Queue.tools.impl;

import Queue.tools.QueueTools;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class QueueToolsImpl implements QueueTools {
    private Scanner sc = new Scanner(System.in);

    @Override
    public void outputQueue(Object[] queue) {
        if (queue != null) {
            for (Object Queue : queue
            ) {
                System.out.println(Queue);
            }
        } else System.out.println("Current Queue Is Null!");
    }


    @Override
    public void outputQueue() {
        outputQueue(createQueue());
    }

    @Override
    public Object[] createQueue() {

        ArrayList<Object> tempArrayList = new ArrayList<>();
        int i = 0;
        // For solving how to stop input,we adapt random number combined with the string "END" as end code !
        // For instance, "23.0END".
        // Using the end code,you could stop input!
        System.out.println("---Queue Input Start---");
        String endCode = Math.ceil(new Random().nextDouble() * 100) + "END";
        System.out.println("---If You Want To End Input, Please Input: " + endCode + "---");
        while (true) {
            Object element = sc.next();
            if (!element.equals(endCode)) {
                tempArrayList.add(i++, element);
            } else break;
        }
        Object[] storeInputQueue = new Object[tempArrayList.size()];
        for (int j = 0; j < tempArrayList.size(); j++) {
            storeInputQueue[j] = tempArrayList.get(j);
        }
        return storeInputQueue;

    }

    @Override
    public Object[] addElementToQueueRear(Object[] originQueue) {
        Object[] addedArray = createQueue();
        ArrayList<Object> tempArrayList = new ArrayList<>();
        int length = addedArray.length + originQueue.length;
        Object[] newArray = new String[length];
        for (int i = 0; i < originQueue.length; i++) {
            tempArrayList.add(i, originQueue[i]);
        }
        int j = 0;
        for (int i = originQueue.length; i < length; i++) {
            tempArrayList.add(i, addedArray[j++]);
            System.out.println("No." + j + " Element Is Added!");
        }
        for (int i = 0; i < length; i++) {
            newArray[i] = tempArrayList.get(i);
        }
        return newArray;
    }

    @Override
    public Object[] addElementToQueueRear() {
        return addElementToQueueRear(createQueue());
    }

    @Override
    public Object[] deleteElementFromQueue(Object[] originQueue) {
        int location = 1;
        if (location >= originQueue.length)
            return null;
        Object[] newQueue = new Object[originQueue.length - 1];
        location -= 1;
        if (location >= 0)
            System.arraycopy(originQueue, 0, newQueue, 0, location);
        System.arraycopy(originQueue, location + 1, newQueue, location, originQueue.length - location - 1);
        return newQueue;
    }

    @Override
    public Object[] deleteElementFromQueue() {
        return deleteElementFromQueue(createQueue());
    }

    @Override
    public Object[] updateElementFromQueue(Object[] originQueue, Object updatedElement) {
        int location;
        System.out.println();
        System.out.println("This Method Provider Convenience For Users,But Not Recommended!");
        System.out.println("This Method Is Not Suitable For Queue Theory,Are You Definitely Use It?");
        System.out.println("Y : yes");
        System.out.println("N : no");
        String yesOrNo = sc.next();
        if (yesOrNo.equalsIgnoreCase("Y")) {
            System.out.println("Please Select The Position You Want!");

            if (sc.hasNextInt()) {

                location = sc.nextInt() - 1;
                if (location > originQueue.length || location < 0) {
                    System.out.println("Illegal Parameter，Using Default Null Queue!");
                    return null;
                }
                originQueue[location] = updatedElement;
                return originQueue;
            } else return null;
        } else {
            System.out.println("This Program Will Return Your Origin Queue!");
            if (originQueue.length == 0)
                System.out.println("There Are No Elements!");
            return originQueue;
        }
    }

    @Override
    public Object[] updateElementFromQueue(Object updatedElement) {
        return updateElementFromQueue(createQueue(), updatedElement);
    }

    @Override
    public Object[] takeElementFromQueue(Object[] originQueue) {
        int location = 1;
        if (location > originQueue.length)
            System.out.println("Illegal parameter，Using Default Null Queue!");
        if (originQueue.length != 0 && location < originQueue.length) {
            Object beTakenElement = originQueue[location - 1];
            System.out.println("Taken Element：" + beTakenElement);
            System.out.println("Current Queue：");
            return deleteElementFromQueue(originQueue);
        } else return null;

    }

    @Override
    public Object[] takeElementFromQueue() {
        return takeElementFromQueue(createQueue());
    }

    @Override
    public void outputWelcomeOnConsole() {
        System.out.println("******Thanks Tor Using Simple Queue Tools******");
    }

    @Override
    public void outputQueue(ArrayList<Object> queue) {
        if (queue != null) {
            for (Object Queue : queue
            ) {
                System.out.println(Queue);
            }
        } else System.out.println("Current Queue Is Null!");
    }

    @Override
    public ArrayList<Object> newCreateQueue() {
        ArrayList<Object> queue = new ArrayList<>();
        int i = 0;
        // For solving how to stop input,we adapt random number combined with the string "END" as end code !
        // For instance, "23.0END".
        // Using the end code,you could stop input!
        System.out.println("---Queue Input Start---");
        String endCode = Math.ceil(new Random().nextDouble() * 100) + "END";
        System.out.println("---If You Want To End Input, Please Input: " + endCode + "---");
        while (true) {
            Object element = sc.next();
            if (!element.equals(endCode)) {
                queue.add(i++, element);
            } else break;
        }
        return queue;
    }

    @Override
    public ArrayList<Object> addElementToQueueRear(ArrayList<Object> originQueue) {
        ArrayList<Object> addedArray = newCreateQueue();
        for (Object anAddedArray : addedArray) {
            originQueue.add(originQueue.size(), anAddedArray);
        }
        return originQueue;
    }

    @Override
    public ArrayList<Object> deleteElementFromQueue(ArrayList<Object> originQueue) {
        if (originQueue.size() == 0)
            return originQueue;
        originQueue.remove(0);
        return originQueue;
    }
}
