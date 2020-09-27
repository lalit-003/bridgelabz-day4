package EmployeeageAboveUC10;

import java.text.CompactNumberFormat;
import java.util.LinkedList;

public class EmployeeUC12nEmployeeBuilder implements IComputeEmpWage1 {
	

	public static final int iFullTime = 1;
	public static final int iPartTime = 2;

	private int iNoOfCompany = 0;
	private LinkedList<EmployeeUC10> companyWageList;

	public EmployeeUC12nEmployeeBuilder() {
		companyWageList = new LinkedList<>();
	}

	public void addCompanyEmpWage(String sCompany, int iEmpRate, int iMaxWorkingDays, int iMaxWorkingHrs) {
		EmployeeUC10  companyEmpWage = new EmployeeUC10(sCompany, iEmpRate, iMaxWorkingDays, iMaxWorkingHrs);
		companyWageList.add(companyEmpWage);
		// System.out.println("Linked List size : " + companyWageList.size());
	}

	public void computeWage() {
		for (int i = 0; i < companyWageList.size(); i++) {
			EmployeeUC10  companyEmpWage = companyWageList.get(i);
			companyEmpWage.setTotalWage(this.computeEmpWage(companyEmpWage));
			//companyEmpWageArray[i].setTotalWage(this.computeEmpWage(companyEmpWageArray[i]));
			//System.out.println(companyEmpWageArray[i]);
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
		IComputeEmpWage1 empWageBuilderUC12 = new EmployeeUC12nEmployeeBuilder();
		empWageBuilderUC12.addCompanyEmpWage("Dmart", 20, 2, 10);
		empWageBuilderUC12.addCompanyEmpWage("Reliance", 10, 4, 20);
		empWageBuilderUC12.addCompanyEmpWage("Flipkart", 20, 40, 200);
		
		empWageBuilderUC12.computeWage();
		

	}
}


