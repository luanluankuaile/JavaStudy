package primary;

public class Father extends Employee implements Tax{
  String role="Father";
  int childrenNum;
  double childYearF;
  
  public Father(int a,String n,int w,char g,int wo,String role,int childrenNum,double childYearF){
	super(a,n,w,g,wo);
	this.role=role;
	this.childrenNum=childrenNum;
	this.childYearF=childYearF;
	
  }
  
  public double tax(double income){
	  double tax;
	  tax=income*0.2;
	  return tax;
  }
  
  public double getEduFee(int children,double yearFee)
  {
	 double eduFee= yearFee*children;
	 return eduFee;
  }
  
  public double getAllFee(){
	  double allFee;
	  allFee=(double)this.getEduFee(childrenNum,childYearF)+30000;
	  System.out.println("Father" + this.name + " spend money $" + allFee + " each year");
	  return allFee;
  }
	
  public double saveMoney(){
	  double saveMoney;
	  System.out.println(this.grade);
	  System.out.println(this.workYear);
	  System.out.println(this.getUnitSalary(this.grade,this.workYear));
	  
	  saveMoney=this.income(workHour,this.getUnitSalary(this.grade,this.workYear))- this.getAllFee();
	  return saveMoney;
  }
  
  public static void main(String args[]){
   Father tommy=new Father(56,"Tommy",1000,'A',20,"Father",2,2000);
   tommy.saveMoney();
   double tax=tommy.tax(tommy.income(1000, tommy.getUnitSalary('A',20)));
   System.out.println("Father "+tommy.name+" save money ammount is $"+ tommy.saveMoney()+ " each year");
   System.out.println("Father "+tommy.name+" need to claim tax $" + tax + " each year");
  
  }
}
