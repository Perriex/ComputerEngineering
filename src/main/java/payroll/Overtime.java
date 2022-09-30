package payroll;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
class Overtime {

    @Getter @Setter private @Id Long id;
    @Getter @Setter private String name;
    @Getter @Setter private int overtime;

    Overtime() {}

    Overtime(Long id, String name, int overtime) {
        this.id = id;
        this.name = name;
        this.overtime = overtime;
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
}