package Queue.tools;

public interface QueueTools {

    void outputQueue(Object [] queue);

    Object [] getQueue();

    Object [] addElementToQueue(Object [] originQueue);

    Object [] deleteElementFromQueue(Object [] originQueue,int location);

    @Deprecated
    Object updateElementFromQueue(Object [] originQueue,int location,Object updatedElement);

    Object [] takeElementFromQueue(Object [] originQueue,int location);
}
