package core.objectOrientedConcepts.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HourlyEmployeeTest {
    public static final double DELTA = 0.000_000_1;
    private HourlyEmployee hourlyEmployee;

    @Test
    public void test() {
        hourlyEmployee = new HourlyEmployee("Vladimir", 39, 10.00);
        assertEquals(390.00, hourlyEmployee.getRegularPay(), DELTA);
        assertEquals(0.00, hourlyEmployee.getOvertimePay(), DELTA);
        assertEquals(390.00, hourlyEmployee.getGrossPay(), DELTA);
    }

    @Test
    public void test2(){
        hourlyEmployee = new HourlyEmployee("Beth", 40, 20.00);
        assertEquals(800.00, hourlyEmployee.getRegularPay(), DELTA);
        assertEquals(0.00, hourlyEmployee.getOvertimePay(), DELTA);
        assertEquals(800.00, hourlyEmployee.getGrossPay(), DELTA);
    }

    @Test
    public void test3(){
        hourlyEmployee = new HourlyEmployee("Terry", 41, 20.00);
        assertEquals(800.00, hourlyEmployee.getRegularPay(), DELTA);
        assertEquals(30.00, hourlyEmployee.getOvertimePay(), DELTA);
        assertEquals(830.00, hourlyEmployee.getGrossPay(), DELTA);
    }

    @Test
    public void test4(){
        hourlyEmployee = new HourlyEmployee("Karen", 50, 10);
        assertEquals(400.00, hourlyEmployee.getRegularPay(), DELTA);
        assertEquals(150.00, hourlyEmployee.getOvertimePay(), DELTA);
        assertEquals(550.00, hourlyEmployee.getGrossPay(), DELTA);
    }
}