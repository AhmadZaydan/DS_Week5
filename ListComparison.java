import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class ListComparison {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        int elements = 1000000;

        // Measure insertion time for ArrayList
        long arrayListInsertionStartTime = System.currentTimeMillis();
        for (int i = 0; i < elements; i++) {
            arrayList.add(i);
        }
        long arrayListInsertionEndTime = System.currentTimeMillis();
        System.out.println("ArrayList insertion time: " + (arrayListInsertionEndTime - arrayListInsertionStartTime) + " ms");

        // Measure insertion time for LinkedList
        long linkedListInsertionStartTime = System.currentTimeMillis();
        for (int i = 0; i < elements; i++) {
            linkedList.add(i);
        }
        long linkedListInsertionEndTime = System.currentTimeMillis();
        System.out.println("LinkedList insertion time: " + (linkedListInsertionEndTime - linkedListInsertionStartTime) + " ms");

        // Measure access time for ArrayList
        long arrayListAccessStartTime = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < elements; i++) {
            int index = random.nextInt(elements);
            arrayList.get(index);
        }
        long arrayListAccessEndTime = System.currentTimeMillis();
        System.out.println("ArrayList access time: " + (arrayListAccessEndTime - arrayListAccessStartTime) + " ms");

        // Measure access time for LinkedList
        long linkedListAccessStartTime = System.currentTimeMillis();
        for (int i = 0; i < elements; i++) {
            int index = random.nextInt(elements);
            linkedList.get(index);
        }
        long linkedListAccessEndTime = System.currentTimeMillis();
        System.out.println("LinkedList access time: " + (linkedListAccessEndTime - linkedListAccessStartTime) + " ms");
    }
}
