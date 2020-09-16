package Queue.tools;

public interface QueueTools {

    void outputQueue(Object [] queue);

    Object [] getQueue();

    Object [] addElementToQueue(Object [] originQueue);

    Object [] deleteElementToQueue(Object [] originQueue,int location);

    Object updateElementToQueue(Object [] originQueue,int location,Object updatedElement);


}
