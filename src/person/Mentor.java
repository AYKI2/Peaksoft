package person;

import java.time.Month;
import java.util.Arrays;

public class Mentor extends Instructor {
    public Mentor() {
    }

    public Mentor(long id, String fullname, int age, char gender, double salary) {
        super(id, fullname, age, gender, salary);
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
        Mentor swap;
        for (int i = 0; i < mentors.length; i++) {
            for (int j = i + 1; j < mentors.length; j++) {
                if (mentors[i].getAge() > mentors[j].getAge()) {
                    swap = mentors[i];
                    mentors[i] = mentors[j];
                    mentors[j] = swap;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "\nMentor:" + super.toString();
    }
}
