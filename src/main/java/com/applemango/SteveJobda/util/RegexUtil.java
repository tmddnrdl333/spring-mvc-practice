package com.applemango.SteveJobda.util;

import java.util.regex.Pattern;

public class RegexUtil {
    public static boolean checkId(String text) {
        // 숫자, 문자 포함 4~12자리
        String pattern = "^[a-zA-Z0-9]{4,12}$";
        if (Pattern.matches(pattern, text)) {
            return true;
        }
        return false;
    }

    public static boolean checkPassword(String text) {
        // 숫자, 문자, 특수문자 ( !@#$%^&*()._- ) 포함 6~15자리
        String pattern = "^(?=.*[0-9a-zA-Z])[a-zA-Z0-9!@#$%^&*()._-]{6,15}$";
        if (Pattern.matches(pattern, text)) {
            return true;
        }
        return false;
    }
}
