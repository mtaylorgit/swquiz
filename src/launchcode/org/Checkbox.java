package launchcode.org;

import java.util.ArrayList;

public class Checkbox extends Question {

    ArrayList<String> correctAnswers = new ArrayList<>();
    //Constructor
    public Checkbox(String text, ArrayList<String> choices, ArrayList<String> CorrectAnswers) {
        super.setQuestion(text + "\n" + choices.toString()); //this prints the question and the possible choices
        this.correctAnswers = CorrectAnswers;//we created new arraylist above, and this sets it to the parameter
    }





    public boolean checkAnswers(ArrayList<String> userAnswers) {
        //Returns true if they answered correctly
        Integer correctCounter=0;
        for (int i = 0; i < userAnswers.size(); i++) {
            if (correctAnswers.contains(userAnswers.get(i))){
                correctCounter++;
            }else{
                return false;
            }
        }
        if (correctCounter == correctAnswers.size()) {
            return true;
        }else{
            return false;
        }
    }


}
