public class Student {
    //Khao bao cac thuoc tinh
    private int id;
    private String name;
    private int age;
    private float gpa;
    
    //default constructor
    public Student() {
        id=0;
        name="sv FPT";
        age=18;
        gpa=0.0f;
    }

    //Luu y thu tu cua cac tham so
    public Student(int id, String name, int age, float gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", age=" + age + ", gpa=" + gpa + '}';
    }
    
    
}
