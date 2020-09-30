package LoopQueue.tools.impl;

import LoopQueue.tools.LoopQueueTools;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LoopQueueToolsImpl implements LoopQueueTools {

    private Scanner sc = new Scanner(System.in);

    @Override
    public Object[] createLoopQueue(int length) {
        Object[] loopQueue = new Object[length];
        int count = 0;
        System.out.println("--- Loop Queue Input Start ---");
        String endCode = Math.ceil(new Random().nextDouble() * 100) + "END";
        System.out.println("--- If You Want To End Input, Please Input: " + endCode + " ---");
        while (true) {
            if (count == length)
                break;
            Object element = sc.next();
            if (!element.equals(endCode)) {
                loopQueue[count++] = element;
            } else break;
        }
        return loopQueue;
    }

    @Override
    public Object[] createLoopQueue() {
        System.out.println("*** Input Loop Queue Length! ***");
        int length = sc.nextInt();
        return createLoopQueue(length);
    }

    @Override
    public ArrayList<Object> newCreateLoopQueue(int length) {
        ArrayList<Object> loopQueue = new ArrayList<>(length);
        int count = 0;
        System.out.println("--- Loop Queue Input Start ---");
        String endCode = Math.ceil(new Random().nextDouble() * 100) + "END";
        System.out.println("--- If You Want To End Input, Please Input: " + endCode + " ---");
        while (true) {
            if (count == length)
                break;
            Object element = sc.next();
            if (!element.equals(endCode)) {
                loopQueue.add(count++, element);
            } else break;
        }
        if (count < length) {
            for (int i = count; i < length; i++) {
                loopQueue.add(i, null);
            }
        }
        return loopQueue;
    }

    @Override
    public ArrayList<Object> newCreateLoopQueue() {
        System.out.println("*** Input Loop Queue Length! ***");
        StringBuilder s = new StringBuilder();
        String length = sc.next();
        char[] store = new char[length.length()];
        length.getChars(0, length.length(), store, 0);
        for (int i = 0; i < length.length(); i++) {
            if ('0' > store[i] || store[i] > '9') {
                System.out.println("Wrong Parameter! Please Reusing This Method! ");
                return newCreateLoopQueue();
            } else {
                char c = store[i];
                s.append(String.valueOf(c));
            }
        }
        int size = Integer.parseInt(s.toString());
        return newCreateLoopQueue(size);

    }

    @Override
    public void outputLoopQueue(Object[] loopQueue) {
        if (loopQueue == null || loopQueue.length == 0) {
            System.out.println("Now , This Loop Queue Is Null!");
        } else
            for (Object loop : loopQueue
            ) {
                System.out.println(loop);
            }
    }

    @Override
    public void outputLoopQueue() {
        outputLoopQueue(createLoopQueue());
    }

    @Override
    public void newOutputLoopQueue(ArrayList<Object> loopQueue) {
        if (newGetSize(loopQueue) == 0) {
            System.out.println("Now , This Loop Queue Is Null!");
        } else
            for (Object loop : loopQueue
            ) {
                System.out.println(loop);
            }
    }

    @Override
    public void newOutputLoopQueue() {
        newOutputLoopQueue(newCreateLoopQueue());
    }

    @Override
    public Object[] addElementToRear(Object[] loopQueue, Object[] addedElement) {
        int loopQueueMaxSize = loopQueue.length;
        int currentQueueSize = getSize(loopQueue);
        int remain = loopQueueMaxSize - currentQueueSize;

        if (addedElement.length <= remain) {
            for (Object anAddedElement : addedElement) {
                loopQueue[currentQueueSize++] = anAddedElement;
            }
        } else {
            System.out.println("Illegal Inserting! Using Origin Loop Queue!");
            return loopQueue;
        }
        return loopQueue;
    }

    @Override
    public ArrayList<Object> newAddElementToRear(ArrayList<Object> loopQueue, ArrayList<Object> addedElement) {
        int loopQueueMaxSize = loopQueue.size();
        int currentQueueSize = newGetSize(loopQueue);
        int remain = loopQueueMaxSize - currentQueueSize;

        if (addedElement.size() <= remain) {
            for (Object anAddedElement : addedElement) {
                loopQueue.add(currentQueueSize++, anAddedElement);
            }
        } else {
            System.out.println("Illegal Inserting! Using Origin Loop Queue!");
            return loopQueue;
        }
        return loopQueue;
    }

    @Override
    public Object[] takeFrontElementFromLoopQueue(Object[] loopQueue) {
        Object firstElement = loopQueue[0];
        if (getSize(loopQueue) == 1) {
            System.out.println("The Taken Element Is " + firstElement);
            return loopQueue;
        }
        if (getSize(loopQueue) > 1) {
            System.out.println("The Taken Element Is " + firstElement);
            System.arraycopy(loopQueue, 1, loopQueue, 0, loopQueue.length - 1);
            loopQueue[getSize(loopQueue) - 1] = null;
            return loopQueue;
        } else {
            System.out.println("Illegal Parameter! Using Origin Queue! ");
            return loopQueue;
        }
    }

    @Override
    public Object[] takeFrontElementFromLoopQueue() {
        return takeFrontElementFromLoopQueue(createLoopQueue());
    }

    @Override
    public ArrayList<Object> newTakeFrontElementFromLoopQueue(ArrayList<Object> loopQueue) {
        if (newGetSize(loopQueue) == 0) {
            System.out.println("The Loop Queue Is Null ! The Loop Queue Is Unable To Do This Operation!");
        } else {
            if (newGetSize(loopQueue) == 1) {
                Object firstElement = loopQueue.get(0);
                System.out.println("The Taken Element Is " + firstElement);
                loopQueue.remove(0);
                loopQueue.add(0, null);
                return loopQueue;
            }
            if (newGetSize(loopQueue) > 1) {
                Object firstElement = loopQueue.get(0);
                System.out.println("The Taken Element Is " + firstElement);
                int storedTempCapacity = loopQueue.size();
                ArrayList<Object> storedTemp = new ArrayList<>(storedTempCapacity);
                for (int i = 0; i < storedTempCapacity - 1; i++) {
                    storedTemp.add(i, loopQueue.get(i + 1));
                }
                storedTemp.add(storedTemp.size(), null);
                return storedTemp;
            }
        }
        return loopQueue;
    }

    @Override
    public ArrayList<Object> newTakeFrontElementFromLoopQueue() {
        return newTakeFrontElementFromLoopQueue(newCreateLoopQueue());
    }

    @Override
    public boolean isMax(Object[] loopQueue) {
        return loopQueue.length == getSize(loopQueue);
    }

    @Override
    public boolean isMax() {
        return isMax(createLoopQueue());
    }

    @Override
    public boolean newIsMax(ArrayList<Object> loopQueue) {
        return loopQueue.size() == newGetSize(loopQueue);
    }

    @Override
    public boolean newIsMax() {
        return newIsMax(newCreateLoopQueue());
    }

    @Override
    public boolean isNull(Object[] loopQueue) {
        return loopQueue[0] == null;
    }

    @Override
    public boolean isNull() {
        return isNull(createLoopQueue());
    }

    @Override
    public boolean newIsNull(ArrayList<Object> loopQueue) {
        return loopQueue.get(0) == null;
    }

    @Override
    public boolean newIsNull() {
        return newIsNull(newCreateLoopQueue());
    }

    @Override
    public int getSize(Object[] loopQueue) {
        int notNullNumber = 0;
        for (Object aLoopQueue : loopQueue) {
            if (aLoopQueue != null)
                notNullNumber++;
        }
        return notNullNumber;
    }

    @Override
    public int getSize() {
        return getSize(createLoopQueue());
    }

    @Override
    public int newGetSize(ArrayList<Object> loopQueue) {
        int notNullNumber = 0;
        for (Object aLoopQueue : loopQueue) {
            if (aLoopQueue != null)
                notNullNumber++;
        }
        return notNullNumber;
    }

    @Override
    public int newGetSize() {
        return newGetSize(newCreateLoopQueue());
    }

    @Override
    public void outputWelcomeOnConsole() {
        System.out.println("****** Welcome Using Simple Loop Queue Tools ! ******");
    }
}
