package src;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CountWords {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        try (FileReader file = new FileReader(".\\files\\words.txt")) {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                words.add(scanner.next());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        HashSet<String> wordsCount = new HashSet<>();
        for (String word: words) {
            int count = 0;
            for (int i = 0; i < words.size(); i++) {
                if (word.equals(words.get(i))) {
                    count ++;
                }
            }
            wordsCount.add(word + " " + String.valueOf(count));
        }
        String[] wordsCountSort = new String[wordsCount.size()];
        int index = 0;
        for (String wordCount: wordsCount) {
            wordsCountSort[index] = wordCount;
            index++;
        }
        for (int i = 0; i < wordsCountSort.length; i++) {
            int position = i;
            String element = wordsCountSort[i];
            for (int j = i + 1; j < wordsCountSort.length; j++) {
                if (wordsCountSort[j].charAt(wordsCountSort[j].length() - 1) + '0' >= element.charAt(element.length() - 1) + '0') {
                    position = j;
                    element = wordsCountSort[j];
                }
            }
            wordsCountSort[position] = wordsCountSort[i];
            wordsCountSort[i] = element;
        }
        System.out.println("НЕ відсортований список слів: " + wordsCount);
        System.out.println("Масив слів після сортування:");
        for (String word: wordsCountSort) {
            System.out.println(word);
        }
    }

}
