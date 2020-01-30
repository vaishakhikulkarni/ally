import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SortCharactersFromParagraph {
    public static void main(String args[]) throws FileNotFoundException {
        File file = new File("src/main/resources/test.txt");
        Scanner sc = new Scanner(file);

        StringBuilder inputData = new StringBuilder();

        while (sc.hasNextLine()) {
            inputData.append(sc.nextLine());
        }

        String sortedData = sortInputData(inputData.toString());
        System.out.println("------------------Sorted Data: \n" + sortedData);
    }

    static String sortInputData(String input) {

        if (isNullOrEmpty(input)) {
            String data = parseData(input);
            char[] charInputArray = sorting(data);

            return String.valueOf(charInputArray);
        }
        return "";
    }

    private static String parseData(String input) {
        return input
                .trim()
                .toLowerCase()
                .replaceAll("[^a-zA-Z0-9+]", "")
                .replaceAll(" ", "");
    }

    private static char[] sorting(String data) {

        char[] charInputArray = data.toCharArray();
        quickSort(charInputArray,0,charInputArray.length-1);
        return charInputArray;
    }

    private static int partition(char[] array, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                swap(array, counter, i);
                counter++;
            }
        }
        swap(array, pivot, counter);

        return counter;
    }

    private static void swap(char[] array, int counter, int i) {
        char temp = array[counter];
        array[counter] = array[i];
        array[i] = temp;
    }

    private static void quickSort(char[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot-1);
        quickSort(array, pivot+1, end);
    }

    private static boolean isNullOrEmpty(String str) {
        return (str != null && !str.isEmpty());
    }
}
