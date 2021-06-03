package edu.javalearn.studentorder.validator;

import edu.javalearn.studentorder.domain.student.AnswerStudent;
import edu.javalearn.studentorder.domain.StudentOrder;

public class StudentValidator {
    public String hostName;
    public String login;
    public String password;

   public AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Студенты проверяются: " + hostName + "," + login + "," + password);
        AnswerStudent answerstud = new AnswerStudent();
        return answerstud;
    }
}
