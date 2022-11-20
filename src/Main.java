import company.Company;
import company.Course;
import company.ItAcademy;
import company.PeakSoftHouse;
import person.Group;
import person.Instructor;
import person.Mentor;
import person.Student;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Student student1 = new Student(5, "Iskhak Abdukhamitov", 20, 'M', 12000);
        Student student2 = new Student(6, "Dastan", 20, 'M', 10000);
        Student student3 = new Student(7, "Mukhammed", 20, 'M', 8000);
        Student student4 = new Student(8, "Azamat", 20, 'M', 9500);
        Student[] students = {student1, student2, student3, student4};

        Mentor mentor1 = new Mentor(2, "Rahim Bazarbay uulu", 20, 'M', 40000);
        Mentor mentor2 = new Mentor(3, "Mukhammed Toichubai uulu", 22, 'M', 45000);
        Mentor mentor3 = new Mentor(4, "Maksat Akyl", 37, 'M', 50000);

        Mentor mentor4 = new Mentor(2, "Biroo", 35, 'M', 45000);
        Mentor mentor5 = new Mentor(3, "Chelovek", 24, 'F', 50000);
        Mentor mentor6 = new Mentor(4, "Lichnost", 19, 'M', 35000);
        Mentor[] mentors = {mentor1, mentor2, mentor3};
        Mentor[] mentors2 ={mentor4,mentor5,mentor6};

        Instructor instructor1 = new Instructor(1, "Aijamal Asangazieva", 26, 'F', 60000);
        Instructor instructor2 = new Instructor(9, "KTO-TO", 24, 'F', 60000);
        Instructor[] instructors = {instructor1,instructor2};

        Group group1 = new Group("Java 8", students, LocalDate.of(2022, 10, 3), LocalDate.of(2023, 7, 5));
        Group group2 = new Group("JS 8", students, LocalDate.of(2022, 10, 3), LocalDate.of(2023, 7, 5));
        Group[] groups = {group1,group2};

        Course course1 = new Course("Java", new Group[]{group1, group2}, instructor1, mentors);
        Course course2 = new Course("JS", new Group[]{group1, group2}, instructor2, mentors2);

        Company company1 = new PeakSoftHouse("Peaksoft House", "Grajdanskaya, 119", new Course[]{course1, course2}, "Java");
        Company company2 = new ItAcademy("IT Academy", "Maksim Gorkiy, 18", new Course[]{course1, course2}, "Python");
        Company[] companies = {company1,company2};

        while (true){
            System.out.println("\nChoice 1(Company), 2(Group), 3(Instructor), 4(Mentors), 5(Students) 6(ShowAll)");
            int number = input.nextInt();
            switch (number){
                case 1:
                    for (Company company:companies) {
                        System.out.println(company);
                        System.out.println("\nContract amount of all students: "+company.inCome(students));
                    }
                    break;
                case 2:
                    for (Group group:groups) {
                        System.out.println(group);
                    }
                    break;
                case 3:
                    System.out.println();
                    for (Instructor instructor:instructors){
                        instructor.sortAge(mentors,students,instructors);
                        System.out.println(instructor);
                        System.out.println(instructor.period(group1));
                    }
                    break;
                case 4:
                    System.out.println();
                    for (Group group:groups) {
                        for (Mentor mentor : mentors) {
                            mentor.sortAge(mentors, students, instructors);
                            System.out.println(mentor);
                            System.out.println(mentor.period(group));
                        }
                        for (Mentor mentor : mentors2) {
                            mentor.sortAge(mentors2, students, instructors);
                            System.out.println(mentor);
                            System.out.println(mentor.period(group));
                        }
                    }
                    break;
                case 5:
                    System.out.println();
                    for (Student student:students){
                        student.sortAge(mentors,students,instructors);
                        System.out.println(student);
                        System.out.println(student.period(group1));
                    }
                    break;
                case 6:System.out.println(Company.class);
                    System.out.println(Course.class);
                    System.out.println(Group.class);
                    System.out.println(Instructor.class);
                    System.out.println(Arrays.toString(mentors));
                    System.out.println(Arrays.toString(students));
                    break;
                default:
                    System.out.println("no such number!");
                    break;
            }
        }
    }
}