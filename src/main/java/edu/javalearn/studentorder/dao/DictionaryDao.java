package edu.javalearn.studentorder.dao;
import edu.javalearn.studentorder.domain.CountryArea;
import edu.javalearn.studentorder.domain.PassportOffice;
import edu.javalearn.studentorder.domain.RegisterOffice;
import edu.javalearn.studentorder.domain.Street;
import edu.javalearn.studentorder.exception.DaoException;

import java.util.List;

public interface DictionaryDao {
    List<Street> findStreets(String pattern) throws DaoException;
    List<PassportOffice> findPassportOffices(String areaId) throws DaoException;
    List<RegisterOffice> findRegisterOffices(String areaId) throws DaoException;
    List<CountryArea> findAreas(String areaId) throws DaoException;

}
