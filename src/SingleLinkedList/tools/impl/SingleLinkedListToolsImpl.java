package SingleLinkedList.tools.impl;

import SingleLinkedList.tools.SingleLinkedListTools;

import java.util.*;

public class SingleLinkedListToolsImpl implements SingleLinkedListTools {

    private Scanner sc = new Scanner(System.in);
    private Map<Integer, Object[]> singleLinkedList;

    @Override
    public Map<Integer, Object[]> createSingleLinkedList() {
        singleLinkedList = new HashMap<>();
        System.out.println("--- Single Linked List Input Start ---");
        String endCode = Math.ceil(new Random().nextDouble() * 100) + "END";
        System.out.println("--- If You Want To End Input, Please Input: " + endCode + " ---");
        int i = 0;
        int j = 1;
        Object firstElement = sc.next();
        if (!firstElement.equals(endCode)) {
            Object[] firstPointerAndNull = {j++, null};
            singleLinkedList.put(i++, firstPointerAndNull);
            Object[] secondPointerAndElement = {j++, firstElement};
            singleLinkedList.put(i++, secondPointerAndElement);
            while (true) {
                Object element = sc.next();
                if (!element.equals(endCode)) {
                    Object[] beStoredArrayList = {j++, element};
                    singleLinkedList.put(i++, beStoredArrayList);
                } else break;

            }
            return singleLinkedList;
        } else {
            Object[] firstPointerAndNull = {null, null};
            singleLinkedList.put(0, firstPointerAndNull);
            return singleLinkedList;
        }
    }

    @Override
    public void outputWelcomeOnConsole() {
        System.out.println("*** Welcome Using Simple Single Linked List Tools! ***");
        System.out.println("*** Attention! Tools include Head Point! ***");
    }

    @Override
    public void outputNoOrderedSingleLinkedList(Map<Integer, Object[]> singleLinkedList) {
        System.out.println("If The Single Linked List Is Not Modified,This Method could Be Used !");
        System.out.println("Otherwise, You Should Better Use outputWithLinkedIndex Method!");
        System.out.println("This Method Might Report Null Pointer Exception!");
        if (singleLinkedList != null) {
            if (singleLinkedList.size() != 1) {
                for (int i = 0; i < singleLinkedList.size(); i++) {
                    Object[] objects = singleLinkedList.get(i);
                    if (objects[1] != null)
                        System.out.println(objects[1]);
                }
            } else System.out.println(" The Single Linked List Is Null ! ");
        } else System.out.println(" The Single Linked List Is Null ! ");
    }

    @Override
    public void outputNoOrderedSingleLinkedList() {
        outputNoOrderedSingleLinkedList(createSingleLinkedList());
    }

    @Override
    public void queryElementByIndex(Map<Integer, Object[]> singleLinkedList, int index) {
        if (index < singleLinkedList.size() && index > 0) {
            Object[] objects = singleLinkedList.get(index);
            System.out.println(objects[1]);
        } else System.out.println("Illegal Index!");
    }


    @Override
    public void queryElementByIndex() {
        singleLinkedList = createSingleLinkedList();
        System.out.println("*** Input The Index ! ***");
        StringBuilder s = new StringBuilder();
        String length = sc.next();
        char[] store = new char[length.length()];
        length.getChars(0, length.length(), store, 0);
        for (int i = 0; i < length.length(); i++) {
            if ('0' > store[i] || store[i] > '9') {
                System.out.println("Wrong Parameter! This Method Will Be Ended!");
                System.exit(0);
            } else {
                char c = store[i];
                s.append(String.valueOf(c));
            }
        }
        queryElementByIndex(singleLinkedList, Integer.parseInt(s.toString()));
    }

    @Override
    public Object getElementByIndex(Map<Integer, Object[]> singleLinkedList, int index) {
        if (index < singleLinkedList.size() && index > 0) {
            Object[] objects = singleLinkedList.get(index);
            return objects[1];
        } else {
            System.out.println("Illegal Index! Using Default Null Single Linked List ! ");
            return null;
        }
    }

    @Override
    public void getElementByIndex() {
        singleLinkedList = createSingleLinkedList();
        System.out.println("*** Input The Index ! ***");
        StringBuilder s = new StringBuilder();
        String length = sc.next();
        char[] store = new char[length.length()];
        length.getChars(0, length.length(), store, 0);
        for (int i = 0; i < length.length(); i++) {
            if ('0' > store[i] || store[i] > '9') {
                System.out.println("Wrong Parameter! This Method Will Be Ended! ");
                System.exit(0);
            } else {
                char c = store[i];
                s.append(String.valueOf(c));
            }
        }
        getElementByIndex(singleLinkedList, Integer.parseInt(s.toString()));
    }

