package Queue.tools;

public interface QueueTools {

    void outputQueue(Object [] queue);

    Object [] getQueue();

    Object [] addElementToQueueRear(Object [] originQueue);

    Object [] deleteElementFromQueue(Object [] originQueue);

    @Deprecated
    Object updateElementFromQueue(Object [] originQueue,Object updatedElement);

    Object [] takeElementFromQueue(Object [] originQueue);

    void outputWelcomeOnConsole();

}
