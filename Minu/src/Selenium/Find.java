package Selenium;

public class Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Check if Links are presents 	
Boolean isPresent = driver.findElements(By.css("span['class=text-link text-bold text-size-5 text-size-sm-10 text-white']")).size() > 0;
//Check if Buttons are presents 
Boolean isPresent = driver.findElements(By.css("div.text-link text-bold text-size-5 text-size-sm-10")).size() > 0;     
//Check if Dropdown are presents
Boolean isPresent = driver.findElements(By.css("a['href=cars-for-sale/?configs=true&userAgent=Mozilla%2F5.0%20(Windows%20NT%2010.0%3B%20Win64%3B%20x64)%20AppleWebKit%2F537.36%20(KHTML%2C%20like%20Gecko)%20Chrome%2F80.0.3987.116%20Safari%2F537.36&geoZip=30028&zip=30040']")).size() > 0;     	
	
System.out.println(Elements Results is ,"Result");	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
