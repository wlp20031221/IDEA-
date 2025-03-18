package org.example;

/**
 * @author 作者
 * @create 2025-03-18-23:09
 */
public class ShapeChecker {
    public static String checkShape(int x, int y) {
        // 第一层判断：x和y均为正数（对应流程图菱形框）
        if (x <= 0 || y <= 0) {
            return "输入不符合要求";  // 右侧错误分支
        }

        // 第二层判断：x等于y（主流程向下延伸）
        if (x == y) {
            return "可以构建圆形或正方形";  // 右侧虚线框输出
        }

        // 计算差值（主流程继续向下）
        int delta = Math.abs(x - y);

        // 第三层判断：delta>5（菱形框）
        if (delta > 5) {
            return "可以构建矩形";  // 左侧分支
        }

        // 第四层判断：delta>2（菱形框）
        if (delta > 2) {
            return "可以构建椭圆";  // 左侧分支
        }

        // 默认路径
        return "可以构建长方形";  // 最下方分支
    }
}