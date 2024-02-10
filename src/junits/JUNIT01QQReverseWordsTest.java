package junits;

import lab01$arraylists.Test01ReverseWords;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author A. Ford
 * This is a JUnit Test for the Reverse Words Program
 * This class uses the Jupiter JUnit Test Library
 * current version is Jupiter 5.8.1
 */
public class JUNIT01QQReverseWordsTest {

    @Test
    void testReverseWords() throws FileNotFoundException {

        String matchLocation    = "." + File.separator + "results"
                                      + File.separator + "reverse_words.txt";

        String inputLocation    = "." + File.separator + "data"
                                      + File.separator + "words.txt";

        List<String> list       = new ArrayList<>();

        Test01ReverseWords.read(inputLocation, list);

        Scanner scanner         = new Scanner(new File(matchLocation));
        List<String> matchList  = new ArrayList<>(list.size());

        while (scanner.hasNextLine()){
            matchList.add(scanner.nextLine());
        }

        for (int i = 0; i < list.size(); i++) {
            assertEquals(matchList.get(i), list.get(i));
        }
    }

}
