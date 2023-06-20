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

 → Using ArrayList "teachers" to add an object of type "class_1" to it.
 → "display" method is used to showcase all the details of teachers






















      
