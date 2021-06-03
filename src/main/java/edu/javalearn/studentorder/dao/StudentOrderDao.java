package edu.javalearn.studentorder.dao;

import edu.javalearn.studentorder.domain.StudentOrder;
import edu.javalearn.studentorder.exception.DaoException;

import java.util.List;

public interface StudentOrderDao {
    Long saveStudentOrder (StudentOrder so) throws DaoException;

    List<StudentOrder> getStudentOrders() throws DaoException;
}
