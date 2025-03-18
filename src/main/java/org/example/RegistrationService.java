package org.example;

/**
 * @author 作者
 * @create 2025-03-18-16:45
 */
public class RegistrationService {
    public String register(String username, String password) {
        if (!username.matches("[a-zA-Z]{8}")) {
            return "用户名不符合要求";
        }
        if (!password.matches("\\d{6,}")) {
            return "密码不符合要求";
        }
        return "注册成功";
    }
}
