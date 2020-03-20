public class Person implements Cloneable {
    private String name;
    private String age;
    private String sex;
    private Student student;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", student=" + student +
                '}';
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        Person p =  (Person) super.clone();
        Student s = p.getStudent();
       // p.setStudent( s.clone());
        p.student = s.clone();
        return p;
    }
}
