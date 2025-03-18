package org.example;

/**
 * @author 作者
 * @create 2025-03-18-23:04
 */
public class BonusCalculator {
    public static String calculateBonus(int profit) {
        double bonus = 0;
        // 第一档
        if (profit > 10) {
            bonus += 10 * 0.1;
        } else {
            bonus += profit * 0.1;
            return formatResult(bonus);
        }

        // 第二档
        if (profit > 20) {
            bonus += 10 * 0.075;
        } else {
            bonus += (profit - 10) * 0.075;
            return formatResult(bonus);
        }

        // 第三档
        if (profit > 40) {
            bonus += 20 * 0.05;
        } else {
            bonus += (profit - 20) * 0.05;
            return formatResult(bonus);
        }

        // 第四档
        if (profit > 60) {
            bonus += 20 * 0.03;
        } else {
            bonus += (profit - 40) * 0.03;
            return formatResult(bonus);
        }

        // 第五档
        if (profit > 100) {
            bonus += 40 * 0.015;
            bonus += (profit - 100) * 0.01; // 第六档
        } else {
            bonus += (profit - 60) * 0.015;
        }

        return formatResult(bonus);
    }

    private static String formatResult(double bonus) {
        return String.format("总提成：%.1f万", bonus);
    }
}