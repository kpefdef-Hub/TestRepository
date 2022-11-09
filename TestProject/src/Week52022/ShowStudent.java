package Week52022;

import java.io.BufferedReader;
import java.io.FileReader;

import java.io.*;

import javax.swing.JOptionPane;

public class ShowStudent 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Adedapo Adeniyi
		//10/30/2022
		
		//Variables
		String tNo, lastName, firstName,major, gradLevel,yearGrad, fileTNo, line;
		
		
		//Create new student object
		 Student currStudent = new Student();
		 int startIndex = 0;
		
		//prompt student to enter t-number
		tNo = JOptionPane.showInputDialog(null, "Enter T-Number", "Search for Student", 3);
		
		//Search studentInfo.txt file
		 try
		 {
			 
			 FileReader fr = new FileReader("studentInfo.txt");
			 BufferedReader br = new BufferedReader (fr);
			 
			boolean foundStudent = false;
			 while((line = br.readLine()) != null)
				{
					
					startIndex=0;
					
					fileTNo = line.substring(startIndex, line.indexOf(","));
					
					//compare to email address entered by user
					
					if(tNo.equalsIgnoreCase(fileTNo))
					{
						//startIndex = line.indexOf(",") + 1;
						//tNo = line.substring(startIndex, line.indexOf(",",startIndex));
						foundStudent = true;
						startIndex = line.indexOf(",", startIndex) + 1;
						lastName = line.substring(startIndex ,line.indexOf(",", startIndex));
						startIndex = line.indexOf(",", startIndex) + 1;
						firstName = line.substring(startIndex ,line.indexOf(",", startIndex));
						startIndex = line.indexOf(",", startIndex) + 1;
						major = line.substring(startIndex ,line.indexOf(",", startIndex));
						startIndex = line.indexOf(",", startIndex) + 1;
						gradLevel = line.substring(startIndex ,line.indexOf(",", startIndex));
						startIndex = line.indexOf(",", startIndex) + 1;
						yearGrad = line.substring(startIndex ,line.length());
						
					//Create Instance of student class
					currStudent.setTNumber(tNo);
					currStudent.setLName(lastName);
					currStudent.setFName(firstName);
					currStudent.setSMajor(major);
					currStudent.setUnderGrad(gradLevel);
					currStudent.setGradYear(yearGrad);
					
					//Display the information
					System.out.println("Student Director Information");
					System.out.println("********************************************");
					System.out.println("TNumber:     " + currStudent.getTNum());
					System.out.println("First Name:  " + currStudent.getFName());
					System.out.println("Last Name:   " + currStudent.getLName());
					System.out.println("Major:       " + currStudent.getSMajor());
					System.out.println("Level:       " + currStudent.getUnderGrad());
					System.out.println("Expected Graduation Year:  " + currStudent.getGradYear());
					
					break;	
					}
					
					
				}
			 if (foundStudent == false)
			 {
				 System.out.println("No Student Information");
					System.out.println("********************************************");
					System.out.println("TNumber:     " + currStudent.getTNum());
					System.out.println("First Name:  " + currStudent.getFName());
					System.out.println("Last Name:   " + currStudent.getLName());
					System.out.println("Major:       " + currStudent.getSMajor());
					System.out.println("Level:       " + currStudent.getUnderGrad());
					System.out.println("Expected Graduation Year:  " + currStudent.getGradYear());
			 }
			 br.close();
			 {
				
			}
			 }
		 
		 
		 catch (IOException e)
		 {
			 System.out.println(e);
		 }
		 
	}
}

	


