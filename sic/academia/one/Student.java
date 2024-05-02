package sic.academia.one;
public class Student {
    private static int studentCount = 0;
    private String registrationNumber;
    private String name;

    public Student() {
    }

    public Student(String name) {
        studentCount++;
        this.registrationNumber = "R" + studentCount;
        this.name = name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

