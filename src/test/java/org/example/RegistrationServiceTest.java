package org.example;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

/**
 * @author 作者
 * @create 2025-03-18-16:46
 */
public class RegistrationServiceTest {
    private RegistrationService service = new RegistrationService();

    @Test
    public void testValidUsernameAndPassword() {
        String result = service.register("abcdefgh", "123456");
        assertThat(result, containsString("注册成功"));
    }

    @Test
    public void testInvalidUsername() {
        String result = service.register("abcd1234", "123456");
        assertThat(result, containsString("用户名不符合要求"));
    }

    @Test
    public void testInvalidPassword() {
        String result = service.register("abcdefgh", "12345");
        assertThat(result, containsString("密码不符合要求"));
    }
}