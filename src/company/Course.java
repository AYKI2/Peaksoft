package company;

import person.Group;
import person.Instructor;
import person.Mentor;

import java.util.Arrays;

public class Course {
    private String programming;
    private Group[] groups;
    private Instructor instructor;
    private Mentor[] mentors;

    public Course() {
    }

    public Course(String programming, Group[] groups, Instructor instructor, Mentor[] mentors) {
        this.programming = programming;
        this.groups = groups;
        this.instructor = instructor;
        this.mentors = mentors;
    }

    public String getProgramming() {
        return programming;
    }

    public void setProgramming(String programming) {
        this.programming = programming;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Mentor[] getMentors() {
        return mentors;
    }

    public void setMentors(Mentor[] mentors) {
        this.mentors = mentors;
    }

    @Override
    public String toString() {
        return "Cours{" +
                "programming='" + programming + '\'' +
                ", groups=" + Arrays.toString(groups) +
                ", instructor=" + instructor +
                ", mentors=" + Arrays.toString(mentors) +
                '}';
    }
}
