import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		Date myDate = new Date(2014, 02, 11);
		Student st=new Student(1,"Ak",myDate,90.5);
		StudentGroup s=new StudentGroup(4);
		s.setStudent(st,0);
		
	}

}
