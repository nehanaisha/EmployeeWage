package employeewage;

public class EmpBuilderWageUc2 {
public static void main(String[] args) {
	int IS_FULL_TIME = 1;
	int EMP_RATE_PER_HOUR = 20;
	int emphrs = 0;
	int empWage = 0;
	double empCheck = Math.floor(Math.random() * 10) % 2;
	if (empCheck == IS_FULL_TIME)
		emphrs = 8;
	else
		emphrs = 0;
	empWage = emphrs * EMP_RATE_PER_HOUR;
	System.out.println("emp wage:" + empWage);
	
}
}
