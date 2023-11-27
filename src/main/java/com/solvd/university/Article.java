package com.solvd.university;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

public class Article {
    private static final Logger logger = Logger.getLogger(Article.class.getName());

    public static void main(String[] args) {
        // Specify the path to your text file
        String filePath = "src/main/resources/article.txt";

        String targetWord = "medicine";
        String targetWordTwo = "cancer";
        String targetWordThree = "antibody";

        // Specify the path to your output text file
        String outputFilePath = "src/main/resources/output.txt";

        try {
            // Read the content of the file into a String
            String fileContent = FileUtils.readFileToString(new File(filePath), StandardCharsets.UTF_8);

            // Use StringUtils to count occurrences of each target word
            int wordCount = StringUtils.countMatches(fileContent, targetWord);
            int wordCountTwo = StringUtils.countMatches(fileContent, targetWordTwo);
            int wordCountThree = StringUtils.countMatches(fileContent, targetWordThree);

            // Output the result
            logger.info("The word '" + targetWord + "' appears " + wordCount + " times in the file.");
            logger.info("The word '" + targetWordTwo + "' appears " + wordCountTwo + " times in the file.");
            logger.info("The word '" + targetWordThree + "' appears " + wordCountThree + " times in the file.");

            // Write the results to the output file
            writeResultsToFile(outputFilePath, targetWord, wordCount, targetWordTwo, wordCountTwo, targetWordThree, wordCountThree);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeResultsToFile(String outputFilePath, String targetWord, int wordCount,
                                           String targetWordTwo, int wordCountTwo,
                                           String targetWordThree, int wordCountThree) {
        try (FileWriter writer = new FileWriter(outputFilePath)) {
            writer.write("Results:\n");
            writer.write("The word '" + targetWord + "' appears " + wordCount + " times in the file.\n");
            writer.write("The word '" + targetWordTwo + "' appears " + wordCountTwo + " times in the file.\n");
            writer.write("The word '" + targetWordThree + "' appears " + wordCountThree + " times in the file.\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
