import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriterExample {
    public static void main(String[] args) {

//        try (
//                PrintWriter writer = new PrintWriter("test.txt")
//       ){
//        writer.write("Hello java");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }


        Scanner sc = null;
        try {
            sc = new Scanner(new File("scores.txt"));

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
