package PracticeCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewPractice {

	
	public static void main(String[] args) {

	
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://www.google.com/search?q=google&oq=google&gs_lcrp=EgZjaHJvbWUqBggAEEUYOzIGCAAQRRg7MgYIARBFGDsyBggCEEUYQTIGCAMQRRg8MgYIBBBFGDwyBggFEEUYQTIGCAYQRRhB0gEHNzk2ajBqOagCALACAA&sourceid=chrome&ie=UTF-8");
	String title=	dr.getTitle();
		System.out.println(title);
		

		
	}

}
