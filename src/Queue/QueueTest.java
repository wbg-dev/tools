package Queue;

import Queue.tools.impl.QueueToolsImpl;

public class QueueTest {

    public static void main(String[] args) {
        //注释中的方法都为示例，可以供使用者参考。
        QueueToolsImpl test=new QueueToolsImpl();
        //示例1：输出输入的队列。
        test.outputQueue(test.getQueue());
        //示例2：删除指定位置的队列，并输出新队列。
        test.outputQueue(test.deleteElementFromQueue(test.getQueue(),3));
        //示例3：更新指定位置的队列，并输出新队列。但这种方法会破坏队列的用途，不建议使用。
        test.outputQueue(test.updateElementFromQueue(test.getQueue(),3,5));
        //示例4：将元素添加到队尾，并输出新队列
        test.outputQueue(test.addElementToQueue(test.getQueue()));
        //示例5：取出队列元素，并输出新队列。
        test.outputQueue(test.takeElementFromQueue(test.getQueue(),3));
    }
}
