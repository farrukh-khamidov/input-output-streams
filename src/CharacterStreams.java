import java.io.*;

public class CharacterStreams {
    public static void main(String[] args) throws IOException {
        int c;
        File out = new File("out.txt");
        out.createNewFile();

        try (
                FileReader reader = new FileReader("test.txt");
                FileWriter writer = new FileWriter(out)
        ){
            while ((c = reader.read()) != -1){

                System.out.print((char)c);
                writer.write(c);
            }
        }


    }
}
