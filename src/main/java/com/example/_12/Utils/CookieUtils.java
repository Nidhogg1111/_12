package com.example._12.Utils;

import javax.servlet.http.Cookie;

public class CookieUtils {
    public static Cookie getCookie(Cookie[] cookies, String cookieName) {
        if (null != cookies) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(cookieName)) {
                    return cookie;
                }
            }
        }
        return null;
    }
}
