package org.example;

public class PAN {
    private String PAN;

    public PAN(String pan_input) throws IncorrectPanException {


        if (pan_input.length() != 10)
        {
            throw new IncorrectPanException("The length must be 10!");
        }

        else {
            this.PAN = pan_input;
        }
    }
}
