package Queue.tools;

import java.util.ArrayList;

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

    void outputQueue(ArrayList<Object> queue);

    ArrayList<Object> newCreateQueue();

    ArrayList<Object> addElementToQueueRear(ArrayList<Object> originQueue);

    ArrayList<Object> deleteElementFromQueue(ArrayList<Object> originQueue);

}
