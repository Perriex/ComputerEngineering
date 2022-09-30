package payroll;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Employee {

    private @Id @GeneratedValue Long id;
    private String name;
    private String role;
    private int workhours;

    Employee() {}

    Employee(String name, String role, int workhours) {

        this.name = name;
        this.role = role;
        if(workhours > 0)
            this.workhours = workhours;
        else
            this.workhours = 0;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getWorkhours() {
        return this.workhours;
    }

    public String getRole() {
        return this.role;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setWorkhours(int workhours) {
        this.workhours = workhours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getOvertime(){
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

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", name='" + this.name + '\'' + ", role='" + this.role + '\''+ ", workhours='" + this.workhours + '\'' + '}';
    }
}