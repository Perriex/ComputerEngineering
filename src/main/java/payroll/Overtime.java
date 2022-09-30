package payroll;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
class Overtime {

    private @Id Long id;
    private String name;
    private int overtime;

    Overtime() {}

    Overtime(Long id, String name, int overtime) {
        this.id = id;
        this.name = name;
        this.overtime = overtime;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getOvertime() {
        return this.overtime;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Overtime))
            return false;
        Overtime overtime = (Overtime) o;
        return Objects.equals(this.id, overtime.id) && Objects.equals(this.name, overtime.name)
                &&  Objects.equals(this.overtime,overtime.overtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.overtime);
    }

    @Override
    public String toString() {
        return "Overtime{" + "id=" + this.id + ", name='" + this.name + '\'' + ", overtime='" + this.overtime + '\'' + '}';
    }
}