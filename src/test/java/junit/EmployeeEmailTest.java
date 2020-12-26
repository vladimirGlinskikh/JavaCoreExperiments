package junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeEmailTest {
    private EmployeeEmail employeeEmail;

    @BeforeEach
    void setUp() {
        employeeEmail = new EmployeeEmail();
    }

    @Test
    void isValidEmailId() {
        boolean result = employeeEmail.isValidEmailId("vladimir.v.glinskikh@gmail.com");
        assertTrue(result, " Valid email ID failed");
    }

    @Test
    void isInvalidEmailId() {
        boolean result = employeeEmail.isValidEmailId("vladimir.v.glinskikh+gmail.com");
        assertFalse(result, " Invalid email ID passed");
    }

    @Test
    void addEmployeeEmailId() {
        employeeEmail.addEmployeeEmailId("Emp01", "sveta@gmail.com");
        employeeEmail.addEmployeeEmailId("Emp02", "nikolay@gmail.com");
        int size = employeeEmail.hashMap.size();
        assertEquals(2, size, "Incorrect collection size ");
    }

    @Test
    public void testAddEmailWithDuplicateKey() throws Exception {
        employeeEmail.addEmployeeEmailId("Emp01", "svetlana@gmail.com");
        employeeEmail.addEmployeeEmailId("Emp01", "svetlana@gmail.com");
        employeeEmail.addEmployeeEmailId("Emp02", "nikolay@gmail.com");
        int size = employeeEmail.hashMap.size();
        assertNotEquals(3, size, " Duplicate key in collection");
    }

    @Test
    void testGetExistingEmailId() {
        employeeEmail.addEmployeeEmailId("Emp01", "svetlana@gmail.com");
        employeeEmail.addEmployeeEmailId("Emp02", "nikolay@gmail.com");
        String val = employeeEmail.getEmployeeEmailId("Emp02");
        assertNotNull(val, " Returned null for existing employee");
    }

    @Test
    void testGetNonExistingEmailId() {
        employeeEmail.addEmployeeEmailId("Emp01", "svetlana@gmail.com");
        employeeEmail.addEmployeeEmailId("Emp02", "nikolay@gmail.com");
        String val = employeeEmail.getEmployeeEmailId("Emp03");
        assertNull(val, "Failed to return null for non existing employee");
    }

    @Test
    void testIfObjectsAreSame() {
        EmployeeEmail employeeEmail1 = new EmployeeEmail();
        employeeEmail1.addEmployeeEmailId("Emp01", "svetlana@gmail.com");
        EmployeeEmail employeeEmail2 = new EmployeeEmail();
        employeeEmail2.addEmployeeEmailId("Emp02", "nikolay@gmail.com");

        Map map1 = employeeEmail1.hashMap;
        Map map2 = employeeEmail2.hashMap;
        map1 = map2;

        assertSame(map1, map2, "Failed because objects are not same");
    }

    @Test
    void testIfObjectsAreNotSame() {
        EmployeeEmail employeeEmail1 = new EmployeeEmail();
        employeeEmail1.addEmployeeEmailId("Emp01", "svetlana@gmail.com");
        EmployeeEmail employeeEmail2 = new EmployeeEmail();
        employeeEmail2.addEmployeeEmailId("Emp02", "nikolay@gmail.com");

        Map map1 = employeeEmail1.hashMap;
        Map map2 = employeeEmail2.hashMap;

        assertNotSame(map1, map2, "Failed because objects are same");
    }
}