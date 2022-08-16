package practice;

import java.io.*;

public class CopyMp32 {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Farrukh\\Downloads\\dili_me_-_jigarlar.mp3");
        System.out.println(file.exists());
        long copiedSize = 0;
        byte[] bytes = new byte[100];
        try (
                FileInputStream inputStream = new FileInputStream(file);
                FileOutputStream outputStream = new FileOutputStream("E:\\" + file.getName());
             ){

            while (inputStream.read(bytes) != -1) {
                copiedSize += 100;
                System.out.printf("\r%.2f %%", copiedSize * 100.0 / file.length());
                if (copiedSize >= file.length() / 2) outputStream.write(bytes);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
