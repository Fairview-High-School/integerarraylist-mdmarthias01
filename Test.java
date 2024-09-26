public class Test {

    public static void main(String[] args) {

        // Initialize the list
        IntegerArrayList list = new IntegerArrayList();

        System.out.println("Test add(val) and get(index): add 5 values to the list, and then get the 5 values from the list");
        System.out.println("Expected: [10, 20, 30, 40, 50]");

        // Add values to the list
        for (int val = 10; val <= 50; val += 10) {
            list.add(val);
        }

        // Print the list
        System.out.println(list);

        // Get and print values from the list
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n");

        System.out.println("Test add(val): add the 11th item to the list (causes an array resize)");
        System.out.println("Expected: [10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110]");

        // Add more values, causing an array resize
        for (int val = 60; val <= 110; val += 10) {
            list.add(val);
        }

        // Print the updated list
        System.out.println(list);
        System.out.println();

        System.out.println("Test add(index, val): add 25 at index 2");
        System.out.println("Expected: [10, 20, 25, 30, 40, 50, 60, 70, 80, 90, 100, 110]");

        // Add a value at index 2
        list.add(2, 25);

        // Print the list after insertion
        System.out.println(list);
        System.out.println();

        System.out.println("Test set(index, val): set index 5 to 55");
        System.out.println("Expected: [10, 20, 25, 30, 40, 55, 60, 70, 80, 90, 100, 110]");

        // Set value at index 5
        list.set(5, 55);

        // Print the list after setting a value
        System.out.println(list);
        System.out.println();

        System.out.println("Test remove(index): remove value at index 3");
        System.out.println("Expected: [10, 20, 25, 40, 55, 60, 70, 80, 90, 100, 110]");

        // Remove value at index 3
        list.remove(3);

        // Print the list after removing the value
        System.out.println(list);
        System.out.println();

        System.out.println("Test size(): check the size of the list");
        System.out.println("Expected size: 11");
        System.out.println("Actual size: " + list.size());
        System.out.println();

        System.out.println("Test isEmpty(): check if the list is empty");
        System.out.println("Expected: false");
        System.out.println("Actual: " + list.isEmpty());
        System.out.println();

        System.out.println("Test contains(val): check if the list contains 55");
        System.out.println("Expected: true");
        System.out.println("Actual: " + list.contains(55));
        System.out.println();

        System.out.println("Test indexOf(val): check the index of 55");
        System.out.println("Expected: 4");
        System.out.println("Actual: " + list.indexOf(55));
        System.out.println();

        System.out.println("Test clear(): clear the list");
        list.clear();
        System.out.println("Expected: []");
        System.out.println(list);

        System.out.println("Test isEmpty() after clear(): check if the list is empty");
        System.out.println("Expected: true");
        System.out.println("Actual: " + list.isEmpty());
    }
}
