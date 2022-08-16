package liang.ex17_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestFileStream2 {
    public static void main(String[] args) throws IOException {
        try (
                // Create an output stream to the file
                FileOutputStream outputStream = new FileOutputStream("temp.txt", true);
                PrintWriter writer = new PrintWriter(outputStream);

        ) {
            // Output values to the file
            for (int i = 1; i <= 10; i++)
                writer.println(i);
        }

        try (

                FileInputStream inputStream = new FileInputStream("temp.txt");
                Scanner sc = new Scanner(inputStream);
        ) {

            while (sc.hasNextInt())
            System.out.print(sc.nextInt() + " ");
        }
    }
}
