package edu.javalearn.studentorder.validator.register;

import edu.javalearn.studentorder.domain.register.CityRegisterResponse;
import edu.javalearn.studentorder.domain.Person;
import edu.javalearn.studentorder.exception.CityRegisterException;
import edu.javalearn.studentorder.exception.TransportException;

public class RealCityRegisterChecker implements CityRegisterChecker {
    public CityRegisterResponse checkPerson(Person person)throws CityRegisterException, TransportException {
        return null;
    }
}
