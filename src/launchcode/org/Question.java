package launchcode.org;

import java.util.ArrayList;

public abstract class Question {

    //Fields
    private String questionText;

    //Constructor - decided to move this into subclasses and provide the choices and actual answers
//    public Question(String text) {
//        this.questionText = text;
//    }

    //Getters and setters
    public String getQuestionText() {
        //returns the question text for the quiz
        return this.questionText;
    }
  public void setQuestion(String text) {
        this.questionText = text;
  }

    //Methods






}
