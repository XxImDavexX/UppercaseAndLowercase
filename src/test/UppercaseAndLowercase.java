package test;

import java.util.Scanner;

public class UppercaseAndLowercase {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      String sentence, option;
      
        System.out.println("Insert the sentence");
        sentence = keyboard.nextLine();
        System.out.println("Select the option to convert the sentence: ");
        System.out.println("Press u to uppercase or l to lowercase");
        option = keyboard.nextLine();
        switch(option){
            case "u":
                System.out.println(sentence.toUpperCase());
                break;
            case "l":
                System.out.println(sentence.toLowerCase());
                break;
            default:
                System.out.println("This option is not available");
        }
    }
}
