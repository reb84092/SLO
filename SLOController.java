package SLO;

import input.view.SLOView;
public class SLOController
{
	private SLOView myPopups;
	
	
	
	
	public SLOController()
	
	{
		myPopups = new SLOView();
	}
	
	
	public void start()
	{
		
		
		String selectedNumber = myPopups.grabAnswer("Type in a number to guess what the base is.");
		myPopups.showResponse("You typed in" + selectedNumber);
		
		while(!isInteger(selectedNumber))
		{ 
			selectedNumber = myPopups.grabAnswer("Type in a postitive integer, please!");
		
		}
		int myNumber = Integer.parseInt(selectedNumber);
		boolean test = myNumber < 12;
		if(test)
		{
			selectedNumber= myPopups.grabAnswer("Your number is less than the base.");
		}
		else
		{
			selectedNumber = myPopups.grabAnswer("Your number is greater than the base.");
		}
		double thisNumber = Double.parseDouble(selectedNumber);
		boolean test1 = thisNumber < 11.9;
		if(test)
		{
			selectedNumber= myPopups.grabAnswer("Your number is less than the base.");
		}
		else
		{
			selectedNumber = myPopups.grabAnswer("Your number is greater than the base.");
		}
	}
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		{
			int temp = Integer.parseInt(input);
		    isInt =  true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("We're using integers here.");
		}
		return isInt;
		
		
		
	}
}
