class Student 
{
    int rollno;
    String name;
    int marks;
}


public class ArrayObj
{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "tanu";
        s1.marks = 100;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "ganu";
        s2.marks = 300;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "manu";
        s3.marks = 200;

        Student students[] = new Student[3]; // array which can hold student references
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0; i<students.length; i++)
        {
            System.out.println(students[i].rollno + " :" + students[i].name + " :" + students[i].marks );
        }

       
    }
}
