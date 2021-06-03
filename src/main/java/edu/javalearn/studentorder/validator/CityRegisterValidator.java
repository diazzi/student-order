package edu.javalearn.studentorder.validator;

import edu.javalearn.studentorder.domain.Person;
import edu.javalearn.studentorder.domain.register.AnswerCityRegister;
import edu.javalearn.studentorder.domain.Child;
import edu.javalearn.studentorder.domain.register.AnswerCityRegisterItem;
import edu.javalearn.studentorder.domain.register.CityRegisterResponse;
import edu.javalearn.studentorder.domain.StudentOrder;
import edu.javalearn.studentorder.exception.CityRegisterException;
import edu.javalearn.studentorder.exception.TransportException;
import edu.javalearn.studentorder.validator.register.CityRegisterChecker;
import edu.javalearn.studentorder.validator.register.FakeCityRegisterChecker;

public class CityRegisterValidator {
    public static final String IN_CODE = "NO_GRN";
    private final CityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        AnswerCityRegister ans = new AnswerCityRegister();

        ans.addItem(checkPerson(so.getHusband()));
        ans.addItem(checkPerson(so.getWife()));
        for (Child child : so.getChildren()) {
            ans.addItem(checkPerson(child));
        }

        return ans;
    }

    private AnswerCityRegisterItem checkPerson(Person person) {
        AnswerCityRegisterItem.CityStatus status = null;
        AnswerCityRegisterItem.CityError error = null;
        try {
            CityRegisterResponse tmp = personChecker.checkPerson(person);
            status = tmp.isExisting() ?
                    AnswerCityRegisterItem.CityStatus.YES :
                    AnswerCityRegisterItem.CityStatus.NO;
        } catch (CityRegisterException ex) {
            ex.printStackTrace(System.out);
            status = AnswerCityRegisterItem.CityStatus.ERROR;
            error = new AnswerCityRegisterItem.CityError(ex.getCode(), ex.getMessage());
        } catch (TransportException ex) {
            ex.printStackTrace(System.out);
            status = AnswerCityRegisterItem.CityStatus.ERROR;
            error = new AnswerCityRegisterItem.CityError(IN_CODE, ex.getMessage());
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        AnswerCityRegisterItem ans = new AnswerCityRegisterItem(status, person, error);

        return ans;
    }
}
