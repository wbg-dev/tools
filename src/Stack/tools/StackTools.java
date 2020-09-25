package Stack.tools;

import java.util.ArrayList;

public interface StackTools {

    ArrayList<Object> createStack();

    void outputStack(ArrayList<Object> stack);

    void outputStack();

    ArrayList<Object> addElementToStack(ArrayList<Object> stack);

    ArrayList<Object> addElementToStack();

    ArrayList<Object> deleteElementFromStack(ArrayList<Object> stack);

    ArrayList<Object> deleteElementFromStack();

    ArrayList<Object> updateRearElementOfStack(ArrayList<Object> stack);

    ArrayList<Object> updateRearElementOfStack();

    ArrayList<Object> takeRearElementFromStack(ArrayList<Object> stack);

    ArrayList<Object> takeRearElementFromStack();

    void queryElementByIndex(ArrayList<Object> stack);

    void queryElementByIndex();

    void outputWelcomeOnConsole();

}
