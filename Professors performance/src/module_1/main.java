package module_1;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class SortByTeacherException extends Exception {
    public SortByTeacherException() {
        super("Input not given");
    }
}
public class main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class_1 c1=new class_1("Nidhi", 12, 6, 80000, 35 , 12);
		
		
		ArrayList<class_1> teachers=new ArrayList<>();
	    
		teachers.add(new class_1("Nidhi", 12, 16, 80000, 35 , 8));
		teachers.add(new class_1("Neha", 13, 7, 8000, 25 , 12));
		teachers.add(new class_1("Dhanush", 14, 8, 9000, 15 , 5));
		teachers.add(new class_1("Keerti", 13, 2, 19000, 5 , 7));
		teachers.add(new class_1("Suresh", 11, 18, 4000, 13 , 7));
	    
	    c1.display(teachers);
	    if(!teachers.isEmpty())
	    {
	    c1.loop(teachers);
	    }
	    
	   
	        try {
	            c1.sortByTeacher(teachers);
	        } catch (SortByTeacherException e) {
	            System.out.println(e.getMessage()); 
	        }
	    
	}

}
