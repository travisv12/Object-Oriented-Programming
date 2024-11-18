package Week5.Assignment3.model;

import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> words;

    public Dictionary() {
        words = new HashMap<>();
    }

    // Method to add a word and its meaning
    public void addWord(String word, String meaning) {
        words.put(word, meaning);
    }

    // Method to search for a word
    public String searchWord(String word) {
        if (words.containsKey(word)) {
            return words.get(word);
        } else {
            return null; // Word not found
        }
    }
}
