package Week5.Assignment3.controller;

import Week5.Assignment3.model.Dictionary;

public class DictionaryController {
    private Dictionary model;

    public DictionaryController(Dictionary model) {
        this.model = model;

        // Temporary: add some words and meanings to the dictionary
        model.addWord("Java", "A high-level, class-based programming language.");
        model.addWord("Python", "A high-level programming language with dynamic typing.");
        model.addWord("Dictionary", "A collection of words and their meanings.");
    }

    // Method to search for a word
    public String searchForWord(String word) {
        if (word == null || word.trim().isEmpty()) {
            return "Please enter a word.";
        }

        String meaning = model.searchWord(word);
        if (meaning != null) {
            return meaning;
        } else {
            return "Word not found.";
        }
    }
}
