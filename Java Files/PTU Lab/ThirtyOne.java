// 31. To write and read a plain text file, write a Java program

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ThirtyOne {
    public static void main(String[] args) throws IOException {
        File f1 = new File("newfile.txt");

        if (!f1.exists()) {
            f1.createNewFile();
        }

        FileWriter fw1 = new FileWriter(f1,true);
        fw1.append("Hello, world\nI hope everyone is doing good\nLet's meet tomorrow");
        fw1.close();

        FileReader fr1 = new FileReader(f1);
        BufferedReader bf1 = new BufferedReader(fr1);

        // int k = bf1.read();
        // while(k!=-1)
        // {
        // System.out.println((char)k);
        // k = bf1.read();
        // }
        // fr1 = new FileReader(f1);
        // bf1 = new BufferedReader(fr1);

        String line = bf1.readLine();
        while (line != null) {
            System.out.println(line);
            line = bf1.readLine();
        }
        bf1.close();
        
    }
}




// dev9139132: if i can do read the file with FileReader then why use Buffered Reader. and also how to create a new file from the program

// GitHub Copilot: ### Why Use `BufferedReader` Instead of `FileReader`?

// While you can read a file using `FileReader`, `BufferedReader` is generally preferred because it provides better performance and additional functionality:

// 1. **Performance**: `BufferedReader` reads chunks of data into a buffer, reducing the number of I/O operations. `FileReader`, on the other hand, reads one character at a time, which can be slower for large files.

// 2. **Convenience**: `BufferedReader` provides methods like `readLine()` to read an entire line of text at once, making it easier to process text files line by line.

// 3. **Efficiency**: For large files, `BufferedReader` is more efficient because it minimizes the overhead of frequent disk access.

// ### How to Create a New File in the Program

// You can use the `File` class or `FileWriter` to create a new file. Below is an updated version of your program that demonstrates how to create a new file, write to it, and then read it using `BufferedReader`.

// ```java
// import java.io.BufferedReader;
// import java.io.File;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;

// public class ThirtyOne {
//     public static void main(String[] args) {
//         try {
//             // Create a new file
//             File file = new File("newFile.txt");
//             if (file.createNewFile()) {
//                 System.out.println("File created: " + file.getName());
//             } else {
//                 System.out.println("File already exists.");
//             }

//             // Write to the file
//             FileWriter writer = new FileWriter(file);
//             writer.write("Hello, this is a test file.\nThis is the second line.");
//             writer.close();
//             System.out.println("Successfully wrote to the file.");

//             // Read the file using BufferedReader
//             FileReader fr = new FileReader(file);
//             BufferedReader br = new BufferedReader(fr);
//             String line;
//             System.out.println("Reading the file:");
//             while ((line = br.readLine()) != null) {
//                 System.out.println(line);
//             }
//             br.close();
//         } catch (IOException e) {
//             System.out.println("An error occurred.");
//             e.printStackTrace();
//         }
//     }
// }
// ```

// ### Explanation of Changes:
// 1. **File Creation**: Used `File.createNewFile()` to create a new file if it doesn't already exist.
// 2. **Writing to File**: Used `FileWriter` to write some text to the file.
// 3. **Reading with BufferedReader**: Used `BufferedReader` to read the file line by line for better performance and convenience.

// ### Output Example:
// ```
// File created: newFile.txt
// Successfully wrote to the file.
// Reading the file:
// Hello, this is a test file.
// This is the second line.
// ```

// Similar code found with 1 license type

// dev9139132: why can't we the file's object directly to buffered reader, why through filereader object

// GitHub Copilot: The reason you cannot pass a `File` object directly to a `BufferedReader` is that `BufferedReader` is designed to wrap around a `Reader` object (like `FileReader`), not a `File` object. 

// ### Explanation:
// 1. **`BufferedReader` Constructor**:
//    The `BufferedReader` class expects a `Reader` object (e.g., `FileReader`, `InputStreamReader`) as its argument. A `File` object only represents the file's metadata (like its path, name, etc.) and does not provide the ability to read its contents.

//    ```java
//    public BufferedReader(Reader in)
//    ```

// 2. **`FileReader` Role**:
//    `FileReader` is a subclass of `Reader` and is specifically designed to read the contents of a file. It acts as a bridge between the `File` object and the `BufferedReader`.

// 3. **Why This Design?**:
//    This design follows the **Decorator Pattern**, where `BufferedReader` adds functionality (like buffering and `readLine()`) to an existing `Reader` object. This allows flexibility to use `BufferedReader` with other types of readers (e.g., `InputStreamReader` for reading from streams).

// ### Corrected Code:
// Here’s how you can fix your code to use `BufferedReader` properly:

// ```java
// import java.io.BufferedReader;
// import java.io.File;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;

// public class ThirtyOne {
//     public static void main(String[] args) throws IOException {
//         File f1 = new File("newfile.txt");

//         // Create the file if it doesn't exist
//         if (!f1.exists()) {
//             f1.createNewFile();
//         }

//         // Write to the file
//         FileWriter writer = new FileWriter(f1);
//         writer.write("Hello, this is a test file.\nThis is the second line.");
//         writer.close();

//         // Read the file using FileReader and BufferedReader
//         FileReader fr1 = new FileReader(f1);
//         BufferedReader bf1 = new BufferedReader(fr1);

//         // Read and print the file content
//         String line;
//         while ((line = bf1.readLine()) != null) {
//             System.out.println(line);
//         }

//         // Close the BufferedReader
//         bf1.close();
//     }
// }
// ```

