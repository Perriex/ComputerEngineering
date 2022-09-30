package payroll;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    @Test
    void employee_returns_overtime_correctly(){
        Employee e = new Employee("Parna","innocent",240);
        int overtime = e.calculateOverwork();

        assertEquals(40,overtime);
    }

    @Test
    void employee_returns_negOne_overtime_correctly(){
        Employee e = new Employee("Parna","innocent",120);
        int overtime = e.calculateOverwork();

        assertEquals(-1,overtime);
    }

    @Test
    void employee_returns_employees_name_and_overtime_correctly() {
        Employee e = new Employee("Hossein", "teacher", 280);

        Overtime o = new Overtime(e.getId(), e.getName(), e.calculateOverwork());

        assertEquals("Hossein", o.getName());
        assertEquals(80, o.getOvertime());
    }
}