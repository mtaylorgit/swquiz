package launchcode.org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! here goes");

        ArrayList<String>Answers= new ArrayList<>(Arrays.asList("Helped capture Darth Maul","Killed Grand Moff Tarkin","Helped Darth Vader overthrow Palpatine"));
        ArrayList<String>correctAnswer=new ArrayList<>(Arrays.asList("Helped capture Darth Maul"));

        MultipleChoice Question1= new MultipleChoice("Ahsoka Tano once:",  Answers , correctAnswer) ;

        System.out.println(Question1.getQuestionText());
        Scanner scanner  = new Scanner(in);
        String userAnswer=scanner.nextLine();
        ArrayList<String> theUserAnswer=new ArrayList<>(Arrays.asList(userAnswer));
        if(Question1.checkAnswers(theUserAnswer)==true){
            System.out.println("You got it right!");
        }else {
            System.out.println("That is so wrong!");
        };


    }


}