package EmployeeageAboveUC10;

public class EmployeeUC7 {

	public static final int iFullTime = 1;
	public static final int iPartTime = 2;
	public static int iEmpRate = 20;
	public static int iEmpHrs = 0;
	public static int iEmpWage = 0;
	public static int iMaxWorkingDays = 20;
	public static int iMaxWorkingHrs = 100;
	public static int iTotalWage = 0;
	public static int iWorkingHrs = 0;
	public static int iWorkingDays = 0;

	public static int WageCalculation() {
		while (iWorkingDays < iMaxWorkingDays && iWorkingHrs < iMaxWorkingHrs) {
			iWorkingDays++;
			int iEmpAttend = (int) Math.floor(Math.random() * 10) % 3;

			switch (iEmpAttend) {
			case iFullTime:
				iEmpHrs = 8;
				iWorkingHrs = iWorkingHrs + iEmpHrs;
				break;
			case iPartTime:
				iEmpHrs = 4;

				iWorkingHrs = iWorkingHrs + iEmpHrs;
				break;
			default:
				iEmpHrs = 0;
			}
			iEmpWage = iEmpHrs * iEmpRate;
			iTotalWage = iTotalWage + iEmpWage;
		}
		return iTotalWage;
	}

	public static void main(String[] args) {
		int iWageMonthly = WageCalculation();
		System.out.println("total wage of employee is : " + iWageMonthly);
	}
}
