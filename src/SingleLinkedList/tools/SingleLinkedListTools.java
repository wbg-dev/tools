package SingleLinkedList.tools;

import java.util.ArrayList;
import java.util.Map;

public interface SingleLinkedListTools {

    Map<Integer, Object[]> createSingleLinkedList();

    void outputWelcomeOnConsole();

    void outputSingleLinkedList(Map<Integer, Object[]> singleLinkedList);

    void outputSingleLinkedList();

    void queryElementByIndex(Map<Integer, Object[]> singleLinkedList, int index);

    void queryElementByIndex();

    Object getElementByIndex(Map<Integer, Object[]> singleLinkedList, int index);

    void getElementByIndex();

    void addElementByIndex(Map<Integer, Object[]> singleLinkedList, int index);

    void addElementByIndex();

    void deleteElementByIndex(Map<Integer, Object[]> singleLinkedList, int index);

    void deleteElementByIndex();

    void updateElementByIndex(Map<Integer, Object[]> singleLinkedList, int index);

    void updateElementByIndex();

}
