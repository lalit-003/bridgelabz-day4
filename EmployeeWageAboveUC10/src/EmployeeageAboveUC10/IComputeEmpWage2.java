package EmployeeageAboveUC10;

public interface IComputeEmpWage2 {
	public void addCompanyEmpWage
	(String sCompany, int iEmpRate, int iMaxWorkingDays, int iMaxWorkingHrs);
	
	public  void computeWage() ;

	public int getTotalWage(String sCompany);

}
