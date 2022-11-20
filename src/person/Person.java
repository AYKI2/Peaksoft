package person;

public abstract class Person {
    private long id;
    private String fullname;
    private int age;
    private char gender;

    public Person() {
    }

    public Person(long id, String fullname, int age, char gender) {
        this.id = id;
        this.fullname = fullname;
        this.age = age;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public abstract double period(Group group);
    public abstract void sortAge(Mentor[] mentors,Student[] students, Instructor[] instructors);
    @Override
    public String toString() {
        return  "\nid = " + id +
                ", fullname = " + fullname +
                ", age = " + age +
                ", gender = " + gender;
    }

}
