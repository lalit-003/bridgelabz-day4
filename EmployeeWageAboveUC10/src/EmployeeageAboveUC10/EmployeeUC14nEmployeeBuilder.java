package EmployeeageAboveUC10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class EmployeeUC14nEmployeeBuilder implements IComputeEmpWage2 {

	public static final int iFullTime = 1;
	public static final int iPartTime = 2;

	private int iNoOfCompany = 0;
	private LinkedList<EmployeeUC10> companyWageList;
	private HashMap<String,EmployeeUC10> companyWageMap;

	public EmployeeUC14nEmployeeBuilder() {
		companyWageList = new LinkedList<>();
		companyWageMap = new  HashMap<>();
	}

	public void addCompanyEmpWage(String sCompany, int iEmpRate, int iMaxWorkingDays, int iMaxWorkingHrs) {
		EmployeeUC10 companyEmpWage = new EmployeeUC10(sCompany, iEmpRate, iMaxWorkingDays, iMaxWorkingHrs);
		companyWageList.add(companyEmpWage);
		companyWageMap.put(sCompany,companyEmpWage);
		// System.out.println("Linked List size : " + companyWageList.size());
	}

	public void computeWage() {
		for (int i = 0; i < companyWageList.size(); i++) {
			EmployeeUC10 companyEmpWage = companyWageList.get(i);
			companyEmpWage.setTotalWage(this.computeEmpWage(companyEmpWage));
			// companyEmpWageArray[i].setTotalWage(this.computeEmpWage(companyEmpWageArray[i]));
			// System.out.println(companyEmpWageArray[i]);
		}
	}

	private int computeEmpWage(EmployeeUC10 companyEmpWage)

	{

		ArrayList<Integer> dailywage = new ArrayList<Integer>();
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

			if (iTotalWorkingHrs + iEmpHrs < companyEmpWage.iMaxWorkingHrs) {
				iTotalWorkingHrs = iTotalWorkingHrs + iEmpHrs;
				int iDailyWage = iEmpHrs * companyEmpWage.iEmpRate;
				dailywage.add(iDailyWage);
			}

			else {
				iTotalWorkingHrs = companyEmpWage.iMaxWorkingHrs;
			}

		}
		System.out.println("total working days : " + iWorkingDays + " and total working hours : " + iTotalWorkingHrs);
/*for (int k = 1; k <= dailywage.size(); k++) {
			System.out.println("wage of day : " + k + " is :" + dailywage.get(k));
		}  */
		return iTotalWorkingHrs * companyEmpWage.iEmpRate;
	}
	@Override
	public int getTotalWage(String sCompany)
	{
		return companyWageMap.get(sCompany).iTotalWage;
	}


	public static void main(String[] args) {
		IComputeEmpWage2 empWageBuilderUC14 =new EmployeeUC14nEmployeeBuilder();
		empWageBuilderUC14.addCompanyEmpWage("Dmart", 20, 2, 10);
		empWageBuilderUC14.addCompanyEmpWage("Reliance", 10, 4, 20);
		empWageBuilderUC14.addCompanyEmpWage("Flipkart", 20, 40, 200);

		empWageBuilderUC14.computeWage();
		
		System.out.println("total wage for DMart company : " +empWageBuilderUC14.getTotalWage("Dmart"));
		System.out.println("total wage for Reliance : " +empWageBuilderUC14.getTotalWage("Reliance"));

	}
}

