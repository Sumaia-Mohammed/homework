package project.Text;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\sasys\\TextAnalysis\\src\\Description");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null) {
            System.out.println(st);
        }

        Text sentence1 = new Text("I love learning ");
        Text sentence2 = new Text("We love programming ");
        Text sentence3 = new Text("Once upon a time, there was a beautiful princess");
        Text sentence4 = new Text("Computer programming needs someone with a logical mind");
        Text sentence5 = new Text("I can't do my job without a computer");

        Text word1 = new Text("Hi");
        Text word2 = new Text("Energy");
        Text word3 = new Text("Cool");
        Text word4 = new Text("Princess");

        List<Text> sentences = new ArrayList<>();
        sentences.add(sentence1);
        sentences.add(sentence2);
        sentences.add(sentence3);
        sentences.add(sentence4);
        sentences.add(sentence5);

        Set<Text> words = new HashSet<>();
        words.add(word1);
        words.add(word2);
        words.add(word3);
        words.add(word4);

        List<String> listSentence = new ArrayList<>();
        int longest_length = 0;
        for (Text s : sentences) {
            s.introduceSentences();
            int length = s.getName().length();
            if (length > longest_length) {
                longest_length = length;
                listSentence.clear();
            }
            if (length == longest_length) {
                listSentence.add(s.getName());
            }
        }
        System.out.println("The Longest sentence of the above dictionary: " + listSentence + longest_length + " Letter");
        System.out.println("The Amount of the sentences" + " " + sentences.size());

        List<String> listWord = new ArrayList<>();
        int longestLength = 0;
        for (Text w : words) {
            w.introduce();
            int length = w.getName().length();
            if (length > longestLength) {
                longestLength = length;
                listWord.clear();
            }
            if (length == longestLength) {
                listWord.add(w.getName());
            }
        }
        System.out.println("The Longest word of the above dictionary: " + listWord + longestLength + " Letter");
        System.out.println("The Amount of the words" + " " + words.size());

        MostFrequentWords.createQueue();
        MostFrequentWords.queue.iterator();
        int mal = 5 ;
        while (!MostFrequentWords.queue.iterator().next().getWord().isEmpty()&&mal>0) {
            System.out.println(MostFrequentWords.queue.poll());
            mal--;
        }
    }
}
