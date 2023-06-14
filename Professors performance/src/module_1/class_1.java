package module_1;

import java.util.ArrayList;
import weka.classifiers.Classifier;
import weka.classifiers.trees.J48;
import weka.core.Attribute;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.*;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class class_1 {
	

	    private static final Lock lock = new ReentrantLock();
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

	    
	    public void sortByTeacher(ArrayList<class_1> teachers) throws SortByTeacherException {
	        if (teachers == null || teachers.isEmpty()) 
	        {
	            throw new SortByTeacherException();
	        }
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

	    public void add(ArrayList<class_1> teachers)
	    {
	    	
	    }
	    public void display(ArrayList<class_1> teachers)
	    {
	    	 for(class_1 teacher : teachers)
	 	    {
	 	    	System.out.println("Teacher Name : " + teacher.getName());
	             System.out.println("Years of Experience : " + teacher.getYearsOfExperience());
	             System.out.println("Classes Count : " + teacher.getClassesCount());
	             System.out.println("Salary : " + teacher.getSalary());
	             System.out.println("Age : " + teacher.getAge());
	             System.out.println("Leaves Taken : " + teacher.getLeavesTaken());
	             System.out.println("\n");
	             
	           
	 	    }
	    }

	    public void loop(ArrayList<class_1> teachers)
	    {
	    	 while(true)
	 	    {
	 	    System.out.println("Enter the input that is to be sorted :\n1.name\n2.yearsOfExperience\n3.classesCount\n4.salary\n5.age\n6.leavesTaken\n7.Verify performance");
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
	 	    		
	 	    		
	 	    case 7:VerifyPerformance(teachers);
	 	            System.exit(ch);
	 	   
	 	    }
	 	    System.out.println("\n");
	 	    for (class_1 c : teachers) {
	             System.out.println(c);
	         }
	 	    System.out.println("\n");
	 	    }
	    }
	
		   private void VerifyPerformance(ArrayList<class_1> teachers) {
			   try
		        {

		        ArffLoader loader = new ArffLoader();
		        loader.setFile(new File("C://JAVA LEARNING TEST/td.arff"));
		        Instances dataset = loader.getDataSet();
	            dataset.setClassIndex(dataset.numAttributes() - 1);

	          
	            Classifier classifier = new J48();
	            classifier.buildClassifier(dataset);
	            
	            List<class_1> hPTeachers = new ArrayList<>();
	            List<class_1> mPTeachers = new ArrayList<>();
	            List<class_1> lPTeachers = new ArrayList<>();

		    
	            for (class_1 teacher : teachers) {
	                double[] attributes = new double[dataset.numAttributes()];
	                attributes[0] = teacher.getYearsOfExperience();
	                attributes[1] = teacher.getClassesCount();
	                attributes[2] = teacher.getSalary();
	                attributes[3] = teacher.getAge();
	                attributes[4] = teacher.getLeavesTaken();
	                Instance instance = new Instance(1.0, attributes);
	                instance.setDataset(dataset);
	                double predictedClass = classifier.classifyInstance(instance);

	                
	                if (predictedClass == 0) {
	                    hPTeachers.add(teacher);
	                } else if (predictedClass == 1) {
	                	mPTeachers.add(teacher);
	                } else {
	                	lPTeachers.add(teacher);
	                }
	            }
	                Thread hPThread = new Thread(() -> printTeacherDetails(hPTeachers, "High Performing Teachers"));
	                hPThread.start();
	                hPThread.join();
	                Thread mPThread = new Thread(() -> printTeacherDetails(mPTeachers, "Medium Performing Teachers"));
	                mPThread.start();
	                mPThread.join();
	                Thread lPThread = new Thread(() -> printTeacherDetails(lPTeachers, "Low Performing Teachers"));
	                lPThread.start();
	                lPThread.join();

//	                hPThread.start();
//	                mPThread.start();
//	                lPThread.start();
	                
//	                hPThread.join();
//	                mPThread.join();
//	                lPThread.join();
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		   }
			   private static void printTeacherDetails(List<class_1> teachers, String groupName) {
				   
			            System.out.println(groupName + ":");
			            for (class_1 teacher : teachers) {
			                System.out.println(teacher);
			            }
			            System.out.println(); // Add an empty line for separation
			        
			
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
		            int leavesTaken2 = s2.getLeavesTaken();   
		            return leavesTaken1 - leavesTaken2;
		 
		            
		        }
		    };
		    
		   public String toString() {
			   
		        return "[ name=" + name + ", yearsOfExperience="
		               + yearsOfExperience + ", classesCount=" + classesCount + ", salary=" + salary + ", age=" + age + ", leavesTaken=" + leavesTaken +"]";
		    }
		   
		   
	
		  
		 
	    }
	    

