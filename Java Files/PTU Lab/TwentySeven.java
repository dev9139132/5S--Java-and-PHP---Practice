class printNumber extends Thread
{
    private int n;
    printNumber(int n)
    {
        this.n = n;
    }

    public void run()
    {
        for(int i=1;i<n;i++)
        {   String threadName = Thread.currentThread().getName();
            System.out.println(threadName+": "+i);
        }
    }
}

class printName implements Runnable
{
    private String name;

    printName(String name)
    {
        this.name = name;
    }

    public void run()
    {
        String thread = Thread.currentThread().getName();
        for(int i=1;i<5;i++)
        {
            System.out.println(thread+": "+name);
        }
    }
}
public class TwentySeven {
    public static void main(String[] args) {
        // printNumber p1 = new printNumber(10);
        // printNumber p2 = new printNumber(10);
        

        //Extended Threads
        // Thread t1 = new Thread(new printNumber(10),"Thread 1");
        // Thread t2 = new Thread(new printNumber(10), "Thread 2");

        // t1.start();
        // t2.start();

        // ----------^^^^^^^^

        //Implemented RUnnable 
        printName p1 = new printName("Dev");
        printName p2 = new printName("Rohan");

        Thread t1 = new Thread(p1,"Thread A");
        Thread t2 = new Thread(p2,"Thread B");

        t1.start();
        t2.start();
        


    }
}


// dev9139132: what's the differnce between syntexes when working with Thread class and Runnable Interface to do multithreading. what which approach is better and why?

// GitHub Copilot: The difference between the syntax for working with the `Thread` class and the `Runnable` interface lies in how you define and use threads. Here's a breakdown:

// ---

// ### **1. Using the `Thread` Class**
// - You create a class that **extends** the `Thread` class.
// - Override the `run()` method to define the task to be executed by the thread.
// - Create an instance of your class and call `start()` to begin execution.

// **Example Syntax:**
// ```java
// class MyThread extends Thread {
//     public void run() {
//         System.out.println("Thread is running...");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         MyThread t1 = new MyThread();
//         t1.start();
//     }
// }
// ```

// ---

// ### **2. Using the `Runnable` Interface**
// - You create a class that **implements** the `Runnable` interface.
// - Implement the `run()` method to define the task.
// - Create an instance of your class, pass it to a `Thread` object, and call `start()`.

// **Example Syntax:**
// ```java
// class MyRunnable implements Runnable {
//     public void run() {
//         System.out.println("Thread is running...");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         MyRunnable r1 = new MyRunnable();
//         Thread t1 = new Thread(r1);
//         t1.start();
//     }
// }
// ```

// ---

// ### **Key Differences**
// | **Aspect**                | **Thread Class**                          | **Runnable Interface**                     |
// |---------------------------|-------------------------------------------|-------------------------------------------|
// | **Inheritance**           | Requires extending the `Thread` class.   | Requires implementing the `Runnable` interface. |
// | **Flexibility**           | Cannot extend any other class (Java supports single inheritance). | Can extend another class while implementing `Runnable`. |
// | **Code Reusability**      | Less reusable, as the thread logic is tied to the class. | More reusable, as the thread logic is separate from the `Thread` class. |
// | **Decoupling**            | Thread behavior and task are tightly coupled. | Thread behavior and task are decoupled. |

// ---

// ### **Which Approach is Better?**
// Using the **`Runnable` interface** is generally considered better for the following reasons:
// 1. **Supports Multiple Inheritance**: Since Java allows a class to implement multiple interfaces, you can implement `Runnable` and extend another class simultaneously.
// 2. **Decoupling**: The task logic is separated from the thread behavior, making the code more modular and reusable.
// 3. **Flexibility**: You can pass the same `Runnable` instance to multiple threads, allowing the same task to be executed by different threads.

// ---

// ### **When to Use Each Approach**
// - Use **`Thread` class** when:
//   - You are creating a simple thread and do not need to extend another class.
//   - You want to directly control the thread behavior.

// - Use **`Runnable` interface** when:
//   - You need to extend another class.
//   - You want to separate the task logic from the thread behavior.
//   - You want better code reusability and modularity.

// ---

// ### **In Your Code**
// In the provided code:
// - The `printNumber` class extends `Thread`, which tightly couples the task logic with the thread behavior.
// - The `printName` class implements `Runnable`, which separates the task logic from the thread behavior.

// The `Runnable` approach is better here because it allows for more flexibility and reusability.