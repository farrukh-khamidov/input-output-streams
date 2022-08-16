import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Windows");

//        try {
//            if (file.createNewFile()) {
//                System.out.println("created");
//            } else {
//                System.out.println("not created");
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


//        if (file.delete()) {
//            System.out.println("deleted");
//        } else {
//            System.out.println("not deleted");
//        }
//        System.out.println(file.exists());
//        if (file.mkdirs()) {
//            System.out.println("created");
//        } else {
//            System.out.println("not created");
//        }

        File[] files = file.listFiles();

        Arrays.sort(files, (f1, f2) -> {
            if (f1.isDirectory() && f2.isDirectory() || f1.isFile() && f2.isFile()) return f1.getName().compareToIgnoreCase(f2.getName());
            return f2.isDirectory() ? 1 : -1;
        });

        if (file.listFiles() != null) {
            for (File f : files) {
                System.out.println(f.getName() + " - " + (f.isDirectory() ? "Folder" : "File"));
            }
        }

    }
}