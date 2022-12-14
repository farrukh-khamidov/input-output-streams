package liang.ex17_4;

import java.io.*;

public class TestFileStream {
    public static void main(String[] args) throws IOException {
        try (
                // Create an output stream to the file
                BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("temp.dat"));
        ) {
            // Output values to the file
            for (int i = 1; i <= 10; i++)
                output.write(i);
        }

        try (
// Create an input stream for the file
                BufferedInputStream input = new BufferedInputStream(new FileInputStream("temp.dat"));
        ) {
            // Read values from the file
            int value;
            while ((value = input.read()) != -1)
            System.out.print(value + " ");
        }
    }
}
