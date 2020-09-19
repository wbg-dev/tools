package LoopQueue.tools;

public interface LoopQueueTools {

    Object [] createLoopQueue(int length);

    void outputLoopQueue(Object [] loopQueue);

    Object [] addElementToRear(Object[] loopQueue,Object[] addedElement);

    Object [] addElementToRear(Object[] loopQueue);

    Object [] takeFrontElementFromLoopQueue(Object[] loopQueue);

    boolean isMax(Object [] loopQueue);

    boolean isNull(Object [] loopQueue);

    int getSize(Object [] loopQueue);

    void outputWelcomeOnConsole();
}
