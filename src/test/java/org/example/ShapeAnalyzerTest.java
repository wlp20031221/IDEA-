package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 作者
 * @create 2025-03-18-16:01
 */
public class ShapeAnalyzerTest {

    @Test
    public void testInvalidInput() {
        assertEquals("输入不符合要求。", ShapeAnalyzer.analyzeShapes(0, 5));
    }

    @Test
    public void testSameValues() {
        assertEquals("可以构建圆形或正方形", ShapeAnalyzer.analyzeShapes(5, 5));
    }

    @Test
    public void testEllipseCase() {
        assertEquals("可以构建椭圆", ShapeAnalyzer.analyzeShapes(5, 2));
    }

    @Test
    public void testRectangleCase() {
        assertEquals("可以构建矩形", ShapeAnalyzer.analyzeShapes(10, 2));
    }

    @Test
    public void testOblongCase() {
        assertEquals("可以构建长方形", ShapeAnalyzer.analyzeShapes(3, 5));
    }
}