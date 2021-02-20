package com.company;

public class Main {

    public static void main(String[] args) {
        String paragraph="THE BOY WHO LIVED \n" +
                "\n" +
                "Mr. and Mrs. Dursley, of number four, Privet Drive, \n" +
                "were proud to say that they were perfectly normal, \n" +
                "thank you very much. They were the last people you’d \n" +
                "expect to be involved in anything strange or \n" +
                "mysterious, because they just didn’t hold with such \n" +
                "nonsense. \n" +
                "\n" +
                "Mr. Dursley was the director of a firm called \n" +
                "Grunnings, which made drills. He was a big, beefy \n" +
                "man with hardly any neck, although he did have a \n" +
                "very large mustache. Mrs. Dursley was thin and \n" +
                "blonde and had nearly twice the usual amount of \n" +
                "neck, which came in very useful as she spent so \n" +
                "much of her time craning over garden fences, spying \n" +
                "on the neighbors. The Dursley s had a small son \n" +
                "called Dudley and in their opinion there was no finer \n" +
                "boy anywhere.";
        paragraph=paragraph.replaceAll("\\n", "");
        paragraph=paragraph.replaceAll("[^A-Za-z ]", "");
        String[] words=paragraph.split(" ");
        //System.out.println(words[99] + " " + words[100] + " " + words[101]);
        for (int i = 0; i < words.length; i++) {
            if(words[i].charAt(0) == 'a' && words[i].length() > 3 && words[i].length() < 8){
                System.out.println(words[i]);
            }
        }
    }
}
