	package MidTermExam;
	
	import javax.swing.JOptionPane;
	
	public class Payroll
			{
			public static void main(String[] args) 
			//Adedapo Adeniyi
			//10/01/2022
	{
			//Declaring the Variables
			int hoursWorked = 0;
			int normalHours = 40;
			double managerRate = 25.0;
			double employeeRate = 16.0;
			double managerOvertime = 37.5;
			double employeeOvertime = 24.0;
			double taxRate = 0.26;
			double socialRate = 0.04;
			double unempRate = 0.01;
			double retireRate = 0.05;
			double healthRate = 0.01;
			double grossPay = 0 ;	
			
			//Prompt user to confirm if manager or employee
			int reply = JOptionPane.showConfirmDialog(null, "Are you a Manager?");
			
			//Prompt user to enter hours worked
					String results = JOptionPane.showInputDialog(null, "Enter total hours worked for the week");
					hoursWorked = Integer.parseInt(results);
					
					int overtimeHours = hoursWorked - 40;
					
			if ((reply == JOptionPane.YES_OPTION)&& hoursWorked > 40 )
			{
				 grossPay = (managerOvertime * overtimeHours) + (managerRate * normalHours);		
			}
			else if ((reply == JOptionPane.YES_OPTION) && hoursWorked <=40)
			{
				grossPay = managerRate * hoursWorked;
			};
			if ((reply == JOptionPane.NO_OPTION)&& hoursWorked > 40 )
			{
				 grossPay = ((employeeOvertime * overtimeHours)+ (employeeRate * normalHours));		
			}
			else if ((reply == JOptionPane.NO_OPTION) && hoursWorked <=40)
			{
				grossPay = employeeRate * hoursWorked;
			};
			
			
		
			//Calculating the Deductions
			
			double socialSecurity = socialRate * grossPay;
			double unemploymentInsurance = unempRate * grossPay;
			double retirementBenefits = retireRate * grossPay;
			double healthInsurance = healthRate * grossPay;
			double taxDeduction = taxRate * grossPay;
			
			double totalDeduction = socialSecurity + unemploymentInsurance + retirementBenefits + healthInsurance
					+ taxDeduction;
			
			//Calculating the Net Pay
			double netPay = grossPay - totalDeduction;

			
			//Displaying Pay slip
			JOptionPane.showMessageDialog(null, "Regular Hours  =  " +  normalHours + "\n" +  "Overtime Hours = " 
			+ overtimeHours + "\n" +"Gross Pay  = "+ "$"+ String.format("%,.2f", grossPay)+"\n" + 
			"***************Deductions**************" + "\n" + "Social Security  =  " + "$" + 
			String.format("%,.2f",socialSecurity)+"\n" + "Unemployment Insurance = " +"$"+ String.format("%,.2f", unemploymentInsurance) +
			"\n" + "Retirement Benefits   =  " + "$" + String.format("%,.2f", retirementBenefits)+  "\n" +"Health Insurance  = " + "$"+String.format("%,.2f",healthInsurance) +"\n" + "Taxes  = " + "$"+ String.format("%,.2f", taxDeduction) + "\n" + "********************************************" 
			+"\n" +"Net Pay = " +  "$"+ String.format("%,.2f",netPay));
	}
			
			}
