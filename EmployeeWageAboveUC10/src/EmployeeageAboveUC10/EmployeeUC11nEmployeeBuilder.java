package EmployeeageAboveUC10;


public class EmployeeUC11nEmployeeBuilder implements IComputeEmpWage{

	public static final int iFullTime = 1;
	public static final int iPartTime = 2;

	private int iNoOfCompany = 0;
	private EmployeeUC10[] companyEmpWageArray;

	public EmployeeUC11nEmployeeBuilder() {
		companyEmpWageArray = new EmployeeUC10[5];
	}

	public void addCompanyEmpWage(String sCompany, int iEmpRate, int iMaxWorkingDays, int iMaxWorkingHrs) {
		companyEmpWageArray[iNoOfCompany] = new EmployeeUC10(sCompany, iEmpRate, iMaxWorkingDays, iMaxWorkingHrs);
		iNoOfCompany++;
	}

	public void computeWage() {
		for (int i = 0; i < iNoOfCompany; i++) {
			companyEmpWageArray[i].setTotalWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}

	private int computeEmpWage(EmployeeUC10 companyEmpWage)

	{
		int iTotalWorkingHrs = 0;
		int iEmpHrs = 0;
		int iWorkingDays = 0;
		System.out.println("Company name is " + companyEmpWage.sCompany);
		while (iWorkingDays < companyEmpWage.iMaxWorkingDays && iTotalWorkingHrs <= companyEmpWage.iMaxWorkingHrs) {
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
			if (iTotalWorkingHrs + iEmpHrs < companyEmpWage.iMaxWorkingHrs)
				iTotalWorkingHrs = iTotalWorkingHrs + iEmpHrs;
			else
				iTotalWorkingHrs = companyEmpWage.iMaxWorkingHrs;

			;

		}
		System.out.println("total working days : " + iWorkingDays + " and total working hours : " + iTotalWorkingHrs);
		return iTotalWorkingHrs * companyEmpWage.iEmpRate;
	}

	public static void main(String[] args) {
		IComputeEmpWage empWageBuilderUC11 = new EmployeeUC11nEmployeeBuilder();
		empWageBuilderUC11.addCompanyEmpWage("Dmart", 20, 2, 10);
		empWageBuilderUC11.addCompanyEmpWage("Reliance", 10, 4, 20);
		empWageBuilderUC11.addCompanyEmpWage("Flipkart", 20, 40, 200);
		empWageBuilderUC11.computeWage();

	}
}

