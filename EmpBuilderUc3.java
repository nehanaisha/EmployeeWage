package employeewage;

public class EmpBuilderUc3 {
public static void main(String[] args) {
	int IS_PART_TIME = 1;
	int IS_FULL_TIME = 2;
	int EMP_RATE_PER_HOUR = 20;
	int emphrs = 0;
	int empwage = 0;
	double empCheck = Math.floor(Math.random() * 10) % 3;
	if (empCheck == IS_PART_TIME)
	   emphrs = 4;
		else if (empCheck == IS_FULL_TIME )
			emphrs = 8;
		else
			emphrs = 0;
	empwage = emphrs * EMP_RATE_PER_HOUR;
		System.out.println("emp wage:" + empwage);	
		
}
}
