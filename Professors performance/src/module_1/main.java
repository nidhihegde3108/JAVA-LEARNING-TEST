package module_1;

import java.util.ArrayList;
import java.util.Scanner;



class SortByTeacherException extends Exception {
   

	

	public SortByTeacherException() {
		// TODO Auto-generated constructor stub
	}


	
}
public class main {
	
	public static void main(String[] args) throws SortByTeacherException {
		// TODO Auto-generated method stub
		class_1 c1=new class_1("Nidhi", 12, 6, 80000, 35 , 12);
		
		
		ArrayList<class_1> teachers=new ArrayList<>();
	    
		teachers.add(new class_1("Nidhi", 11, 6, 8000, 25 , 7));
		teachers.add(new class_1("Neha", 11, 2, 80000, 5 , 5));
		teachers.add(new class_1("Dhanush", 10, 18, 19000, 15 , 9));
		teachers.add(new class_1("Keerti", 14, 12, 9000, 35 , 8));
		teachers.add(new class_1("Suresh", 10, 8, 7000, 14 , 6));
		teachers.add(new class_1("Ramesh", 11, 7, 4000, 13 , 11));
	    
	    c1.display(teachers);
//	    if(!teachers.isEmpty())
//	    {
//	    c1.loop(teachers);
//	    }
	  
	    System.out.println("Enter the combination to be sorted...\n1.Years Of Experience\n2.Class Count\n3.Salary\n4.Age\n5.Leavestaken");
		Scanner s=new Scanner(System.in);
		String Comb=s.next();
		c1.Combination(teachers,Comb);
	    
	    c1.VerifyPerformance(teachers);
	    
	        try {
	            c1.sortByTeacher(teachers);
	        } catch (SortByTeacherException e) {
	            System.out.println(e.getMessage()); 
	        }
	        
	       
	}

}
