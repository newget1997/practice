import java.util.HashMap;
import java.util.Map;

public class Demo2 {

    public static void main(String[] args) {
        Person p1 = new Person();
        Student s1 = new Student();

        s1.setSchool("upc");
        try {
            Person p2;
            p1.setAge("11");
            p1.setStudent(s1);
            p2 = p1.clone();

            p2.setAge("22");
            p1.setAge("11");
            p2.getStudent().setSchool("eee");
            System.out.println(p1.getAge()+"   "+p1.getStudent().getSchool());
            System.out.println(p2.getAge()+"   "+p2.getStudent().getSchool());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
