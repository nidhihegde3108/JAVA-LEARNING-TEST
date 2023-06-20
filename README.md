# JAVA-LEARNING-TEST
<img width="383" alt="image" src="https://github.com/nidhihegde3108/JAVA-LEARNING-TEST/assets/87073876/f91fd8ff-7b0c-4f58-b121-9daca58b23b6">

Consider a school/college, we need to create an application which can classify the teachers 
or professors based on their performance.
1.Create a POJO object which can have the teacher detail like name, years of experience, 
  classes count, salary, age, leaves taken etc.

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
→ Initializing all the member variables that is required to deal with the implementation of task using Constructor

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
  → Getter and Setter methods are used to retrieve and update the value of data members or variables

2. Create a program which can display details of all the teachers using the concept of 
  Collections.

                ArrayList<class_1> teachers=new ArrayList<>();
  
		teachers.add(new class_1("Nidhi", 12, 16, 80000, 35, 8));
		teachers.add(new class_1("Neha", 11, 2, 80000, 5 , 5));
		teachers.add(new class_1("Dhanush", 10, 18, 19000, 15 , 9));
		teachers.add(new class_1("Keerti", 12, 12, 9000, 35 , 8));
		teachers.add(new class_1("Suresh", 10, 8, 7000, 14 , 6));
		teachers.add(new class_1("Ramesh", 13, 2, 4000, 13 , 11));
  
	 	c1.display(teachers);
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

 → Using ArrayList "teachers" to add an object of type "class_1" to it.
 
 → "display" method is used to showcase all the details of teachers

3. Create a program which can take a list or a single value for sort by – age, classes count, 
years of experience and leaves taken, based on input sort all the teachers and display 
the details in sorted order.
For example – input sortby – age then we need to sort teacher details by age, input sortby – 
class count, age then teacher details must be sorted by combination of class count along 
with age.

		System.out.println("Enter the combination to be sorted...\n1.Years Of Experience\n2.Class Count\n3.Salary\n4.Age\n5.Leavestaken");
		Scanner s=new Scanner(System.in);
		String Comb=s.next();
		c1.Combination(teachers,Comb);

   		 public void Combination(ArrayList<class_1> teachers,String Comb)
	    { 	
	    	String[] sortAttributes = Comb.split(",");
	        List<Comparator<class_1>> comparators = new ArrayList<>();

	        for (String sortAttribute : sortAttributes) {
	            switch (sortAttribute) {
	                case "1":
	                	comparators.add(Comparator.comparingInt(class_1::getYearsOfExperience));
	                	break;
	                case "2":
	                    comparators.add(Comparator.comparingInt(class_1::getClassesCount));
	                    break;
	                
	                case "3":
	                    comparators.add(Comparator.comparingInt(class_1::getSalary));
	                    break;
	                    
	                case "4":
	                    comparators.add(Comparator.comparingInt(class_1::getAge));
	                    break;
	                case "5":
	                    comparators.add(Comparator.comparingInt(class_1::getLeavesTaken));
	                    break;
	               
	            }
	        }

	       
	        Comparator<class_1> combinedComparator = (a, b) -> {
	            for (Comparator<class_1> comparator : comparators) {
	                int result = comparator.compare(a,b);
	                if (result != 0) {
	                    return result;
	                }
	            }
	            return 0;
	        };

	        teachers.sort(combinedComparator);

	        System.out.println("\nTeachers sorted by " + Comb + ":");
	        for (class_1 teacher : teachers) {
	            System.out.println(teacher);
	        }
	    }

 → The provided code creates a function called "Combination" that has two inputs: an ArrayList of class_1 object objects and a String "Comb". This method uses the Comb 
   string's sorting criteria to order the teachers in the ArrayList.
   
 → A appropriate Comparator is produced and added to the comparators list for each attribute in the sortAttributes array. Based on the attribute number, a switch statement 
   is used to generate the Comparator. Two class_1 objects' corresponding attributes are compared via the Comparator.
   
 → This combinedComparator iterates over the list of comparators and compares the teachers based on each attribute in the order they were added to the list. If a non-zero 
   result is obtained from any comparison, it returns the result. If all comparisons yield zero, indicating equality based on the specified attributes, it returns zero.
 



 



















      
