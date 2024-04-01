package class1;

public class Class5 {


    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "학생 1";
        student1.age = 15;
        student1.grade = 90;


        Student student2 = new Student();
        student2.name = "학생 2";
        student2.age = 16;
        student2.grade = 80;


        Student[] students  = new Student[] {student1,student2};


        for (Student student : students) {
            System.out.println(student.name + student.age + student.grade);

        }

        for (int i = 0; i< students.length; i++){
            System.out.println(students[i].name + students[i].age + students[i].grade);

        }



        System.out.println(student1);
        System.out.println("이름 :" + students[0].name + " 나이:" + students[0].age + " 성적:" + students[0].age);
        System.out.println("이름 :" + students[1].name + " 나이:" + students[1].age + " 성적:" + students[1].age);

    }
}
