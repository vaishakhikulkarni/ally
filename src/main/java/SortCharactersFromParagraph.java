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
        String data = input
                .trim()
                .toLowerCase()
                .replaceAll("[^a-zA-Z0-9+]", "")
                .replaceAll(" ","");

        char[] charInputArray = data.toCharArray();

        for (int i = 0; i < charInputArray.length; i++) {

            for (int j = 0; j < charInputArray.length; j++) {

                if (charInputArray[j] > charInputArray[i]) {
                    char temp = charInputArray[i];
                    charInputArray[i] = charInputArray[j];
                    charInputArray[j] = temp;
                }
            }
        }

        return String.valueOf(charInputArray);
    }
}
