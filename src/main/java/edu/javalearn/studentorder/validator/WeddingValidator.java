package edu.javalearn.studentorder.validator;

import edu.javalearn.studentorder.domain.wedding.AnswerWedding;
import edu.javalearn.studentorder.domain.StudentOrder;

public class WeddingValidator {
    public String hostName;
    public String login;
    public String password;

   public AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("Wedding is running: " + hostName + "," + login + "," + password);
        AnswerWedding answed = new AnswerWedding();
        return answed;
    }
}
