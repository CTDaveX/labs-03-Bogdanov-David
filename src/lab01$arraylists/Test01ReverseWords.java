package lab01$arraylists;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test01ReverseWords {

    public static void read(String inputLocation, List<String> list) throws FileNotFoundException {
        File file = new File(inputLocation);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            List<String> wordsList = new ArrayList<>(List.of(line.split(" ")));
            Collections.reverse(wordsList);
            // Joining words back together
            String reversedLine = String.join(" ", wordsList);
            // Adding reversed lines to the beginning of the list to reverse their order
            list.addFirst(reversedLine);
        }

        scanner.close();
    }

    public static void write(String outputLocation, List<String> list) throws FileNotFoundException {
        // ensuring the directory exists is handled in a separate method for clearer separation of concerns
        ensureDirectoryExists(outputLocation);

        try (PrintStream printStream = new PrintStream(outputLocation)) {
            list.forEach(printStream::println);
        }
    }

    private static void ensureDirectoryExists(String outputLocation) {
        String directoryPath = outputLocation.substring(0, outputLocation.lastIndexOf(File.separator));
        File directory = new File(directoryPath);
        if (!directory.exists() && !directory.mkdirs()) {
            System.err.println("Could not create the directory: " + directoryPath);
        }
    }

    public static void main(String[] args) {
        String inputLocation = "." + File.separator + "data" + File.separator + "words.txt";
        String outputLocation = "." + File.separator + "results" + File.separator + "reverse_words.txt";

        try {
            List<String> list = new ArrayList<>();
            read(inputLocation, list);
            write(outputLocation, list);
        } catch (FileNotFoundException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