// ### Key Changes:
// 1. **FileReader**: Used `FileReader` to read the file's contents.
// 2. **BufferedReader**: Wrapped `FileReader` with `BufferedReader` to read the file line by line.
// 3. **File Creation**: Added logic to create the file if it doesn't already exist.

// ### Why This Works:
// - `FileReader` reads the file's content as a stream of characters.
// - `BufferedReader` adds buffering and provides convenient methods like `readLine()`.

// ### Output Example:
// ```
// Hello, this is a test file.
// This is the second line.


// dev9139132: why isn't my file appending 

// GitHub Copilot: The issue lies in how you are using the `FileWriter` class. By default, the `FileWriter` class **overwrites** the file's content unless you explicitly enable the append mode. In your code, you are using:

// ```java
// FileWriter fw1 = new FileWriter(f1);
// ```

// This creates a `FileWriter` in **overwrite mode**, which means it will replace the file's content every time you write to it. To enable appending, you need to pass `true` as the second argument to the `FileWriter` constructor.

// ### Fix:
// Update the `FileWriter` initialization to enable append mode:

// ```java
// FileWriter fw1 = new FileWriter(f1, true); // Enable append mode
// ```

// ### Updated Code:
// Here’s the corrected version of your program:

// ```java
// // 31. To write and read a plain text file, write a Java program

// import java.io.BufferedReader;
// import java.io.File;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;

// public class ThirtyOne {
//     public static void main(String[] args) throws IOException {
//         File f1 = new File("newfile.txt");

//         if (!f1.exists()) {
//             f1.createNewFile();
//         }

//         // Enable append mode by passing 'true' as the second argument
//         FileWriter fw1 = new FileWriter(f1, true);
//         fw1.append("Hello, world\nI hope everyone is doing good\nLet's meet tomorrow\n");
//         fw1.close();

//         FileReader fr1 = new FileReader(f1);
//         BufferedReader bf1 = new BufferedReader(fr1);

//         String line = bf1.readLine();
//         while (line != null) {
//             System.out.println(line);
//             line = bf1.readLine();
//         }

//         bf1.close(); // Close the BufferedReader
//     }
// }
// ```

// ### Explanation of Changes:
// 1. **Append Mode**: Added `true` as the second argument to `FileWriter` to enable appending to the file instead of overwriting it.
// 2. **BufferedReader Close**: Added `bf1.close()` to properly close the `BufferedReader` after reading the file.

// ### Output:
// If you run the program multiple times, the file `newfile.txt` will keep appending the new content:

// ```
// Hello, world
// I hope everyone is doing good
// Let's meet tomorrow
// Hello, world
// I hope everyone is doing good
// Let's meet tomorrow
// ```

// ### Key Takeaway:
// Always use the `FileWriter` constructor with the `append` flag (`true`) if you want to add content to an existing file without overwriting it.

// dev9139132: don't we need to close the file object. and how to use readAlllines at once

// GitHub Copilot: ### Do We Need to Close the `File` Object?
// No, you do not need to explicitly close the `File` object. The `File` class in Java is simply a representation of a file's path and metadata (e.g., name, location, etc.). It does not hold any system resources like file streams or buffers. Therefore, there is no need to close it.

// However, you **must** close objects like `FileReader`, `BufferedReader`, and `FileWriter` because they interact with system resources (e.g., file descriptors) and failing to close them can lead to resource leaks.

// ---

// ### How to Use `readAllLines` to Read the Entire File at Once
// If you want to read all lines of a file at once, you can use the `Files.readAllLines()` method from the `java.nio.file` package. This method reads all lines of a file into a `List<String>`, where each element represents a line in the file.

// Here’s how you can modify your program to use `readAllLines`:

// ### Updated Code:
// ```java
// // 31. To write and read a plain text file, write a Java program

// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.util.List;

// public class ThirtyOne {
//     public static void main(String[] args) throws IOException {
//         File f1 = new File("newfile.txt");

//         if (!f1.exists()) {
//             f1.createNewFile();
//         }

//         FileWriter fw1 = new FileWriter(f1, true);
//         fw1.append("Hello, world\nI hope everyone is doing good\nLet's meet tomorrow\n");
//         fw1.close();

//         // Use Files.readAllLines to read the entire file at once
//         Path filePath = f1.toPath(); // Convert File to Path
//         List<String> lines = Files.readAllLines(filePath);

//         // Print all lines
//         System.out.println("Reading all lines at once:");
//         for (String line : lines) {
//             System.out.println(line);
//         }
//     }
// }
// ```

// ---

// ### Explanation of Changes:
// 1. **`Files.readAllLines`**:
//    - This method reads all lines of the file into a `List<String>`.
//    - It is part of the `java.nio.file.Files` class, which provides utility methods for file operations.

// 2. **Convert `File` to `Path`**:
//    - The `Files.readAllLines` method requires a `Path` object, which can be obtained from the `File` object using the `toPath()` method.

// 3. **Print All Lines**:
//    - The `List<String>` returned by `readAllLines` is iterated to print each line.

// ---

// ### Output Example:
// If the file contains:
// ```
// Hello, world
// I hope everyone is doing good
// Let's meet tomorrow
// ```

// The output will be:
// ```
// Reading all lines at once:
// Hello, world
// I hope everyone is doing good
// Let's meet tomorrow
// ```

// ---

// ### Key Takeaways:
// - You don't need to close the `File` object.
// - Use `Files.readAllLines()` to read all lines of a file at once into a `List<String>`.
// - Always close file streams like `FileReader`, `BufferedReader`, and `FileWriter` to avoid resource leaks.