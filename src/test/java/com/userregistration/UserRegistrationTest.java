package com.userregistration;


import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    //@DisplayName("FirstName Check")
    public void checkGivenFirstName(){

        UserRegistration userNameTest = new UserRegistration();
        Boolean result =userNameTest.getFirstName("Arindam");
        Assert.assertTrue(result);

    }

    @Test
    public void check_Given_First_Name_(){

        UserRegistration userNameTest = new UserRegistration();
        Boolean result =userNameTest.getFirstName("arin");
        Assert.assertTrue(result);

    }

    @Test
    //@DisplayName("LastName Check")
    public void checkGivenLastName(){

        UserRegistration userNameTest = new UserRegistration();
        Boolean result =userNameTest.getLastName("Saha");
        Assert.assertTrue(result);

    }

    @Test
    public void check_Given_Last_Name_() {

        UserRegistration userNameTest = new UserRegistration();
        Boolean result = userNameTest.getLastName("aha");
        Assert.assertTrue(result);
    }

    @Test
    //@DisplayName("Email Check")
    public void check_Given_Email_Address(){

        UserRegistration userNameTest = new UserRegistration();
        Boolean result =userNameTest.getEmail("asaha15071998@gmail.com");
        Assert.assertTrue(result);

    }

    @Test
    public void check_Given_EmailAddress(){

        UserRegistration userNameTest = new UserRegistration();
        Boolean result =userNameTest.getEmail("asaha15071998gmail.com");
        Assert.assertTrue(result);

    }

    @Test
    //@DisplayName("PhoneNumber Check")
    public void check_Given_Phone_Number(){

        UserRegistration phoneNumberTest = new UserRegistration();
        Boolean result =phoneNumberTest.getPhoneNumber("91 7080907020");
        Assert.assertTrue(result);

    }

    @Test
    public void check_Given_PhoneNumber(){

        UserRegistration phoneNumberTest = new UserRegistration();
        Boolean result =phoneNumberTest.getPhoneNumber("91 798021156558");
        Assert.assertTrue(result);

    }

    @Test
    //@DisplayName("Password Check Rule 1")
    public void check_Given_Password_Rule1(){

        UserRegistration password_Test = new UserRegistration();
        Boolean result = password_Test.getPasswordRule1("arindamsaha");
        Assert.assertTrue(result);

    }

    @Test
    public void check_Given_PasswordRule1(){

        UserRegistration password_Test = new UserRegistration();
        Boolean result = password_Test.getPasswordRule1("arind");
        Assert.assertTrue(result);

    }

    @Test
    //@DisplayName("Password Check Rule 2")
    public void check_Given_Password_Rule2(){

        UserRegistration password_Test = new UserRegistration();
        Boolean result = password_Test.getPasswordRule2("arinASdamsaha");
        Assert.assertTrue(result);

    }

    @Test
    public void check_Given_PasswordRule2(){

        UserRegistration password_Test = new UserRegistration();
        Boolean result = password_Test.getPasswordRule2("arindamsaha");
        Assert.assertTrue(result);

    }

    @Test
    //@DisplayName("Password Check Rule 3")
    public void check_Given_Password_Rule3(){

        UserRegistration password_Test = new UserRegistration();
        Boolean result = password_Test.getPasswordRule3("arinASd1556amsaha");
        Assert.assertTrue(result);

    }

    @Test
    public void check_Given_PasswordRule3(){

        UserRegistration password_Test = new UserRegistration();
        Boolean result = password_Test.getPasswordRule3("arinASdamsaha");
        Assert.assertTrue(result);

    }

    @Test
    //@DisplayName("Password Check Rule 4")
    public void check_Given_Password_Rule4(){

        UserRegistration password_Test = new UserRegistration();
        Boolean result = password_Test.getPasswordRule4("arinASd1556@amsaha");
        Assert.assertTrue(result);

    }

    @Test
    public void check_Given_PasswordRule4(){

        UserRegistration password_Test = new UserRegistration();
        Boolean result = password_Test.getPasswordRule4("arinASd1amsaha");
        Assert.assertTrue(result);

    }


}

