package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean getFirstName(String userName){

        String userNameRegex = "^[A-Z]{1}[a-z]{3,}";
        Pattern pattern = Pattern.compile(userNameRegex);

        Matcher matcher = pattern.matcher(userName);
        boolean result = matcher.matches();

        return result;

    }


}
