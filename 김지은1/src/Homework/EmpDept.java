package Homework;

public class EmpDept extends Employee  {
	
	//필드
	public String Department;
	
	public EmpDept(String name, int salary, String Department) {
		super(name, salary);
		this.Department = Department;
	}

	public String getDepartment() {
		return Department;
	}

	@Override
	public void getInformation() {
		System.out.println("이름:"+ name + " "+  "연봉:" + salary + " "+ "부서:" + Department );
	}

	@Override
	public void print() {
		System.out.println(" 수퍼클래스 \n 서브클래스");
	}
	
	
	
}
