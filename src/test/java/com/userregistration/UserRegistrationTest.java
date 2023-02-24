package com.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    @DisplayName("FirstName Check")
    public void checkGivenFirstName(){

        UserRegistration userNameTest = new UserRegistration();
        Boolean result =userNameTest.getFirstName("Arindam");
        Assertions.assertTrue(result);

    }

    @Test
    @DisplayName("LastName Check")
    public void checkGivenLastName(){

        UserRegistration userNameTest = new UserRegistration();
        Boolean result =userNameTest.getLastName("Saha");
        Assertions.assertTrue(result);

    }

    @Test
    @DisplayName("Email Check")
    public void check_Given_Email_Address(){

        UserRegistration userNameTest = new UserRegistration();
        Boolean result =userNameTest.getEmail("asaha15071998@gmail.com");
        Assertions.assertTrue(result);

    }

    @Test
    @DisplayName("PhoneNumber Check")
    public void check_Given_Phone_Number(){

        UserRegistration phoneNumberTest = new UserRegistration();
        Boolean result =phoneNumberTest.getPhoneNumber("91 7080907020");
        Assertions.assertTrue(result);

    }

    @Test
    @DisplayName("Password Check Rule 1")
    public void check_Given_Password_Rule1(){

        UserRegistration password_Test = new UserRegistration();
        Boolean result = password_Test.getPasswordRule1("arindamsaha");
        Assertions.assertTrue(result);

    }

    @Test
    @DisplayName("Password Check Rule 2")
    public void check_Given_Password_Rule2(){

        UserRegistration password_Test = new UserRegistration();
        Boolean result = password_Test.getPasswordRule2("arinASdamsaha");
        Assertions.assertTrue(result);

    }

    @Test
    @DisplayName("Password Check Rule 3")
    public void check_Given_Password_Rule3(){

        UserRegistration password_Test = new UserRegistration();
        Boolean result = password_Test.getPasswordRule3("arinASd1556amsaha");
        Assertions.assertTrue(result);

    }



}

