package person;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    private String name;
    private Student[] students;
    private LocalDate dateOfStart;
    private LocalDate dateOfFinish;

    public Group() {
    }

    public Group(String name, Student[] students, LocalDate dateOfStart, LocalDate dateOfFinish) {
        this.name = name;
        this.students = students;
        this.dateOfStart = dateOfStart;
        this.dateOfFinish = dateOfFinish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public LocalDate getDateOfFinish() {
        return dateOfFinish;
    }

    public void setDateOfFinish(LocalDate dateOfFinish) {
        this.dateOfFinish = dateOfFinish;
    }

    @Override
    public String toString() {
        return "\nGroup: " +
                " Name = " + name +
                "\nStudents = " + Arrays.toString(students) +
                "\nDate Of Start = " + dateOfStart +
                ", Date Of Finish = " + dateOfFinish;
    }
}
