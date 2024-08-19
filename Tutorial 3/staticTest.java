class Student
{	int rollno;
	String name;
String college="SJC";
Student(int r,String n)
	{rollno=r;
	name=n;
	}
void display()
	{
	System.out.println(rollno+"\t"+name+"\t "+college)	;
	}
}
public class staticTest {
    public static void main(String[] args){
	Student s1=new Student(111,"Aryan");
	Student s2=new Student(112,"Karan");
	s1.display();
	s2.display();
}
}