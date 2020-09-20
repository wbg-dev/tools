package SingleLinkedList.tools.impl;

import SingleLinkedList.tools.SingleLinkedListTools;

import java.util.*;

public class SingleLinkedListToolsImpl implements SingleLinkedListTools {
    @Override
    public Map<Integer, Object> createSingleLinkedList() {
        Map<Integer,Object> singleLinkedList= new HashMap<>();
        System.out.println("--- Single Linked List Input Start ---");
        String endCode=Math.ceil(new Random().nextDouble()*100)+"END";
        System.out.println("--- If You Want To End Input, Please Input: "+endCode+" ---");
        Scanner sc=new Scanner(System.in);
        int i=0;
        ArrayList<Integer> index=new ArrayList<>();
        Object firstElement=sc.next();
        index.add(i,i);
        singleLinkedList.put(index.get(i),null);
        i++;
        index.add(i,i);
        singleLinkedList.put(index.get(i++),firstElement);
        while (true){
            Object element=sc.next();
           if (!element.equals(endCode)){
                   index.add(i, i);
                   singleLinkedList.put(index.get(i++), element);
               } else break;

           }return singleLinkedList;
        }

    @Override
    public void outputWelcomeOnConsole() {
        System.out.println("*** Welcome Using Simple Single Linked List Tools! ***");
        System.out.println("*** Attention! Tools include Head Point! ***");
    }

    @Override
    public void outputSingleLinkedList(Map<Integer, Object> singleLinkedList) {
        for (int i = 0; i <singleLinkedList.size(); i++) {
            if (singleLinkedList.get(i)!=null)
            System.out.println(singleLinkedList.get(i));
        }
    }

    @Override
    public void outputSingleLinkedList() {
        outputSingleLinkedList(createSingleLinkedList());
    }

    @Override
    public void queryElementByIndex(Map<Integer, Object> singleLinkedList, int index) {

    }

    @Override
    public void queryElementByIndex() {

    }

    @Override
    public void getElementByIndex(Map<Integer, Object> singleLinkedList, int index) {

    }

    @Override
    public void getElementByIndex() {

    }

    @Override
    public void addElementByIndex(Map<Integer, Object> singleLinkedList, int index) {

    }

    @Override
    public void addElementByIndex() {

    }

    @Override
    public void deleteElementByIndex(Map<Integer, Object> singleLinkedList, int index) {

    }

    @Override
    public void deleteElementByIndex() {

    }

    @Override
    public void updateElementByIndex(Map<Integer, Object> singleLinkedList, int index) {

    }

    @Override
    public void updateElementByIndex() {

    }


}
