package day27_staticKeyword;

class Student {
    int number;
    String name;
    String college = "ITS";

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", college='" + college + '\'' +
                '}';
    }

    Student(int r, String n, String college) {
        this.number = r;
        this.name = n;
        this.college = college;
    }

    Student(int r, String n) {
        this.number = r;
        this.name = n;
     }
    Student(int r) {
        this.number = r;

    }

    public static void main(String args[]) {
        Student s3 = new Student(145, "gazi");
        Student s1 = new Student(111, "Karan", "MIT");
        Student s2 = new Student(222, "Aryan", "Harvard");
        Student s4 = new Student(1453);


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}