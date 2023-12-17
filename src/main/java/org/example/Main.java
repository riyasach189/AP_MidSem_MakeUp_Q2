package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String pan_input;

        while(flag)
        {
            System.out.println("Enter the PAN: ");
            pan_input = scanner.next();

            try {
                PAN pan = new PAN(pan_input);
                System.out.println("Verified!");
                flag = false;
            }

            catch (IncorrectPanException e)
            {
                System.out.println(e);
                System.out.println(e.getMessage());
            }

        }

    }
}