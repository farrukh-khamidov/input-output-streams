package practice;

import java.io.*;

public class CopyMp3 {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Farrukh\\Downloads\\dili_me_-_jigarlar.mp3");
        System.out.println(file.exists());
        int b;
        try (FileInputStream inputStream = new FileInputStream(file);
             FileOutputStream outputStream = new FileOutputStream("E:\\" + file.getName());
             ){

            while ((b = inputStream.read()) != -1) outputStream.write(b);
            outputStream.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
