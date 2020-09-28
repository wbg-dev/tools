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

    void newOutputQueue(ArrayList<Object> queue);

    ArrayList<Object> newCreateQueue();

    ArrayList<Object> newAddElementToQueueRear(ArrayList<Object> originQueue);

    ArrayList<Object> newDeleteElementFromQueue(ArrayList<Object> originQueue);

    ArrayList<Object> newUpdateElementFromQueue(ArrayList<Object> originQueue, Object updatedElement);

    ArrayList<Object> newTakeElementFromQueue();

    ArrayList<Object> newTakeElementFromQueue(ArrayList<Object> originQueue);

    ArrayList<Object> newAddElementToQueueRear();

    ArrayList<Object> newDeleteElementFromQueue();

    ArrayList<Object> newUpdateElementFromQueue();


}
