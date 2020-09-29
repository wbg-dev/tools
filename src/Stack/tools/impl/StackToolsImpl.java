package Stack.tools.impl;

import Stack.tools.StackTools;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StackToolsImpl implements StackTools {


    private Scanner sc = new Scanner(System.in);
    private int arrow = 0;

    @Override
    public ArrayList<Object> createStack() {
        ArrayList<Object> stack = new ArrayList<>();
        System.out.println("--- Please Input Stack! ---");
        String endCode = Math.ceil(new Random().nextDouble() * 100) + "END";
        System.out.println("--- If You Want To End Input, Please Input: " + endCode + " ---");
        while (true) {
            Object element = sc.next();
            if (!element.equals(endCode)) {
                stack.add(arrow++, element);
            } else break;
        }
        return stack;
    }

    @Override
    public void outputStack(ArrayList<Object> stack) {

        if (stack.size() == 0)
            System.out.println("The Stack is empty!");
        else {
            arrow = stack.size() - 1;
            for (; arrow >= 0; arrow--) {
                System.out.println(stack.get(arrow));
            }
        }
    }

    @Override
    public void outputStack() {
        outputStack(createStack());
    }

    @Override
    public ArrayList<Object> addElementToStack(ArrayList<Object> stack) {
        System.out.println("Input An Element You Want To Add!");
        Object element = sc.next();
        if (stack.size() == 0) {
            stack.add(0, element);
        } else {
            stack.add(stack.size(), element);
        }
        return stack;

    }

    @Override
    public ArrayList<Object> addElementToStack() {
        return addElementToStack(createStack());
    }

    @Override
    public ArrayList<Object> deleteElementFromStack(ArrayList<Object> stack) {
        if (stack.size() >= 1) {
            stack.remove(stack.size() - 1);
            return stack;
        } else {
            System.out.println("The Stack Is Empty, The Stack Is unable To Delete Element! ");
            System.out.println("Using Default Empty Stack!");
            stack.clear();
            return stack;
        }
    }

    @Override
    public ArrayList<Object> deleteElementFromStack() {
        return deleteElementFromStack(createStack());
    }

    @Override
    public ArrayList<Object> updateRearElementOfStack(ArrayList<Object> stack) {
        stack = deleteElementFromStack(stack);
        stack = addElementToStack(stack);
        return stack;
    }

    @Override
    public ArrayList<Object> updateRearElementOfStack() {
        return updateRearElementOfStack(createStack());
    }

    @Override
    public ArrayList<Object> takeRearElementFromStack(ArrayList<Object> stack) {
        if (stack.size() - 1 >= 0) {
            System.out.println("Be Taken Element Is " + stack.get(stack.size() - 1));
            stack.remove(stack.size() - 1);
        }
        return stack;
    }

    @Override
    public ArrayList<Object> takeRearElementFromStack() {
        return takeRearElementFromStack(createStack());
    }

    @Override
    public void queryElementByIndex(ArrayList<Object> stack) {
        System.out.println("Input the Index!");
        String length = sc.next();
        char[] store = new char[1];
        length.getChars(0, 1, store, 0);
        if ('0' > store[0] || store[0] > '9') {
            System.out.println("Wrong Parameter! Please Reusing This Method! ");
            queryElementByIndex(stack);
        } else {
            arrow = Integer.parseInt(String.valueOf(store[0]));
            if (arrow - 1 >= 0 && arrow <= stack.size()) {
                Object beQueriedElement = stack.get(arrow - 1);
                System.out.println("The Element You Query Is " + beQueriedElement);
            } else System.out.println("The Stack Is Unable To Query Element By Input Index !");
        }
    }

    @Override
    public void queryElementByIndex() {
        queryElementByIndex(createStack());
    }

    @Override
    public void outputWelcomeOnConsole() {
        System.out.println("*** Welcome Using Simple Stack Tools! ***");
    }
}
