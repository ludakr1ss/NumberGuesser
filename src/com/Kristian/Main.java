package com.Kristian;


import javax.swing.*;

class GuessingGame {
    public static void main(String[] args) {
        int userInput = 0;
        int randomNumber = (int) (Math.random()*100 + 1);
        System.out.println("The correct guess is " + randomNumber);
        int count = 1;

        while (userInput != randomNumber) {
            String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100", 3);
            userInput = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, ""+ determineGuess(userInput, randomNumber, count));
            count++;
        }
    }

    private static String determineGuess(int userInput, int randomNumber, int count) {
        if (userInput <= 0 || userInput > 100) {
            return "Your guess is invalid";
        }
        else if (userInput == randomNumber) {
            return "Correct! \n Total Guesses: " + count;
        }
        else if (userInput == 69) {
        return "Nice! But not right number \n Try number";
    }
        else if (userInput > randomNumber) {
            return "Your guess is too high, try again. \n Try number: " + count;
        }
        else if (userInput < randomNumber) {
            return "Your guess is too low, try again. \n Try number: " + count;
        }
        else if (userInput == 69 && userInput == randomNumber) {
            return "Nice!";
        }
        else {
            return "Your guess is incorrect \n Try number:" + count;
        }
    }

}
