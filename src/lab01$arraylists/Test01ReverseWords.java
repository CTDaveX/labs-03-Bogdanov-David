package lab01$arraylists;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author A. Ford and You
 * Create a runnable program with output as described in the .
 */

public class Test01ReverseWords {

    /**
     * reads in an empty list and file location and populates list with
     * the lines and words reversed.
     * @param inputLocation for reading in the file information
     * @param list to be populated
     * @throws FileNotFoundException if file location not found
     */
    public static void read(String inputLocation, List<String> list) throws FileNotFoundException{
        //TODO: check if input location exists

        //TODO: Create a File Object

        //TODO: Opens up a file input stream

        //TODO: store words in reverse in a list from each line

        //TODO: read in the data using input scanner

            //TODO: read in next line and store as a string

            //TODO: get each word on each line using a delimiter and store in index location

            //TODO: store words in reverse

            //TODO: use string builder to build out lines with space


            //TODO: add each reversed line to list as a string

            //TODO: clear the words on each line


    }

    /**
     * checks whether the file exists
     * @param location of file is checked
     * @throws FileNotFoundException if file does not exist
     */
    public static void validateInputLocation(String location) throws FileNotFoundException{

        File inputFile = new File(location);

        if (!inputFile.exists()) {
            throw new FileNotFoundException("File at " + location + " does not exist.");
        }

        System.out.println("Processing \t" + location + "...");
        
    }

    /**
     * checks whether the output directory exists
     * @param directory folder to place output
     * @param location for output file
     */
    public static void validateOutputFolder(String directory, String location) {

        File outputFile = new File(location);

        if (!outputFile.exists()) {

            boolean hasCreatedDirectory = new File(directory).mkdir();
            System.out.println("Has the directory been created? " + hasCreatedDirectory);
            System.out.println();

            if (hasCreatedDirectory) {
                System.out.println("Processing \t" + directory + "...");
            }else {
                System.out.println("something went wrong.");
            }
        }
        
    }

    /**
     * writes to an output file
     * @param outputLocation to where output file exists
     * @param list containing reversed words
     * @throws FileNotFoundException when cannot write to output location
     */
    public static void write(String outputLocation, List<String> list) throws FileNotFoundException{
        
        //TODO: Open up a file output stream

        // TODO: write out lines using  Print Stream -> write

        //TODO: close output stream
    }


    public static void main(String[] args) throws FileNotFoundException {
        String inputLocation    = "." + File.separator + "data"
                                      + File.separator + "words.txt";

        String outputFolder     = "." + File.separator + "results";

        String outputLocation   = "." + File.separator + "results"
                                      + File.separator + "reverse_words.txt";

        // TODO: update program to use an Array List

        // TODO: process items in file (REVERSALS, can be done either in main or in read)

        //TODO: Validate Output Directory Exists

    }

}
