package src;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        filesCheck();
    }

    public static void filesCheck() {
        for (int i = 1; ; ) {
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean isFile = file.isFile();
            boolean isDirectory = file.isDirectory();
            if (isFile == false || isDirectory == true) {
                System.out.println("Данный путь не содержит файла или ведёт к папке");
            } else {
                System.out.println("Путь указан верно");
                System.out.println("Это файл номер " + i);
                i++;
            }
        }
    }
}
