package com.github.zipcodewilmington.sample;

import java.util.Arrays;
import java.util.Scanner;

public class WordGuess {
    Scanner input = new Scanner(System.in);
    int strikeCount = 0;
    public void runGame() {
        WordGuess wordGuess =new WordGuess();

        //array of string
        String[] words = {"cat", "dog", "bog", "cut"};

        //we generate random no and look secret word by passing the random number to words array
        String secret_word = words[(int) (Math.random() * words.length)];
        System.out.println("This is the secret word ->" + secret_word);
        // we need to transform chosen words to an arr of char
        char[] wordArray = secret_word.toCharArray();
        //wordArray -> ['d','o','g','s']
        //an array to hols the player guess in
        char[] outputArray = new char[secret_word.length()];
        Arrays.fill(outputArray, '_');
        //['_','_','_','_']
        guessGames(wordArray, outputArray);
    }

    public void guessGames(char[] wordArray, char[] outputArray) {
        while (ask_To_play_Again()) {
            announce_game();
            // Before the game begins, we are setting it to false( Since the player hasn't guessed yet)
            boolean isWordGuessed = false;
            //isWordGuessed-> true-> word is guess -> game end
            //isWordGuessed -> false -> player hasn't successfully guessed the word, so continue the game
            while (!isWordGuessed) {
                //ask for a guess (a single letter)
                System.out.println("Enter a single character: ");
                char userInput = input.next().charAt(0);//TODO:
                strikeCount++;
                System.out.println("You have "+ strikeCount+ " left!");

                for(int i=0; i<wordArray.length;i++){
                    //check the letter against the word
                    if(userInput == wordArray[i]){
                        //using the two character arrays discussed above
                        outputArray[i] = userInput;
                    }
                }
                System.out.println("Current guess: " + Arrays.toString(outputArray));
                if(outputArray == wordArray){
                    player_won();
                }
                if (strikeCount>4){
                    player_lost_tooManyGuess();
                }
            }
            ask_To_play_Again();
        }
        player_Lost();
    }


    public void announce_game() {
        System.out.println("Let's Play Word Guess version 1.0");

    }

    public void player_Lost() {
        System.out.println("Game over");
    }

    public void player_won() {
        System.out.println("Congratulations, You Won!");
    }

    public void player_lost_tooManyGuess() {
        System.out.println("You Lost! You ran out of guesses.");
    }

    public boolean ask_To_play_Again() {
        System.out.println("Do you want to play again? Enter 'Y' to play or 'N' to quit");
        String selection = input.nextLine();
        if (selection.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }
}


    
