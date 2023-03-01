package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    //First Name True Check
    public void check_Given_First_Name_is_Valid_True(){

        UserRegistration userNameTest = new UserRegistration();
        Boolean result = userNameTest.getFirstName("Arindam");
        Assert.assertTrue(result);

    }
    @Test
    //First Name False Check
    public void check_Given_First_Name_is_Not_Valid_False(){

        UserRegistration userNameTest = new UserRegistration();
        Boolean result = userNameTest.getFirstName("indam");
        Assert.assertTrue(result);

    }

    @Test
    //Last Name True Check
    public void check_Given_Last_Name_is_Valid_True(){

        UserRegistration userNameTest = new UserRegistration();
        Boolean result =userNameTest.getLastName("Saha");
        Assert.assertTrue(result);

    }

    @Test
    //Last Name False Check
    public void check_Given_Last_Name_is_Not_Valid_False(){

        UserRegistration userNameTest = new UserRegistration();
        Boolean result =userNameTest.getLastName("aha");
        Assert.assertTrue(result);

    }


    @Test
    //Email True Check
    public void check_Given_Email_Address_is_Valid_True(){

        UserRegistration userNameTest = new UserRegistration();
        Boolean result =userNameTest.getEmail("asaha15071998@gmail.com");
        Assert.assertTrue(result);

    }

    @Test
    //Email False Check
    public void check_Given_Email_Address_is_Not_Valid_False(){

        UserRegistration userNameTest = new UserRegistration();
        Boolean result =userNameTest.getEmail("asaha1507199gmail.com");
        Assert.assertTrue(result);

    }


    @Test
    //Check Phone Number
    public void check_Given_Phone_Number_is_Valid_True(){

        UserRegistration phoneNumberTest = new UserRegistration();
        Boolean result =phoneNumberTest.getPhoneNumber("91 7080907020");
        Assert.assertTrue(result);

    }

    @Test
    //Check Phone Number False
    public void check_Given_Phone_Number_is_Not_Valid_False(){

        UserRegistration phoneNumberTest = new UserRegistration();
        Boolean result =phoneNumberTest.getPhoneNumber("91 7086");
        Assert.assertTrue(result);

    }

    @Test
    //Check password true
    public void check_Given_Password_is_Valid_True(){

        UserRegistration password_Test = new UserRegistration();
        Boolean result = password_Test.getPassword("arindamAr@1566");
        Assert.assertTrue(result);

    }

    @Test
    //Check Password False Rule 1
    public void check_Given_Password_is_Not_Valid_Rule1(){

        UserRegistration password_Test = new UserRegistration();
        Boolean result = password_Test.getPassword("arin");
        Assert.assertTrue(result);

    }

    @Test
    //Check Password False Rule 2
    public void check_Given_Password_is_Not_Valid_Rule2(){

        UserRegistration password_Test = new UserRegistration();
        Boolean result = password_Test.getPassword("arindamsaha");
        Assert.assertTrue(result);

    }

    @Test
    //Check Password False Rule 3
    public void check_Given_Password_is_Not_Valid_Rule3(){

        UserRegistration password_Test = new UserRegistration();
        Boolean result = password_Test.getPassword("AarinKashi");
        Assert.assertTrue(result);

    }
    @Test
    //Check Password False Rule 4
    public void check_Given_Password_is_Not_Valid_Rule4(){

        UserRegistration password_Test = new UserRegistration();
        Boolean result = password_Test.getPassword("arinDaM123saHa");
        Assert.assertTrue(result);

    }




}

