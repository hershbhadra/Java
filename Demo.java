//Hersh Bhadra: This program demonstrates the code in ExceptionA, ExceptionB, and ExceptionC

public class Demo 
{
	public static void main(String[] args)
	{
		try
		{
			getExceptionB();//call getExceptionB
			}//end try
		catch(ExceptionA Exception)
		{
			Exception.printStackTrace();
			}//end catch
		
		try
		{
			getExceptionC();//call getExceptionC
			}//end try
		catch(ExceptionA Exception)
		{
			Exception.printStackTrace();
			}//end catch
		}//end main
	
	public static void  getExceptionB() throws ExceptionB//throw exception back to ExceptionA
	{
		throw new ExceptionB("Exception thrown in getExceptionB");
        }//end get ExceptionB
	
	public static void  getExceptionC() throws ExceptionC//throw exception back to ExceptionB
	{
        throw new ExceptionC("Exception thrown in getExceptionC");
        }//end getExceptionC
	}//end class Demo