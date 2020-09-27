package EmployeeageAboveUC10;

public class EmployeeUC9 {
	public static final int iFullTime = 1;
	public static final int iPartTime = 2;
	public static int iTotalWage = 0;

	private final String sCompany;
	private final int iEmpRate;
	private final int iMaxWorkingDays;
	private final int iMaxWorkingHrs;

	public EmployeeUC9(String sCompany, int iEmpRate, int iMaxWorkingDays, int iMaxWorkingHrs) {
		this.sCompany = sCompany;
		this.iEmpRate = iEmpRate;
		this.iMaxWorkingDays = iMaxWorkingDays;
		this.iMaxWorkingHrs = iMaxWorkingHrs;
	}

	public void computeWage() {
		int iTotalWorkingHrs = 0;
		int iEmpHrs = 0;
		int iWorkingDays = 0;
		System.out.println("Company name is " + sCompany);
		while (iWorkingDays < iMaxWorkingDays && iTotalWorkingHrs < iMaxWorkingHrs) {
			iWorkingDays++;
			int iEmpAttend = (int) Math.floor(Math.random() * 10) % 3;

			switch (iEmpAttend) {
			case iFullTime:
				iEmpHrs = 8;

				break;
			case iPartTime:
				iEmpHrs = 4;

				break;
			default:
				iEmpHrs = 0;
			}
			if (iTotalWorkingHrs + iEmpHrs < iMaxWorkingHrs)
				iTotalWorkingHrs = iTotalWorkingHrs + iEmpHrs;
			else
				iTotalWorkingHrs = iMaxWorkingHrs;

		}
		iTotalWage = iTotalWorkingHrs * iEmpRate;
		System.out.println("total working days : " + iWorkingDays + " and total working hours : " + iTotalWorkingHrs);
	}

	@Override
	public String toString() {
		return "Total wage of employee of company " + sCompany + " is " + iTotalWage;
	}

	public static void main(String[] args) {
		EmployeeUC9 dMart = new EmployeeUC9("Dmart", 20, 2, 10);
		EmployeeUC9 reliance = new EmployeeUC9("Reliance", 10, 4, 20);
		dMart.computeWage();
		System.out.println(dMart);
		reliance.computeWage();
		System.out.println(reliance);

	}
}
