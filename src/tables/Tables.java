package tables;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tables {

	/* public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/tringapps/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoqa.com/webtables");
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS); 
        JavascriptExecutor js = (JavascriptExecutor) driver;
//Static Webtable
       WebElement scrolling = driver.findElement(By.xpath("//div[@class = '-next']"));      
	     js.executeScript("arguments[0].scrollIntoView()", scrolling);   
       WebElement tables= driver.findElement(By.xpath("//div[contains(@class,'ReactTable')]"));
  //Printing heading values      
        String v = driver.findElement(By.xpath("//div[@class='rt-thead -header']")).getText();
      System.out.println(v);
  //Number of rows
      List<WebElement> rows = tables.findElements(By.xpath("//div[contains(@class,'rt-tr-group')]"));
      System.out.println("Total number of rows : "+rows.size());
  //Number of rows data
     List<WebElement> rowsdata = tables.findElements(By.xpath("//div[contains(@class,'rt-td') and text()]/ancestor::div[contains(@class,'rt-tr-group')]"));
     System.out.println("Total number of rows data: "+rowsdata.size());
  //Getting the row data
     System.out.println(rowsdata.get(0).getText());
  //Getting column data
     List<WebElement> cols = tables.findElements(By.xpath("//div[@class = 'rt-td'][3][text()]"));
     for(int i=0;i<cols.size();i++)
     System.out.println("column data: "+cols.get(i).getText());
  //Printing whole table
       for (int row = 0; row < rowsdata.size(); row++) {
 	    List < WebElement > Coldata = rowsdata.get(row).findElements(By.xpath(".//div[@class='rt-td'][text()]"));
 	    System.out.println("Number of cells in row " + row + " are " + Coldata.size());
 	    for (int column = 0; column < Coldata.size(); column++) {
 	        String data= Coldata.get(column).getText();
 	        System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + data);
 	    }
     }*/
@Test
    public  void dynamicTables()
    {
    	System.setProperty("webdriver.chrome.driver", "/home/tringapps/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/companies/most-traded?src=moneyhome_mosttraded_more");
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS); 
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement scrolling = driver.findElement(By.xpath("//p[@class = 'f14 bold']"));      
	     js.executeScript("arguments[0].scrollIntoView()", scrolling); 
	    WebElement tab = driver.findElement(By.xpath("//table[@class = 'dataTable']"));
	    if(tab.isDisplayed())
	    {
	    	System.out.println("Table is displayed successfully!!");
//Total Rows
	    List <WebElement> totalRows = driver.findElements(By.xpath("//table[@class = 'dataTable']//tbody//tr"));
	    System.out.println("Total rows: "+ totalRows.size());
//Total Column
	    WebElement specRow = driver.findElement(By.xpath("//table[@class = 'dataTable']//tbody//tr[2]"));
	    List<WebElement> totalCols = specRow.findElements(By.xpath(".//td"));
	    System.out.println("Total Column : "+ totalCols.size());
//particular row & col data
	    WebElement partVal = driver.findElement(By.xpath("//table[@class = 'dataTable']//tbody//tr[2]//td[3]"));
	    System.out.println("Particular value : "+ partVal.getText());
//List of position
	    List<WebElement> lists = driver.findElements(By.xpath("//table[@class = 'dataTable']//tbody//tr[position()<=5 and position()>1]"));
	    for(WebElement l : lists)
	    {
	    	System.out.println(l.findElement(By.xpath(".//td")).getText());
	    }
	    }
    }
}

