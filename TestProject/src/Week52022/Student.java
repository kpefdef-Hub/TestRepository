package Week52022;
public class Student {
	//Adedapo Adeniyi
	//10/30/2022
	
	//Data fields
	
	private String tNumber, lName,fName, sMajor, underGrad, gradYear;
	 ;
	
	//Set/Modifier methods
	public void setTNumber (String tNum)
	{
		tNumber = tNum;
	}
	
	public void setLName (String lastN)
	{
		lName = lastN;
	}
	
	public void setFName (String firstN)
	{
		fName = firstN;
	}
	
	public void setSMajor (String major)
	{
		sMajor = major;
	}
	
	public void setUnderGrad (String level)
	{
		underGrad = level;
	}
	
	public void setGradYear (String gYear)
	{
		gradYear = gYear;
	}
	
	//Get/Accessor Methods
	public String getTNum()
	{
		return tNumber;
	}
	
	public String getLName()
	{
		return lName;
	}
	
	public String getFName()
	{
		return fName;
	}
	
	public String getSMajor()
	{
		return sMajor;
	}
	
	public String getUnderGrad()
	{
		return underGrad;
	}
	
	public String getGradYear()
	{
		return gradYear;
	}
		
	//Default Constructor
		Student ()
		{
			tNumber = "9999";
			lName = "Doe";
			fName = "Jo";
			sMajor = "XXXX";
			underGrad = "XXXX";
			gradYear = "1900";
			
		}
}
