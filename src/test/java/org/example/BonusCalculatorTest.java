package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 作者
 * @create 2025-03-18-23:04
 */
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BonusCalculatorTest {
    // 档位一：利润≤10万
    @Test
    public void testLevel1() {
        assertThat(calc(5), is("总提成：0.5万"));
        assertThat(calc(10), is("总提成：1.0万"));
    }

    // 档位二：10万<利润≤20万
    @Test
    public void testLevel2() {
        assertThat(calc(15), is("总提成：1.4万"));  // 1.0 + 0.375 = 1.375 → 1.4
        assertThat(calc(20), is("总提成：1.8万"));  // 1.0 + 0.75 = 1.75 → 1.8
    }

    // 档位三：20万<利润≤40万
    @Test
    public void testLevel3() {
        assertThat(calc(30), is("总提成：2.3万"));  // 1.0 + 0.75 + 0.5 = 2.25 → 2.3
        assertThat(calc(40), is("总提成：2.8万"));  // 1.0 + 0.75 + 1.0 = 2.75 → 2.8
    }

    // 档位四：40万<利润≤60万
    @Test
    public void testLevel4() {
        assertThat(calc(50), is("总提成：3.1万"));  // 2.75 + 0.3 = 3.05 → 3.1
        assertThat(calc(60), is("总提成：3.4万"));  // 2.75 + 0.6 = 3.35 → 3.4
    }

    // 档位五：60万<利润≤100万
    @Test
    public void testLevel5() {
        assertThat(calc(80), is("总提成：3.7万"));  // 3.35 + 0.3 = 3.65 → 3.7
        assertThat(calc(100), is("总提成：4.0万")); // 3.35 + 0.6 = 3.95 → 4.0
    }

    // 档位六：利润>100万
    @Test
    public void testLevel6() {
        assertThat(calc(120), is("总提成：4.2万")); // 3.95 + 0.2 = 4.15 → 4.2
    }

    private String calc(int profit) {
        return BonusCalculator.calculateBonus(profit);
    }
}