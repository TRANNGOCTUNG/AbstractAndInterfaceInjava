package comperable1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShowStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(01,"Trần Hoàng Quân",25,3.5));
        students.add(new Student(03,"Trần Hoàng An",22,1.5));
        students.add(new Student(02,"Trần Hoàng Hà",22,4.5));
        Collections.sort(students);
        for (Student s:students
             ) {
            System.out.println(s);
        }

    }

}
