package com.epam.project2.controller;

import com.epam.project2.model.entity.Sentence;
import com.epam.project2.model.entity.Symbol;
import com.epam.project2.model.entity.Text;
import com.epam.project2.model.entity.Word;
import com.epam.project2.service.InputFileReader;
import com.epam.project2.service.Sort;
import com.epam.project2.service.TextAnalyzer;
import com.epam.project2.view.ConsoleView;

import java.util.Arrays;
import java.util.Map;

/**
 * Created by Orest
 * 04.12.2017
 * Java Version 1.8.
 */
public class Controller {
    private ConsoleView view;

    public Controller(ConsoleView view) {
        this.view = view;
    }

    public void go(){
        InputFileReader inputFileReader = new InputFileReader("D:/1.txt");
        String result = TextAnalyzer.replaceSpaces(inputFileReader.readFromFile());
        Text text = new Text();
        for (String s : TextAnalyzer.getSentencesList(result)) {
            Sentence sentence  = new Sentence();
            for (String element : TextAnalyzer.parseBySpaces(s)) {
                Word word = new Word();
                for (char symbol : TextAnalyzer.getEachSymbol(element)) {
                    word.addSymbol(new Symbol(symbol));
                }
                sentence.addWord(word);
            }
            //System.out.println(TextAnalyzer.parseByWord(s));
            text.put(sentence,TextAnalyzer.parseByWord(s).size());
        }
        for (Map.Entry<Sentence, Integer> pair : Sort.getSortResult(text.getMap()).entrySet()) {
            view.print(pair.getKey() + " = " + pair.getValue());
        }
    }
}
