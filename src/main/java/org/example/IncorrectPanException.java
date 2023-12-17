package org.example;

public class IncorrectPanException extends Exception{
    public IncorrectPanException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "IncorrectPanException";
    }
}
