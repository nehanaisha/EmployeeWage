package employeewage;

public class EmpBuilderUc6 {
	public static final int IS_PART_TIME = 1; 
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAY= 20;
	public static final int MAX_HRS_IN_MONTH=100;
	public static void main(String[] args) {
		int emphrs = 0;
		int totalemphrs = 0,totalworkingdays=0;
	while (totalemphrs <= MAX_HRS_IN_MONTH && totalworkingdays < NUM_OF_WORKING_DAY) {
		totalworkingdays++;
		int empCheck = (int) Math.floor(Math.random()*10) % 3;
		switch (empCheck) {
		case IS_PART_TIME:
			emphrs=4;
			break;
		case IS_FULL_TIME:
			emphrs=8;
			break;
			default:
				emphrs=0;
		}
		totalemphrs += emphrs;
		System.out.println("day:" + totalworkingdays + "emphrs:" +emphrs);
		}
	int totalempwage = totalemphrs * EMP_RATE_PER_HOUR;
		System.out.println("total emp wage:" + totalempwage);
}
}
