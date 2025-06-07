import java.util.Scanner;

class Stack {

    // Removed `data` because it was never used — no purpose in keeping unused variables.
    private int[] arr;

    // `rear` tracks the top index of the stack. It stays private to protect from misuse.
    int rear = -1;

    // Old version had: `private int Size = 0;`
    //  Better to remove `Size` and instead use `arr.length - 1` wherever needed.
    // That way, we don’t duplicate the size and avoid mismatch errors.
	
	// Constructor has default access (not public) — fine if you access this class from the same package.
    Stack(int capacity) {
        arr = new int[capacity];
        // Old: Size = capacity - 1;
        // Replaced logic: we use `arr.length - 1` directly in `isFull()`, so no need to store it.
    }

    // Checks if stack is empty
    boolean isEmpty() {
        return rear == -1;
    }

    // Checks if stack is full
    boolean isFull() {
        // Old: return rear == Size;
        // Use the array’s length instead: arr.length - 1
        return rear == arr.length - 1;
    }

    // Pushes element onto the stack if not full
    void push(int elmt) {
        if (!isFull()) {
            rear++;
            arr[rear] = elmt;
            System.out.println("\nElement " + elmt + " has been added over stack");
        } else {
            System.out.println("\nStack Overflow! No more space to add");
        }
    }

    // Pops top element if stack is not empty
    void pop() {
        if (!isEmpty()) {
            int temp = arr[rear];
            rear--;
            System.out.println("\nElement " + temp + " has been deleted from stack");
        } else {
            System.out.println("\nStack Underflow! Nothing to remove");
        }
    }

    // Shows top element of the stack
    void peek() {
        if (!isEmpty()) {
            System.out.println("\nTop Element: " + arr[rear]);
        } else {
            System.out.println("\nStack Underflow! Nothing to peek");
        }
    }

    // Displays all elements in the stack from bottom to top
    void display() {
        if (!isEmpty()) {
            for (int i = 0; i <= rear; i++) {
                // Old mistake: no parentheses around i + 1
                // Added parentheses to ensure correct order of operations
                System.out.println("Element " + (i + 1) + ": " + arr[i]);
            }
        } else {
            System.out.println("\nStack Underflow! Nothing to Display");
        }
    }

    // Optional method to return max size of stack (for menu option 5)
    int getMaxSize() {
        return arr.length;
    }
}


class StackApp{
	
public static void main(String []args)
{	Stack st;
    int size = 5;
	Scanner input = new Scanner(System.in);
	System.out.print( "\nSet stack size or default size?Y/N: ");
	String st0 = input.nextLine();
char ch0 = st0.charAt(0);
	ch0 = Character.toLowerCase(ch0);

	if(ch0 != 'y'){
		st = new Stack(size);
	}
	else{
	System.out.print( "\nEnter the size of your stack: ");
    size = input.nextInt();
	input.nextLine();
    // In c++, instanciation: Stack st(Size);
	//In Java,
	st = new Stack(size);
	}
	
    while (true)
    {
        System.out.println( "\nChoose one of the following options" );
        System.out.println( " [1] Push" );
        System.out.println( " [2] Pop" );
        System.out.println( " [3] Peek" );
        System.out.println( " [4] Display the whole stack" );
        System.out.println( " [5] Check the max size of stack" );
        System.out.println( " [0] Exit" );

        System.out.println( "Your choice: ");
        String st1 = input.nextLine();
		char ch1 = st1.charAt(0);
        if (ch1 != '0')
        {

            switch (ch1)
            {
            case '1':
                System.out.println( "\nEnter the value that you want to push: ");
                int elnt = input.nextInt();
				input.nextLine(); // For taking 'enter'
                st.push(elnt);
               break;
            case '2':
                st.pop();
                break;
            case '3':
                st.peek();
                break;
            case '4':
                st.display();
                break;
            case '5':
                System.out.println( "The max size of your stack is: " + size );
				break;
            default:
                System.out.println( "Invalid input! Please choose only b/w 0 and 5\n"
                     );
            }
        }
        else
        {
            System.out.println( "Exiting..." );
            System.exit(0);
        }
        System.out.println( "Do you want to continue? (Y/N): ");
		String st2 = input.nextLine();
        char ch2 = st2.charAt(0);

        ch2 = Character.toLowerCase(ch2);

        if(ch2 != 'y')
        {
            System.out.println("Exiting...");
            break;
        }
 
    }
}
}
