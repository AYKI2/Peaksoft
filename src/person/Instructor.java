package person;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class Instructor extends Person {
    private double salary;

    public Instructor() {
    }
    public Instructor(long id, String fullname, int age, char gender, double salary) {
        super(id, fullname, age, gender);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double period(Group group) {
        if(group.getDateOfFinish().getYear() > group.getDateOfStart().getYear()) {
            byte difference = (byte) ((byte) 12 - group.getDateOfStart().getMonthValue());
            byte interval = (byte)group.getDateOfFinish().getMonthValue();
            byte period = (byte) (difference + interval);
            System.out.print(getFullname() + " receives in "+ period +" months ");
            return getSalary()*period;
        } else if (group.getDateOfFinish().getYear() == group.getDateOfStart().getYear()) {
            byte interval = (byte) ((byte)group.getDateOfFinish().getMonthValue() - group.getDateOfStart().getMonthValue());
            System.out.print(getFullname() + " receives in "+ interval +" months ");
            return getSalary()*interval;
        }
        return 0;
    }

    @Override
    public void sortAge(Mentor[] mentors, Student[] students, Instructor[] instructors) {
        Instructor swap;
        for (int i = 0; i < instructors.length; i++) {
            for (int j = i + 1; j < instructors.length; j++) {
                if (instructors[i].getAge() > instructors[j].getAge()) {
                    swap = instructors[i];
                    instructors[i] = instructors[j];
                    instructors[j] = swap;
                }
            }
        }
    }


    @Override
    public String toString() {
        if(getClass().equals(Instructor.class)) {
            return "\nInstructor:" + super.toString() +
                    ", salary=" + salary;
        }else {
            return super.toString() +
                    ", salary=" + salary;
        }
    }
}
