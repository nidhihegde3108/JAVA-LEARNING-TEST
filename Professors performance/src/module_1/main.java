package module_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		class_1 c=new class_1("Nidhi", 12, 6, 80000, 35 , 12);
		
        List<class_1> teachers=new ArrayList<>();
	    
	    teachers.add(new class_1("Nidhi", 12, 6, 80000, 35 , 12));
	    teachers.add(new class_1("Neha", 13, 7, 8000, 25 , 10));
	    teachers.add(new class_1("Dhanush", 14, 8, 9000, 15 , 11));
	    
	    for(class_1 teacher : teachers)
	    {
	    	System.out.println("Teacher Name : " + teacher.getName());
            System.out.println("Years of Experience : " + teacher.getYearsOfExperience());
            System.out.println("Classes Count : " + teacher.getClassesCount());
            System.out.println("Salary : " + teacher.getSalary());
            System.out.println("Age : " + teacher.getAge());
            System.out.println("Leaves Taken : " + teacher.getLeavesTaken());
            
          
	    }
	    
	    while(true)
	    {
	    System.out.println("Enter the input that is to be sorted :\n1.name\n2.yearsOfExperience\n3.classesCount\n4.salary\n5.age\n6.leavesTaken");
	    Scanner s=new Scanner(System.in);
	    int ch=s.nextInt();
	    switch(ch)
	    {
	    case 1:Collections.sort(teachers,
                class_1.StringComparator);
	    		break;
	    
	    case 2:Collections.sort(teachers,
                class_1.YOEComparator);
	    
	    case 3:Collections.sort(teachers,
                class_1.ccountComparator);
	    		break;
	    		
	    case 4:Collections.sort(teachers,
                class_1.salaryComparator);
	    		break;
	    		
	    case 5:Collections.sort(teachers,
                class_1.AgeComparator);
	    		break;
	    		
	    case 6:Collections.sort(teachers,
                class_1.LTComparator);
	    		break;
	   
	    }
	    System.out.println("\n");
	    for (class_1 c : teachers) {
            System.out.println(c);
        }
	    System.out.println("\n");
	    }
	    
	    
	    
	}

}
