package Queue;

import Queue.tools.impl.QueueToolsImpl;

public class QueueTest {

    public static void main(String[] args) {
        QueueToolsImpl test=new QueueToolsImpl();
        //test.outputQueue(test.getArray());
        //test.outputQueue(test.deleteElementToQueue(test.getQueue(),3));
        //test.outputQueue(test.updateElementFromQueue(test.getQueue(),3,5));
        test.outputQueue(test.takeElementFromQueue(test.getQueue(),3));
    }
}
