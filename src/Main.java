import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Thảo", 20, "HH");
        Student student2 = new Student("Sinh", 21, "HH");
        Student student3 = new Student("Hồng", 20, "HH");
        Student student4 = new Student("Khánh", 20, "HH");
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, student1);
        studentMap.put(1, student2);
        studentMap.put(1, student3);
        studentMap.put(1, student4);
        for(Map.Entry<Integer,Student> student :studentMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("........Set");

        Set<Student> students=new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        for(Student student : students){
            System.out.println(student.toString());
        }
    }
}