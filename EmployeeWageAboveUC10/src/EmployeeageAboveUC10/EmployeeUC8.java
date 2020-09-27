package EmployeeageAboveUC10;

public class EmployeeUC8 {
	public static final int iFullTime = 1;
	public static final int iPartTime = 2;
	
	public static int iEmpHrs = 0;
	public static int iEmpWage = 0;
	
	public static int iTotalWorkingHrs=0;
	public static int iTotalWage = 0;
	public static int iWorkingHrs = 0;
		public static int WageCalculation(String sCompany,int iEmpRate,int iMaxWorkingDays,int iMaxWorkingHrs)
	{
			int iTotalWorkingHrs=0;

		int iWorkingDays = 0;
		System.out.println("Company name is " +sCompany);
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
			if (iTotalWorkingHrs+iEmpHrs<iMaxWorkingHrs)
			iTotalWorkingHrs=iTotalWorkingHrs+iEmpHrs;
			else
				iTotalWorkingHrs=iMaxWorkingHrs;
			
		}
		iTotalWage=iTotalWorkingHrs*iEmpRate;
		System.out.println("total working days : "+ iWorkingDays + " and total working hours : " +iTotalWorkingHrs);
		System.out.println("total wage  is " + iTotalWage);

		return iTotalWage;
	}
	public static void main(String[] args){
	  
		WageCalculation("flipkart", 20, 23, 100);
		WageCalculation("samsung", 150, 50, 70);
		WageCalculation("Kisaan",10, 30, 12);
	
	}
	}
               
	

