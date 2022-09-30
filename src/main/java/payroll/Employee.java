package payroll;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
class Employee {

    @Getter @Setter private @Id @GeneratedValue Long id;
    @Getter @Setter private String name;
    @Getter @Setter private String role;
    @Getter @Setter private int workhours;

    Employee() {}

    Employee(String name, String role, int workhours) {

        this.name = name;
        this.role = role;
        if(workhours > 0)
            this.workhours = workhours;
        else
            this.workhours = 0;
    }

    public int calculateOverwork(){
        int overtime = this.workhours - 200;
        if(overtime >= 0){
            return overtime;
        }
        return -1;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Employee))
            return false;
        Employee employee = (Employee) o;
        return Objects.equals(this.id, employee.id) && Objects.equals(this.name, employee.name)
                && Objects.equals(this.role, employee.role) && Objects.equals(this.workhours,employee.workhours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.role, this.workhours);
    }
}