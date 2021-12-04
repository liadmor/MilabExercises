package com.example.quoteapp;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Quotes {

    String [] getQuotes(){
        String[] quotes = new String[]{
                "you are braver than you believe",
                "A person’s a person, no matter how small",
                "No act of kindness, is ever wasted",
                "How lucky I am to have friends",
                "If you have good thoughts, they will shine out",
                "You have brains in your head.",
                "How much good inside a day? ",
                "what is essential is invisible to the eye",
                "There’s no place like home",
                "Why did you do all this for me?",
                "Listen to the mustn’ts, child.",
                "you cease forever to be able to do it.",
                "Above all watch with glittering eyes",
                "nothing is going to get better",
                "You find the fun and snap!",
                "It’s no use to go back to yesterday",
                "the smallest things take up your heart."};

        return quotes;
    }

    String getRandomeQuote(){
        String quote;
        int quoteArryLength, randomNum ;

        quoteArryLength= getQuotes().length;
        randomNum = ThreadLocalRandom.current().nextInt(quoteArryLength);
        quote = getQuotes()[randomNum];
        return quote;
    }
}