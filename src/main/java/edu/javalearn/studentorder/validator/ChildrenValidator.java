package edu.javalearn.studentorder.validator;

import edu.javalearn.studentorder.domain.children.AnswerChildren;
import edu.javalearn.studentorder.domain.StudentOrder;

public class ChildrenValidator {
    public String hostName;
    public String login;
    public String password;
  public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Children Check is running: " + hostName + "," + login + "," + password);
        AnswerChildren ansChild = new AnswerChildren();
        return ansChild;
    }
}
