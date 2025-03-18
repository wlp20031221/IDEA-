package org.example;

/**
 * @author 作者
 * @create 2025-03-18-15:43
 */
public class ShapeAnalyzer {
    public static String analyzeShapes(int x, int y) {
        if (x <= 0 || y <= 0) {
            return "输入不符合要求。";
        } else if (x == y) {
            return "可以构建圆形或正方形";
        } else {
            int delta = Math.abs(x - y);
            if (delta > 5) {
                return "可以构建矩形";
            } else if (delta > 2) {
                return "可以构建椭圆";
            } else {
                return "可以构建长方形";
            }
        }
    }
}
