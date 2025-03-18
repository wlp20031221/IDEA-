package org.example;

import static org.junit.Assert.*;

/**
 * @author 作者
 * @create 2025-03-18-17:09
 */
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class StringProcessorTest {
    private final String input;
    private final String expected;

    // 参数化构造函数
    public StringProcessorTest(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    // 测试数据集（覆盖所有分支）
    @Parameterized.Parameters(name = "{0} -> {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"abtest", "替换前缀后的字符串为:eftest"},   // 分支1
                {"testcd", "替换cd后的字符串为:testgh"},    // 分支2
                {"test", "大写字母的字符串为:TEST"},        // 分支3
                {"abcd", "替换前缀后的字符串为:efcd"},      // 验证仅替换前缀
                {"cdcdcd", "替换cd后的字符串为:ghghgh"}    // 验证多次替换
        });
    }

    @Test
    public void testAllConditions() {
        assertEquals(expected, StringProcessor.process(input));
    }
}