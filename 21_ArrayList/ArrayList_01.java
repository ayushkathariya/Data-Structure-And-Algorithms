import java.util.ArrayList;

public class ArrayList_01 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();

        // Create (Add elements)
        list1.add(42);
        list1.add(73);

        // Read (Retrieve elements)
        int firstElement = list1.get(0);
        int secondElement = list1.get(1);
        System.out.println("First element: " + firstElement);
        System.out.println("Second element: " + secondElement);

        // Update (Modify an element)
        list1.set(0, 100);
        System.out.println("Updated first element: " + list1.get(0));

        // Delete (Remove an element)
        list1.remove(1);
        System.out.println("Remaining elements: " + list1);
    }
}
