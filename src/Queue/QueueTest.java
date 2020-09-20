package Queue;

import Queue.tools.impl.QueueToolsImpl;

public class QueueTest {

    public static void main(String[] args) {
        //Examples are listed for your convenient using!
        QueueToolsImpl test=new QueueToolsImpl();
        test.outputWelcomeOnConsole();
        //Example one ：Output the queue which you just input!
//        test.outputQueue(test.getQueue());
        //Example two ：Delete first element,then output the new queue!
//        test.outputQueue(test.deleteElementFromQueue(test.getQueue()));
        //Example three : Update last element,then output the new queue!
//        test.outputQueue(test.updateElementFromQueue(test.getQueue(),3));
        //Example four : Add new element to the rear of the queue,then output the new queue!
//        test.outputQueue(test.addElementToQueueRear(test.getQueue()));
        //Example five : Take out the first element,then output the new queue!
 //       test.outputQueue(test.takeElementFromQueue(test.getQueue()));
        //Example six : Some methods can be used without parameter!
        //Here is an example!
//        test.addElementToQueueRear();
    }
}
