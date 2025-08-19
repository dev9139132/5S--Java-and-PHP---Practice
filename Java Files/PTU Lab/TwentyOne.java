// 21. Develop a program and design a method to find the smallest number among three numbers.

public class TwentyOne {
    public static void main(String[] args) {
        TwentyOne obj = new TwentyOne();
        System.out.println(obj.smallest(1,-2,3));
    }

int smallest(int a, int b, int c)
    {
        return (a<b)?(a<c?a:c):(b<c?b:c);
    }
}

// Important conversation. Asking AI why couldn't I call non-static method from a static method - main() method. And how to deal with that (create isntance of class and access non-static method thrugh that)

// dev9139132: is my corrrect. and why can't we access non-static methods from a static mehtod of main class while we can access not static methods of a class within main class

// GitHub Copilot: Your code is **not correct** because the logic in the `smallest` method is flawed. The method is supposed to find the smallest number among three numbers, but the current implementation is finding the **largest** number instead. Here's why:

// ### Issue in the Code:
// The current logic:
// ```java
// return (a > b) ? (a > c ? a : c) : (b > c ? b : c);
// ```
// This logic compares the numbers in a way that returns the largest number, not the smallest. To find the smallest number, you need to reverse the comparisons (`<` instead of `>`).

// ### Corrected Code:
// Here’s the corrected implementation:
// ```java
// public class TwentyOne {
//     public static void main(String[] args) {
//         System.out.println(smallest(1, 2, 3)); // Output: 1
//     }

//     static int smallest(int a, int b, int c) {
//         return (a < b) ? (a < c ? a : c) : (b < c ? b : c);
//     }
// }
// ```

// ### Why Can't We Access Non-Static Methods from a Static Method?
// In Java, **static methods belong to the class** rather than any specific instance of the class. On the other hand, **non-static methods belong to an instance of the class**. To call a non-static method, you need an object of the class because non-static methods operate on the instance's state.

// The `main` method is static because it serves as the entry point of the program and is called by the JVM without creating an instance of the class. Since no instance exists when the `main` method is called, you cannot directly access non-static methods or variables.

// ### Why Can You Access Static Methods of Another Class in `main`?
// Static methods of another class can be accessed directly because they also belong to the class itself, not an instance. For example:
// ```java
// public class AnotherClass {
//     public static void sayHello() {
//         System.out.println("Hello!");
//     }
// }

// public class MainClass {
//     public static void main(String[] args) {
//         AnotherClass.sayHello(); // Accessing static method of AnotherClass
//     }
// }
// ```

// If you want to call a non-static method from `main`, you need to create an instance of the class:
// ```java
// public class Example {
//     public void nonStaticMethod() {
//         System.out.println("This is a non-static method.");
//     }

//     public static void main(String[] args) {
//         Example obj = new Example(); // Create an instance
//         obj.nonStaticMethod();       // Call the non-static method
//     }
// }
// ```