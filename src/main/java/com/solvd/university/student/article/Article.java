package com.solvd.university.student.article;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

public class Article {
    private static final Logger logger = Logger.getLogger(Article.class.getName());

    public static void analyzeArticle() {
        // Specify the path to your text file
        String filePath = "src/main/resources/article.txt";

        // Specify the target words in an array
        String[] targetWords = {"medicine", "cancer", "antibody"};

        // Specify the path to your output text file
        String outputFilePath = "src/main/resources/output.txt";

        try {
            // Read the content of the file into a String
            String fileContent = FileUtils.readFileToString(new File(filePath), StandardCharsets.UTF_8);

            // Iterate over the array of target words and count occurrences
            for (String targetWord : targetWords) {
                int wordCount = StringUtils.countMatches(fileContent, targetWord);
                // Output the result
                logger.info("The word '" + targetWord + "' appears " + wordCount + " times in the file.");

                // Write the result to the output file
                writeResultToFile(outputFilePath, targetWord, wordCount);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeResultToFile(String outputFilePath, String targetWord, int wordCount) {
        try (FileWriter writer = new FileWriter(outputFilePath, true)) {
            writer.write("The word '" + targetWord + "' appears " + wordCount + " times in the file.\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        analyzeArticle();
    }
}