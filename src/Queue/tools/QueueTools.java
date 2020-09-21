package Queue.tools;

public interface QueueTools {

    void outputQueue(Object[] queue);

    void outputQueue();

    Object[] createQueue();

    Object[] addElementToQueueRear(Object[] originQueue);

    Object[] addElementToQueueRear();

    Object[] deleteElementFromQueue(Object[] originQueue);

    Object[] deleteElementFromQueue();

    Object[] updateElementFromQueue(Object[] originQueue, Object updatedElement);

    Object[] updateElementFromQueue(Object updatedElement);

    Object[] takeElementFromQueue(Object[] originQueue);

    Object[] takeElementFromQueue();

    void outputWelcomeOnConsole();

}
