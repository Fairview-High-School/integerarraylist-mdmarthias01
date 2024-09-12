public class Test {

    public static void main(String[] args) {

        // Initialize the list
        IntegerArrayList list = new IntegerArrayList();

        System.out.println("Test add (val) and get (index): add 5 values to the list, and then get the 5 values from the list");
        System.out.println("Expected: 10 20 30 40 50");

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

        System.out.println(); // New line

        System.out.println("Test add(val): add the 11th item to the list (causes an array resize)");
        System.out.println("Expected: 10 20 30 40 50 60 70 80 90 100 110");

        // Add more values, causing an array resize
        for (int val = 60; val <= 110; val += 10) {
            list.add(val);
        }

        // Print the updated list
        System.out.println(list);
    }
}
