package LoopQueue.tools.impl;

import LoopQueue.tools.LoopQueueTools;

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
    public Object[] addElementToRear(Object[] loopQueue, Object[] addedElement) {
        int loopQueueMaxSize = loopQueue.length;
        int currentQueueSize = getSize(loopQueue);
        int remain = loopQueueMaxSize - currentQueueSize;

        if (addedElement.length <= remain) {
            for (Object anAddedElement : addedElement) {
                loopQueue[currentQueueSize++] = anAddedElement;
            }
        } else {
            System.out.println("Illegal Inserting! Using Default Null Loop Queue!");
            return null;
        }
        return loopQueue;
    }

    @Override
    public Object[] addElementToRear(Object[] loopQueue) {
        Object[] addedElement;
        System.out.println("Please Input The mount of the Element You Want To Input!");
        int addedNumber = sc.nextInt();
        System.out.println("Please Input What You Want Add!");
        addedElement = createLoopQueue(addedNumber);
        return addElementToRear(loopQueue, addedElement);
    }

    @Override
    public Object[] addElementToRear() {
        System.out.println(" Input Each Queue's Length! ");
        int parameterOne = sc.nextInt();
        int parameterTwo = sc.nextInt();
        return addElementToRear(createLoopQueue(parameterOne), createLoopQueue(parameterTwo));
    }

    @Override
    public Object[] takeFrontElementFromLoopQueue(Object[] loopQueue) {
        Object firstElement = loopQueue[0];
        if (getSize(loopQueue) == 1) {
            System.out.println("The Taken Element Is " + firstElement);
            return null;
        }
        if (getSize(loopQueue) > 1) {
            System.out.println("The Taken Element Is " + firstElement);
            System.arraycopy(loopQueue, 1, loopQueue, 0, loopQueue.length - 1);
            loopQueue[getSize(loopQueue) - 1] = null;
            return loopQueue;
        } else {
            System.out.println("Illegal Parameter! Using Default Null Queue! ");
            return null;
        }
    }

    @Override
    public Object[] takeFrontElementFromLoopQueue() {
        return takeFrontElementFromLoopQueue(createLoopQueue());
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
    public boolean isNull(Object[] loopQueue) {
        return loopQueue[0] == null;
    }

    @Override
    public boolean isNull() {
        return isNull(createLoopQueue());
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
    public void outputWelcomeOnConsole() {
        System.out.println("****** Welcome Using Simple Loop Queue Tools ! ******");
    }
}
