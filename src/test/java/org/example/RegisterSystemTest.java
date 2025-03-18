package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 作者
 * @create 2025-03-18-22:56
 */

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class RegisterSystemTest {
    // 主成功路径测试（对应流程图主流程）
    @Test
    public void testValidCase() {
        String result = RegisterSystem.register("abcdefgh", "123456");
        assertThat(result, containsString("注册成功"));
    }

    // 用户名分支测试（右侧错误路径）
    @Test
    public void testUsernameInvalid() {
        String result1 = RegisterSystem.register("abcd1234", "123456"); // 非纯字母
        String result2 = RegisterSystem.register("short", "123456");    // 长度不足
        assertThat(result1, containsString("用户名不符合要求"));
        assertThat(result2, containsString("用户名不符合要求"));
    }

    // 密码分支测试（右侧错误路径）
    @Test
    public void testPasswordInvalid() {
        String result1 = RegisterSystem.register("abcdefgh", "12345");  // 长度不足
        String result2 = RegisterSystem.register("abcdefgh", "字母密码"); // 非纯数字
        assertThat(result1, containsString("密码不符合要求"));
        assertThat(result2, containsString("密码不符合要求"));
    }
}