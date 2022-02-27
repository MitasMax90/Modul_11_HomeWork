import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework {

    public static List<String> parseFileToStringList() {
        File file = new File("Sneakers.txt");
        List<String> sneaker = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] unit = line.split(" ");

                if (Integer.parseInt(unit[1]) < 0)
                    throw new IllegalArgumentException();

                sneaker.add(line);
            }

            return sneaker;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input file");
        }

        return null;
    }
}
