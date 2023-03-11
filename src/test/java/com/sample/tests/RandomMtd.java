package com.sample.tests;

//import java.util.List;
import java.util.Random;

//import org.openqa.selenium.WebElement;

public class RandomMtd {

	
//	public static void clickRandomOptions(List<WebElement> listOptions,int numberOfTimes) {
//		int listSize = listOptions.size();
//		for (int i = 1; i <= numberOfTimes; i++) {
//			Random ran = new Random();	
//			int num = ran.nextInt(listSize);
////			WebElement toSet = element.get(num);
////			toSet.click();
//			System.out.println(num);
//		}
//	}
	
	public static void clickRandomOptions(int numberOfTimes) {
		int listSize = 40;
		for (int i = 1; i <= numberOfTimes; i++) {
			Random ran = new Random();	
			int num = ran.nextInt(listSize);
//			WebElement toSet = element.get(num);
//			toSet.click();
			System.out.println(num);
		}
	}
	
//	public void selectRandomDropDownValue(WebElement locator, List<WebElement> listOptions) {
//		Select select = new Select(locator);
//		int listSize = listOptions.size();
//		// System.out.println(listSize);
//		Random ran = new Random();
//		int ranNo = ran.nextInt(listSize);
//		select.selectByIndex(ranNo);
//	}
	
	public static String fileName = null;
	public static String randomFileType() {
		String[] typeOfFile = { "sample_company_name_list.csv", "sample_domain_list.csv",
				"sample_d-u-n-s_number_list.csv" };
		Random random = new Random();
		int randomString = random.nextInt(typeOfFile.length);
		fileName = typeOfFile[randomString];

		return fileName;
	}

	public static String NewFilename = null;
	public static void uploadDiffFileType() {
		System.out.println("With Ext:"+" "+fileName);
		String fileWithoutExten = fileName.replace(".csv", "");
		
		System.out.println("Without Ext:"+" "+fileWithoutExten);
	}
	public static void generateRandomNumbers() {
		Random ran = new Random();
		System.out.println(ran.nextInt(999)); 
	}
	
	public static void main(String[] args) {
//		clickRandomOptions(7);
//		randomFileType();
//		uploadDiffFileType();
		generateRandomNumbers();
	}
}
