package LoopQueue.tools;

import java.util.ArrayList;

public interface LoopQueueTools {

    Object[] createLoopQueue(int length);

    Object[] createLoopQueue();

    ArrayList<Object> newCreateLoopQueue(int length);

    ArrayList<Object> newCreateLoopQueue();

    void outputLoopQueue(Object[] loopQueue);

    void outputLoopQueue();

    void newOutputLoopQueue(ArrayList<Object> loopQueue);

    void newOutputLoopQueue();

    Object[] addElementToRear(Object[] loopQueue, Object[] addedElement);


    ArrayList<Object> newAddElementToRear(ArrayList<Object> loopQueue, ArrayList<Object> addedElement);

    Object[] takeFrontElementFromLoopQueue(Object[] loopQueue);

    Object[] takeFrontElementFromLoopQueue();

    ArrayList<Object> newTakeFrontElementFromLoopQueue(ArrayList<Object> loopQueue);

    ArrayList<Object> newTakeFrontElementFromLoopQueue();

    boolean isMax(Object[] loopQueue);

    boolean isMax();

    boolean newIsMax(ArrayList<Object> loopQueue);

    boolean newIsMax();

    boolean isNull(Object[] loopQueue);

    boolean isNull();

    boolean newIsNull(ArrayList<Object> loopQueue);

    boolean newIsNull();

    int getSize(Object[] loopQueue);

    int getSize();

    int newGetSize(ArrayList<Object> loopQueue);

    int newGetSize();

    void outputWelcomeOnConsole();
}
