package person;

import person.Person;

import java.util.Arrays;

public class Student extends Person {
    private double contract;

    public Student(long id, String fullname, int age, char gender, double contract) {
        super(id, fullname, age, gender);
        this.contract = contract;
    }

    public Student() {
    }
    public double getContract() {
        return contract;
    }

    public void setContract(double contract) {
        this.contract = contract;
    }

    @Override
    public double period(Group group) {

        if(group.getDateOfFinish().getYear() > group.getDateOfStart().getYear()) {
            byte difference = (byte) ((byte) 12 - group.getDateOfStart().getMonthValue());
            byte interval = (byte)group.getDateOfFinish().getMonthValue();
            byte period = (byte) (difference + interval);
            System.out.print(getFullname() + " pays for " + period + " months ");
            return getContract()*period;
        } else if (group.getDateOfFinish().getYear() == group.getDateOfStart().getYear()) {
            byte interval = (byte) ((byte)group.getDateOfFinish().getMonthValue() - group.getDateOfStart().getMonthValue());
            System.out.print(getFullname() + " pays for " + interval + " months ");
            return getContract()*interval;
        }
        return 0;
    }

    @Override
    public void sortAge(Mentor[] mentors, Student[] students, Instructor[] instructors) {
        Student swap;
        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getAge() > students[j].getAge()) {
                    swap = students[i];
                    students[i] = students[j];
                    students[j] = swap;
                }
            }
        }
    }

    public void sortAge(Mentor[] mentors){
        Mentor swap;
        for (int i = 0; i < mentors.length; i++) {
            for (int j = i+1; j < mentors.length; j++) {
                if (mentors[i].getAge() > mentors[j].getAge()){
                    swap = mentors[i];
                    mentors[i] = mentors[j];
                    mentors[j] = swap;
                }
            }
        }
        System.out.println(Arrays.toString(mentors));
    }

    @Override
    public String toString() {
        return "Student:" +
                super.toString()+
                ", contract=" + contract;
    }
}
