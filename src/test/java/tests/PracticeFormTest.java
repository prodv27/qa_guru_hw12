package tests;

import org.junit.jupiter.api.*;
import pages.RegistrationPage;

import static utils.FakerData.*;

public class PracticeFormTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Tag("remote")
    @Test
    @DisplayName("Проверка заполнения формы")
    void fillFormTest() {

        registrationPage.openPage()
                .removeBanners()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(userEmail)
                .setGender(userGender)
                .setNumber(userNumber)
                .setBirthDate(day, month, year)
                .setSubject(userSubject)
                .setHobbies(userHobbies)
                .uploadFile(userFile)
                .setAddress(userAddress)
                .setState(userState)
                .setCity(userCity)
                .clickSubmit();

        registrationPage.verifyResultsModalAppears()
                .verifyResult("Student Name", firstName + " " + lastName)
                .verifyResult("Student Email", userEmail)
                .verifyResult("Gender", userGender)
                .verifyResult("Mobile", userNumber)
                .verifyResult("Date of Birth", day + " " + month + "," + year)
                .verifyResult("Subjects", userSubject)
                .verifyResult("Hobbies", userHobbies)
                .verifyResult("Picture", userFile)
                .verifyResult("Address", userAddress)
                .verifyResult("State and City", userState + " " + userCity);
    }

    @Tag("remote")
    @Test
    @DisplayName("Специально настроенный на failed тест")
    void checkFailResult() {
        boolean a = false;
        Assertions.assertTrue(a);
    }

    @Disabled
    @Tag("remote")
    @Test
    @DisplayName("Специально настроенный на skipped тест")
    void checkSkippedResult() {
        boolean a = false;
        Assertions.assertTrue(a);
    }
}