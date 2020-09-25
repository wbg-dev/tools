package Stack;

import Stack.tools.StackTools;
import Stack.tools.impl.StackToolsImpl;

import java.util.ArrayList;

public class StackTest {

    public static void main(String[] args) {

        StackTools stackTools = new StackToolsImpl();
        stackTools.outputWelcomeOnConsole();
        // All method is provided with non-parameter using way!
        // Example one : Output your stack !
//        ArrayList<Object> stack = stackTools.createStack();
//        stackTools.outputStack(stack);
        // Example two : Output the stack you have added an element to that!
//        ArrayList<Object> stack = stackTools.createStack();
//        stackTools.addElementToStack(stack);
//        stackTools.outputStack(stack);
        // Example three : Output the stack you have deleted an element from that!
//        ArrayList<Object> stack = stackTools.createStack();
//        stack = stackTools.deleteElementFromStack(stack);
//        stackTools.outputStack(stack);
        // Example four : Output the stack you have updated!
//        ArrayList<Object> stack = stackTools.createStack();
//        stack=stackTools.updateRearElementOfStack(stack);
//        stackTools.outputStack(stack);
        // Example five : Output the element you take out!
        // And output the new stack !
//        ArrayList<Object> stack = stackTools.createStack();
//        stack=stackTools.takeRearElementFromStack(stack);
//        stackTools.outputStack(stack);
        // Example six : Output the result of querying !
//        ArrayList<Object> stack = stackTools.createStack();
//        stackTools.queryElementByIndex(stack);
    }

}
