package org.example;

/**
 * @author 作者
 * @create 2025-03-18-17:09
 */
public class StringProcessor {
    public static String process(String input) {
        // 条件1：前缀为ab
        if (input.startsWith("ab")) {
            String replaced = input.replaceFirst("ab", "ef");
            return "替换前缀后的字符串为:" + replaced;
        }

        // 条件2：后缀为cd且前缀不为ab
        if (input.endsWith("cd")) {
            String replaced = input.replaceAll("cd", "gh");
            return "替换cd后的字符串为:" + replaced;
        }

        // 默认条件：转为大写
        return "大写字母的字符串为:" + input.toUpperCase();
    }
}
