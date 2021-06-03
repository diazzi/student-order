package edu.javalearn.studentorder;

import edu.javalearn.studentorder.domain.*;
import edu.javalearn.studentorder.domain.children.AnswerChildren;
import edu.javalearn.studentorder.domain.register.AnswerCityRegister;
import edu.javalearn.studentorder.domain.student.AnswerStudent;
import edu.javalearn.studentorder.domain.wedding.AnswerWedding;
import edu.javalearn.studentorder.mail.MailSender;
import edu.javalearn.studentorder.validator.ChildrenValidator;
import edu.javalearn.studentorder.validator.CityRegisterValidator;
import edu.javalearn.studentorder.validator.StudentValidator;
import edu.javalearn.studentorder.validator.WeddingValidator;

import java.util.LinkedList;
import java.util.List;

public class StudentOrderValidator {
    private final CityRegisterValidator cityRegisterValidator;
    private final WeddingValidator weddingValidator;
    private final ChildrenValidator childrenValidator;
    private final StudentValidator studentValidator;
    private final MailSender mailSender;

    public StudentOrderValidator() {
        cityRegisterValidator = new CityRegisterValidator();
        weddingValidator = new WeddingValidator();
        childrenValidator = new ChildrenValidator();
        studentValidator = new StudentValidator();
        mailSender = new MailSender();
    }

    public static void main(String[] args) {

        StudentOrderValidator studentOrderValidator = new StudentOrderValidator();
        studentOrderValidator.checkAll();

    }

    public void checkAll() {
        List<StudentOrder> soList = readStudentOrders();
        for (StudentOrder so : soList) {
            checkOneOrder(so);
        }
    }

    public List<StudentOrder> readStudentOrders() {
        List<StudentOrder> soList = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            StudentOrder so = SaveStudentOrder.buildStudentOrder(i);
            soList.add(so);
        }
        return soList;
    }

    public void checkOneOrder(StudentOrder so) {
        AnswerCityRegister cityAnswer = checkCityRegister(so);
//        AnswerWedding answerWedding = checkWedding(so);
//        AnswerChildren answerChildren = checkChildren(so);
//        AnswerStudent answerStudent = checkStudent(so);
//        sendMail(so);
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        return cityRegisterValidator.checkCityRegister(so);
    }

    public AnswerWedding checkWedding(StudentOrder so) {

        return weddingValidator.checkWedding(so);
    }

    public AnswerChildren checkChildren(StudentOrder so) {

        return childrenValidator.checkChildren(so);
    }

    public AnswerStudent checkStudent(StudentOrder so) {

        return studentValidator.checkStudent(so);
    }

    public void sendMail(StudentOrder so) {
        mailSender.sendMail(so);
    }
}
