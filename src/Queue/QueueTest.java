package Queue;

import Queue.tools.impl.QueueToolsImpl;

public class QueueTest {

    public static void main(String[] args) {
        //注释中的方法都为示例，可以供使用者参考。
        QueueToolsImpl test=new QueueToolsImpl();
        test.outputWelcomeOnConsole();
        //示例1：输出输入的队列。
//        test.outputQueue(test.getQueue());
        //示例2：删除队首元素，并输出新队列。
//        test.outputQueue(test.deleteElementFromQueue(test.getQueue()));
        //示例3：更新队首元素，并输出新队列。
//        test.outputQueue(test.updateElementFromQueue(test.getQueue(),3));
        //示例4：将元素添加到队尾，并输出新队列
//        test.outputQueue(test.addElementToQueueRear(test.getQueue()));
        //示例5：取出队首元素，并输出新队列。
//        test.outputQueue(test.takeElementFromQueue(test.getQueue()));

    }
}
