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
        queryElementByIndex(singleLinkedList, sc.nextInt());
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
        getElementByIndex(singleLinkedList, sc.nextInt());
    }

    @Override
    public Map<Integer, Object[]> addAnElementByIndex(Map<Integer, Object[]> singleLinkedList, Map<Integer, Object[]> addedSingleLinkedList) {
        System.out.println("*** Input The Index ! ***");
        if (sc.hasNextInt()) {
            int index = sc.nextInt();
            if (index > 0) {
                Object[] addedObjects = addedSingleLinkedList.get(1);
                addedObjects[0] = index;
                int currentSize = singleLinkedList.size();
                singleLinkedList.put(currentSize, addedObjects);
                Object[] lastObjects = singleLinkedList.get(index - 1);
                lastObjects[0] = currentSize;
                Object[] nextObjects = singleLinkedList.get(index);
                nextObjects[0] = singleLinkedList.size();
                singleLinkedList.get(singleLinkedList.size())[0] = null;
                return singleLinkedList;
            } else {
                System.out.println("Illegal Index! Using Default Null Single Linked List ! ");
                return null;
            }
        } else {
            System.out.println("Illegal Index! Using Default Null Single Linked List ! ");
            return null;
        }
    }

    @Override
    public Map<Integer, Object[]> deleteElementByIndex(Map<Integer, Object[]> singleLinkedList) {
        System.out.println("*** Input The Index ! ***");
        if (sc.hasNextInt()) {
            int index = sc.nextInt();
            if (index > 0 && index < singleLinkedList.size()) {
                Object[] beAddedObjects = singleLinkedList.get(index - 1);
                beAddedObjects[0] = index + 1;
                singleLinkedList.remove(index - 1);
                singleLinkedList.remove(index);
                singleLinkedList.put(index - 1, beAddedObjects);
                return singleLinkedList;

            } else {
                System.out.println("Illegal Index! Using Default Null Single Linked List ! ");
                return null;
            }
        } else {
            System.out.println("Illegal Index! Using Default Null Single Linked List ! ");
            return null;
        }
    }

    @Override
    public Map<Integer, Object[]> updateElementByIndex(Map<Integer, Object[]> singleLinkedList) {
        System.out.println("Input The Index!");
        int index = sc.nextInt();
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
