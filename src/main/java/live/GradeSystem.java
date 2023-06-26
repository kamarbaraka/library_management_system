package live;

import java.util.List;

public class GradeSystem {

    public static void main(String[] args) {
        var student1 = new Student("kamar", 12, 35);
        var student2 = new Student("evans", 14, 75);
        var student3 = new Student("tom", 5, 62);
        var student4 = new Student("evans", 6, 45);

        var classA = new ClassOfStudents();
        classA.addAll(List.of(student1, student2, student3, student4));

        System.out.println(classA.getHighestGrade());


    }
}
