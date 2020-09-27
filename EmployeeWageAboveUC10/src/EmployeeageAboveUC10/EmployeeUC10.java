package EmployeeageAboveUC10;

public class EmployeeUC10 {
	public int iTotalWage;

	public final String sCompany;
	public final int iEmpRate;
	public final int iMaxWorkingDays;
	public final int iMaxWorkingHrs;

	public EmployeeUC10(String sCompany, int iEmpRate, int iMaxWorkingDays, int iMaxWorkingHrs) {
		this.sCompany = sCompany;
		this.iEmpRate = iEmpRate;
		this.iMaxWorkingDays = iMaxWorkingDays;
		this.iMaxWorkingHrs = iMaxWorkingHrs;
	}

	public void setTotalWage(int iTotalWage) {
		this.iTotalWage = iTotalWage;
	}

	@Override
	public String toString() {
		return "Total wage of employee of company : " + sCompany + " is : " + iTotalWage;
	}
}
