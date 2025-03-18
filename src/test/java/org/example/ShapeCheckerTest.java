package org.example;

import static org.junit.Assert.*;

/**
 * @author 作者
 * @create 2025-03-18-23:09
 */
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class ShapeCheckerTest {

    @ParameterizedTest(name = "x={0}, y={1} → {2}")  // 增强测试报告可读性
    @CsvSource({
            // 主成功路径
            "5, 5,  可以构建圆形或正方形",  // x==y分支
            "3, 9,  可以构建矩形",       // delta=5触发delta>5分支
            "4, 7,  可以构建椭圆",       // delta=3触发delta>2分支
            "2, 3,  可以构建长方形",     // delta=1触发默认分支

            // 输入错误路径
            "0, 5,  输入不符合要求",    // x非正数
            "5, -2, 输入不符合要求",    // y非正数
            "-1,-1, 输入不符合要求"     // 双负数
    })
     void testAllPaths(int x, int y, String expected) {
        assertEquals(expected, ShapeChecker.checkShape(x, y));
    }
}