package SingleLinkedList;

import SingleLinkedList.tools.impl.SingleLinkedListToolsImpl;

import java.util.Map;

public class SingleLinkedListMainTest {

    public static void main(String[] args) {
        SingleLinkedListToolsImpl test = new SingleLinkedListToolsImpl();
        test.outputWelcomeOnConsole();
        // Example one: You can create a new single linked list by this method!
//        test.createSingleLinkedList();
        // Example two: You can output the single linked list which you create!
        // Of course, you can use non-parameter method or method with parameter!
//        Map<Integer, Object[]> singleLinkedList = test.createSingleLinkedList();
//        test.outputSingleLinkedList(singleLinkedList);
//        test.outputSingleLinkedList();
        // Example three: You can query element by index !
        // Of course, you can use non-parameter method or method with parameter!
//        Map<Integer, Object[]> singleLinkedList = test.createSingleLinkedList();
//        test.queryElementByIndex(singleLinkedList,1);
//        test.queryElementByIndex();
        test.queryElementByIndex();
    }
}
