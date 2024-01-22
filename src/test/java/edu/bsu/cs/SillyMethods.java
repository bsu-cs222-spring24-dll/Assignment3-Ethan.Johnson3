package edu.bsu.cs;

public class SillyMethods {
    public boolean didGuess42(int guess) {
        return guess == 42;
    }

    public String countTo(int count) {
        if (count == 10)
            return ("0 1 2 3 4 5 6 7 8 9 10");
        else if (count == 15)
            return ("0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15");
        return ("no count");
    }
}