    @Override
    public Map<Integer, Object[]> addAnElementByIndex(Map<Integer, Object[]> singleLinkedList, Map<Integer, Object[]> addedSingleLinkedList) {
        System.out.println("*** Input The Index ! ***");
        StringBuilder s = new StringBuilder();
        String length = sc.next();
        char[] store = new char[length.length()];
        length.getChars(0, length.length(), store, 0);
        for (int i = 0; i < length.length(); i++) {
            if ('0' > store[i] || store[i] > '9') {
                System.out.println("Wrong Parameter! Please Reusing This Method! ");
                return addAnElementByIndex(singleLinkedList,addedSingleLinkedList);
            } else {
                char c = store[i];
                s.append(String.valueOf(c));
            }
        }
        int index = Integer.parseInt(s.toString());
            if (index > 0 && index<singleLinkedList.size()+addedSingleLinkedList.size()) {
                Object[] addedObjects = addedSingleLinkedList.get(1);
                addedObjects[0] = index;
                int currentSize = singleLinkedList.size();
                singleLinkedList.put(currentSize, addedObjects);
                Object[] lastObjects = singleLinkedList.get(index - 1);
                lastObjects[0] = currentSize;
                Object[] nextObjects = singleLinkedList.get(index);
                nextObjects[0] = singleLinkedList.size();
                return singleLinkedList;
            } else {
                System.out.println("Illegal Index! Using Default Null Single Linked List ! ");
                return null;
            }

    }

    @Override
    public Map<Integer, Object[]> deleteElementByIndex(Map<Integer, Object[]> singleLinkedList) {
        System.out.println("*** Input The Index ! ***");
        StringBuilder s = new StringBuilder();
        String length = sc.next();
        char[] store = new char[length.length()];
        length.getChars(0, length.length(), store, 0);
        for (int i = 0; i < length.length(); i++) {
            if ('0' > store[i] || store[i] > '9') {
                System.out.println("Wrong Parameter! Please Reusing This Method! ");
                return deleteElementByIndex(singleLinkedList);
            } else {
                char c = store[i];
                s.append(String.valueOf(c));
            }
        }
        int size = Integer.parseInt(s.toString());
        if (size > 0 && size < singleLinkedList.size()) {
            Object[] beAddedObjects = singleLinkedList.get(size - 1);
            beAddedObjects[0] = size + 1;
            singleLinkedList.remove(size - 1);
            singleLinkedList.remove(size);
            singleLinkedList.put(size - 1, beAddedObjects);
            return singleLinkedList;
        } else {
            if (singleLinkedList.size() == 1) {
                System.out.println("The Single Linked List Is Null, It Is Unable to operate this command!");
                return null;
            }
            System.out.println("Illegal Index! Please Reusing This Method! ");
            return deleteElementByIndex(singleLinkedList);
        }
    }

    @Override
    public Map<Integer, Object[]> updateElementByIndex(Map<Integer, Object[]> singleLinkedList) {
        System.out.println("Input The Index!");
        StringBuilder s = new StringBuilder();
        String length = sc.next();
        char[] store = new char[length.length()];
        length.getChars(0, length.length(), store, 0);
        for (int i = 0; i < length.length(); i++) {
            if ('0' > store[i] || store[i] > '9') {
                System.out.println("Wrong Parameter! Please Reusing This Method! ");
                return updateElementByIndex(singleLinkedList);
            } else {
                char c = store[i];
                s.append(String.valueOf(c));
            }
        }
        int index = Integer.parseInt(s.toString());
        if (index > 0 && index < singleLinkedList.size()) {
            System.out.println("Input The Element You Want to Updated!");
            Object beUpdatedElement = sc.next();
            singleLinkedList.get(index)[1] = beUpdatedElement;
            return singleLinkedList;
        } else {
            System.out.println("Illegal Parameter! Using Default Null List!");
            return null;
        }
    }

    @Override
    public void outputWithLinkedIndex(Map<Integer, Object[]> singleLinkedList) {
        System.out.println("Attention! The First Element Will Be Null For Front Pointer! ");
        int frontPointer = 0;
        Object element;
        if (singleLinkedList != null) {
            for (int i = 0; i < singleLinkedList.size(); i++) {
                element = singleLinkedList.get(frontPointer)[1];
                System.out.println(element);
                frontPointer = (int) singleLinkedList.get(frontPointer)[0];
            }
        } else System.out.println("The Single Linked List Is Null!");
    }
}
