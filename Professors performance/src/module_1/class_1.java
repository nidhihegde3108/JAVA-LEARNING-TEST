package module_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class class_1 {
	

	    private String name;
	    private int yearsOfExperience;
	    private int classesCount;
	    private int salary;
	    private int age;
	    private int leavesTaken;

	    public class_1(String name, int yearsOfExperience, int classesCount, int salary, int age, int leavesTaken) {
	        this.name = name;
	        this.yearsOfExperience = yearsOfExperience;
	        this.classesCount = classesCount;
	        this.salary = salary;
	        this.age = age;
	        this.leavesTaken = leavesTaken;
	    }

	    

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getYearsOfExperience() {
	        return yearsOfExperience;
	    }

	    public void setYearsOfExperience(int yearsOfExperience) {
	        this.yearsOfExperience = yearsOfExperience;
	    }

	    public int getClassesCount() {
	        return classesCount;
	    }

	    public void setClassesCount(int classesCount) {
	        this.classesCount = classesCount;
	    }

	    public int getSalary() {
	        return salary;
	    }

	    public void setSalary(int salary) {
	        this.salary = salary;
	    }

	    public int getAge() {
	        return age;
	    }
	    
	    public void setAge(int age) {
	        this.age = age;
	    }

	    public int getLeavesTaken() {
	        return leavesTaken;
	    }

	    public void setLeavesTaken(int leavesTaken) {
	        this.leavesTaken = leavesTaken;
	    }


	
		   public static Comparator<class_1> StringComparator = new Comparator<class_1>() 
		   {
			   
		       
		        public int compare(class_1 c1, class_1 c2) 
		        {
		         
		        	String name1
	                = c1.getName().toUpperCase();
	            String name2
	                = c2.getName().toUpperCase();
		            return (name1.compareTo(name2));
		        }
		   };
		 
		   
		   public static Comparator<class_1> AgeComparator = new Comparator<class_1>() {
			   

		        public int compare(class_1 s1, class_1 s2) {
		 
		            int age1 = s1.getAge();
		            int age2 = s2.getAge();   
		            return age1 - age2;
		 
		            
		        }
		    };
		    
		    public static Comparator<class_1> YOEComparator = new Comparator<class_1>() {
				   

		        public int compare(class_1 s1, class_1 s2) {
		 
		            int YOE1 = s1.getYearsOfExperience();
		            int YOE2 = s2.getYearsOfExperience();   
		            return YOE1 - YOE2;
		 
		            
		        }
		    };
		    
		    public static Comparator<class_1> ccountComparator = new Comparator<class_1>() {
				   

		        public int compare(class_1 s1, class_1 s2) {
		 
		            int ccount1 = s1.getClassesCount();
		            int ccount2 = s2.getClassesCount();   
		            return ccount1 - ccount2;
		 
		            
		        }
		    };
		    
		    public static Comparator<class_1> salaryComparator = new Comparator<class_1>() {
				   

		        public int compare(class_1 s1, class_1 s2) {
		 
		            int salary1 = s1.getSalary();
		            int salary2 = s2.getSalary();   
		            return salary1 - salary2;
		 
		            
		        }
		    };
		    
		    public static Comparator<class_1> LTComparator = new Comparator<class_1>() {
				   

		        public int compare(class_1 s1, class_1 s2) {
		 
		            int leavesTaken1 = s1.getLeavesTaken();
		            int leavesTaken2 = s2.getAge();   
		            return leavesTaken1 - leavesTaken2;
		 
		            
		        }
		    };
		    
		   public String toString() {
			   
		        return "[ name=" + name + ", yearsOfExperience="
		               + yearsOfExperience + ", classesCount=" + classesCount + ", salary=" + salary + ", age=" + age + ", leavesTaken=" + leavesTaken +"]";
		    }
		   
		   
		          
		   
		        
	    }

