import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SortCharactersFromParagraph {
    public static void main() throws FileNotFoundException {
        File file = new File("src/main/resources/test.txt");
        Scanner sc = new Scanner(file);

        StringBuilder inputData = new StringBuilder();

        while (sc.hasNextLine()) {
            inputData.append(sc.nextLine());
        }

        String sortedData = sortInputData(inputData.toString());
        System.out.println("------------------: "+sortedData);
    }

    public static String sortInputData(String input) {
        String data = input.trim().toLowerCase();
        return data;
    }
}
