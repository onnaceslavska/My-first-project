import lv.acodemy.classroom.Calculator;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.Callable;

public class CalculatorTest {

    @Test
    public  void  testSum() {
        Calculator casio = new Calculator();
        Assert.assertEquals(casio.sum(50, 10), 60);
    }
    @Test
    public void testMultiply() {
        Calculator casio = new Calculator();
        Assert.assertEquals(casio.multiply(50, 10), 500);
    }

    @Test
    public  void  testSubtract() {
        Calculator casio = new Calculator();
        Assert.assertEquals(casio.subtract(50, 10), 40);
    }

    @Test
    public  void  testDivide() {
        Calculator casio = new Calculator();
        Assert.assertEquals(casio.divide(50, 10), 5);
        }

    }



