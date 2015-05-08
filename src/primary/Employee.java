package primary;


public class Employee {
 public int age;
 public String name;
 int workHour;
 char grade;
 int workYear;
 
 public Employee(int age,String name,int workHour,char grade,int workYear){
  this.age=age;
  this.name=name;
  this.workHour=workHour;
  this.grade=grade;
  this.workYear=workYear;
	 
 }
 
 public double income(int hour,double unitSalary){
	 double income;
	 income=unitSalary*hour;
	 System.out.println("Employee" + this.name + " has income is $" + income + " each year");
	 return income;
 }
 
 public double getUnitSalary(char grade,int workYear){
	 double unitSalary;
	 System.out.println(grade);
	 switch (grade){
	 //break is needed when default clause exists or else the value will always be default value.
	 case 'C': unitSalary=workYear*1; break;
	 case 'B': unitSalary=workYear*2; break;
	 case 'A': unitSalary=workYear*3; break;
	 default: unitSalary=workYear*1.5;
	 }
	 System.out.println("The unit salary is $" +unitSalary);
	 return unitSalary;
 }
 
}
