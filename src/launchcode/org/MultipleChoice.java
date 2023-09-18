package launchcode.org;

import java.util.ArrayList;

public class MultipleChoice extends Question {

    ArrayList<String> correctAnswers = new ArrayList<>();
    //Constructor
    public MultipleChoice(String text, ArrayList<String> choices, ArrayList<String> CorrectAnswers) {
        //super.setQuestion(text + "\n" + choices.toString());
        text+="\n____________";
        for(int i=0; i<choices.size();i++){
            text+="\n" + choices.get(i);
        }
        super.setQuestion(text);
        //this prints the question and the possible choices
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
