package com.github.zipcodewilmington.sample;

import java.util.Scanner;

public class WordGuess {
    public void runGame() {
        WordGuess wordGuess =new WordGuess();

        //array of string
        String[] words = {"cat", "dogs", "bog", "cut"};

        //we generate random no and look secret word by passing the random number to words array
        String secret_Word = words[(int) (Math.random() * words.length)];
        // we need to transform chosen words to an arr of char
        char[] wordArray = secret_Word.toCharArray();
        //an array to hols the player guess in
        char[] guessNum = new char[secret_Word.length()];

    }

    public void guessGames(){
        while(ask_To_play_Again()) {
            announce_game();

//            set word guessed to false
            boolean success = false;
//            while (the word isn't guessed) { //inner loop
            for ()
//            print the current game state
//            ask for a guess (a single letter)
//
//            check the letter against the word
//            using the two character arrays discussed above
//            increment the number of guesses
//
//            if the word is guessed
//            player won, congrats
//
//            if too many guesses
//            player lost, too bad, quit game
        }
        //ask if player wants to play again
    }
    //display game over


    public void announce_game() {
        System.out.println("Let's Play Word Guess version 1.0");

    }

    public void playerLost() {
        System.out.println("Game over");
    }

    public void player_won() {
        System.out.println("Congratulations, You Won!");
    }

    public void player_lost() {
        System.out.println("You Lost! You ran out of guesses.");
    }

    public boolean ask_To_play_Again(){
        System.out.println("Do you want to play again? Enter 'Y' to play or 'N' to quit" );
        //scanner add -> ask for Y or N
        //if Y -> return true else -> false
        return true;
    }



}


    
