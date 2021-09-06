package com.curtin.game.pracgrader.Fragments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidator {
    public static final int PIN_LENGTH = 4;
    public static final String PIN_REGEX = "^[0-9]*$";

    public static int validatePin(String pin) {
        Pattern p = Pattern.compile(PIN_REGEX);
        Matcher m = p.matcher(pin);

        if(pin.trim().length() == PIN_LENGTH && m.find()) {
            return 1;
        }
        return 0;
    }

    public static int validateUserName(String username) {
        /**Character length must be 8-24 characters must only container letters and
         * numbers ._ are allowed but username cannot start with it or be next to each other**/
        String regex = "^[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){6,22}[a-zA-Z0-9]$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(username);
        if(m.find()) {
            return 1;
        }
        return 0;
    }

    public static int validateEmail(String email) {
        /**Character length**/
        String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(email);
        if(!email.trim().equals("") && m.find()) {
            return 1;
        }
        return 0;
    }
}
