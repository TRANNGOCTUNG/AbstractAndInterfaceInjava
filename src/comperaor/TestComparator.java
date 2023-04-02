package comperaor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(01,"Trần Hồng Quân",23,3.5));
        students.add(new Student(01,"Trần Hồng Hà",23,1.5));
        students.add(new Student(05,"Trần Hồng An",22,2.5));
        students.add(new Student(04,"Trần Hồng Hiếu",21,4.5));
//        Collections.sort(students,new Comparator<Student>(){
//            @Override
//            public int compare(Student o1, Student o2){
//                return o1.getAge() - o2.getAge();
//            }
//        });
//        for (Student s: students
//             ) {
//            System.out.println(s);
//        }
     Collections.sort(students, new Comparator<Student>() {
         @Override
         public int compare(Student o1, Student o2){
             return o1.getName().compareTo(o2.getName());
         }
     });
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName()) ;
            }
        });
        for (Student s:students
        ) {
            System.out.println(s);
        }
        Collections.sort(students,new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2){
                if(o1.getAge() == o2.getAge()){
                    return o2.getId() - o1.getId();
                }
                return o1.getAge() - o2.getAge();
            }
        });
        for (Student s:students
        ) {
            System.out.println(s);
        }
        
    }
}
