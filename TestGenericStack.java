public class TestGenericStack {
    public static void main(String[] args) {
        // Test with Strings
        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("Hello");
        stringStack.push("Java");
        stringStack.push("World");
        
        System.out.println("String Stack: " + stringStack);
        System.out.println("Peek: " + stringStack.peek());
        System.out.println("Pop: " + stringStack.pop());
        System.out.println("Size: " + stringStack.getSize());
        
        // Test with Integers
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        
        System.out.println("\nInteger Stack: " + intStack);
        System.out.println("Peek: " + intStack.peek());
        System.out.println("Pop: " + intStack.pop());
        System.out.println("Size: " + intStack.getSize());

        // Test with Doubles
        GenericStack<Double> doubleStack = new GenericStack<>();
        doubleStack.push(10.0);
        doubleStack.push(20.0);
        doubleStack.push(30.0);
        
        System.out.println("\nDoubles Stack: " + doubleStack);
        System.out.println("Peek: " + doubleStack.peek());
        System.out.println("Pop: " + doubleStack.pop());
        System.out.println("Size: " + doubleStack.getSize());
    }
}
