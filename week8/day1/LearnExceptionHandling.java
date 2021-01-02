package week8.day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExceptionHandling {
	
	
	public static int divide(int x, int y) {
		int z;
		if( x < y)
		{
			throw new ArithmeticException("Incorrect inputs: first number is smaller");
		}else {
			z = x/y;
		}
			
		return z;
	}
	

	public static void main(String[] args) throws IOException  {
		
	//	FileInputStream fis = new FileInputStream("./data/createlead.xlsx");
		
	//	File file = new File(fis);
		try {
			XSSFWorkbook wb = new XSSFWorkbook("./data/test.xlsx");
			
			wb.getSheetAt(0);
			
			wb.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	//	fis.close();
		
		
		/*
		 * try { int result = divide(5,10); System.out.println(result); } catch
		 * (Exception e) { System.out.println(e); }
		 */
		
		
		/*
		 * int x = 10; int y = 0; int z;
		 */
	//	int[] values = { 10, 20, 30 };
		
		/*
		 * try { z = x / y; System.out.println(z); }catch (Exception e) {
		 * System.out.println(e); } finally { System.out.println("finally block");
		 * //Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe"); }
		 */

		/*
		 * try { z = x / y; System.out.println(z); try { System.out.println(values[3]);
		 * } catch (ArrayIndexOutOfBoundsException e) { System.out.println(e); }
		 * 
		 * } catch (ArithmeticException e) { System.out.println(e); } catch (Exception
		 * e) { System.out.println(e); }
		 */

		System.out.println("Last line of my program");

	}

}
