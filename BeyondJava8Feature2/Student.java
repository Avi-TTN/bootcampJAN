package BeyondJava8Feature2;
import java.util.Objects;

record Student(int id, String name, int standard) {
    Student{
        Objects.requireNonNull(name, "Student name cannot be null");
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, standard);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Student)) return false;
        Student o = (Student)obj;
        return (this.name.equals(o.name) && this.id == o.id && this.standard == o.standard);
    }
}
