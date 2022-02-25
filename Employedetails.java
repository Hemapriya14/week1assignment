package week1.day2;

public class Employedetails {

	public void printEmployeeName(String empname,int empId)
		{
			System.out.println(empname);
			System.out.println(empId);
		
		}
		public void getEmployeeAddress(String empAddress)
		{
			System.out.println(empAddress);
		}
		public void employeeSalary(double empsalary)
		{
			System.out.println(empsalary);
		}
		
		public void employeeMobilenumber(long mobNumber)
		{
			System.out.println(mobNumber);
		}
		
		
		public static void main(String[] args) {
			Employedetails  emp=new Employedetails();
			emp.printEmployeName("hema",6534);
			emp.getEmployeeAddress("arcot");
			emp.employeeSalary(8004534.65);
			emp.employeeMobilenumber(23456788765345l);


	}
		private void printEmployeName(String string, int i) {
			// TODO Auto-generated method stub
			
		}

}
