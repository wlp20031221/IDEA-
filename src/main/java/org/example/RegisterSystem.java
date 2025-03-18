package org.example;

/**
 * @author 作者
 * @create 2025-03-18-22:56
 */
public class RegisterSystem {
    public static String register(String username, String password) {
        // 第一层判断：用户名格式验证（模拟流程图菱形框）
        if (!username.matches("[a-zA-Z]{8}")) {
            return "用户名不符合要求";  // 右侧分支输出
        }

        // 第二层判断：密码格式验证（模拟流程图垂直流程链）
        if (!password.matches("\\d{6,}")) {
            return "密码不符合要求";    // 右侧分支输出
        }

        // 最终成功路径（主流程底部输出）
        return "注册成功";
    }
}