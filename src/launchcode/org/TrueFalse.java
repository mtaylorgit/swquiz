package launchcode.org;

import java.util.ArrayList;

public class TrueFalse extends Question {

    Boolean correctAnswer;
    //Constructor
    public TrueFalse(String text, Boolean CorrectAnswer) {
        super.setQuestion(text + "\n" + "True or False"); //this prints the question and the possible choices
        this.correctAnswer = CorrectAnswer;//
    }





    public boolean checkAnswers(Boolean userAnswer) {
        //Returns true if they answered correctly
        if (userAnswer == this.correctAnswer) {
            return true;
        } else {
            return false;
        }
    }


}
