package MidTermExam;


import javax.swing.JOptionPane;

public class GPACalculator {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Adedapo Adeniyi
		//10/01/2022
		
		//declaring the variables
		int courseCount;
		double GPA = 0;
		double averageGPA = 0;
		
		
		//Prompt the user to enter number of courses using JOptionPane
		
		String results = JOptionPane.showInputDialog(null,"Please enter number of courses taken in "
		+ "Spring 2022 Semester");
		courseCount = Integer.parseInt(results);
		
		//Prompt User to enter grade passed for each of the courses taken
		
		for(int i = 1; i <= courseCount; i++)
		{
			String courseGrade = JOptionPane.showInputDialog(null,"Please enter the grade scored for course " + (i));	
		
		//Adding the GPA per course
			
			switch(courseGrade) 
			{
			   case "A" : 
				   GPA += 4.0;	  
			       break; 
			   
			   case "B" :
				   GPA += 3.0;		      
			       break; 
			      
			   case "C" :
				   GPA += 2.0;
				   break;
				      
			   case "D" :
				   GPA += 1.0;
				   break;
			  
			   default : 
				   JOptionPane.showMessageDialog(null, "Wrong Input, please enter correct grade");
			}
			
		}
		
		//Calculating the Semester GPA
		
		averageGPA = GPA/courseCount;
		
		// Displaying the Semester GPA
		JOptionPane.showMessageDialog(null, "Your Spring 2022 Semester GPA is " + averageGPA);
		
	
		
		
		
		
		
	
	}

}
