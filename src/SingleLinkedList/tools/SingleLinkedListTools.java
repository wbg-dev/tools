package SingleLinkedList.tools;

import java.util.Map;

public interface SingleLinkedListTools {

    Map<Integer, Object[]> createSingleLinkedList();

    void outputWelcomeOnConsole();

    void outputNoOrderedSingleLinkedList(Map<Integer, Object[]> singleLinkedList);

    void outputNoOrderedSingleLinkedList();

    void queryElementByIndex(Map<Integer, Object[]> singleLinkedList, int index);

    void queryElementByIndex();

    Object getElementByIndex(Map<Integer, Object[]> singleLinkedList, int index);

    void getElementByIndex();

    Map<Integer, Object[]> addAnElementByIndex(Map<Integer, Object[]> singleLinkedList,
                                               Map<Integer, Object[]> addedSingleLinkedList);

    Map<Integer, Object[]> addSeveralElementsByIndex(Map<Integer, Object[]> singleLinkedList,
                                                     Map<Integer, Object[]> addedSingleLinkedList);


    Map<Integer, Object[]> deleteElementByIndex(Map<Integer, Object[]> singleLinkedList);


    void updateElementByIndex(Map<Integer, Object[]> singleLinkedList);


}
