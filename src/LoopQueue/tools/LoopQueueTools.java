package LoopQueue.tools;

public interface LoopQueueTools {

    Object [] createLoopQueue(int length);

    Object [] createLoopQueue();

    void outputLoopQueue(Object [] loopQueue);

    void outputLoopQueue();

    Object [] addElementToRear(Object[] loopQueue,Object[] addedElement);

    Object [] addElementToRear(Object[] loopQueue);

    Object [] addElementToRear();

    Object [] takeFrontElementFromLoopQueue(Object[] loopQueue);

    Object [] takeFrontElementFromLoopQueue();

    boolean isMax(Object [] loopQueue);

    boolean isMax();

    boolean isNull(Object [] loopQueue);

    boolean isNull();

    int getSize(Object [] loopQueue);

    int getSize();

    void outputWelcomeOnConsole();
}
