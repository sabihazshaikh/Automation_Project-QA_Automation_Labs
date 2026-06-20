package utility_Files;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot_Utility {
	public static String takeScreenhot(WebDriver driver, String name) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("usre.dir")+"/screenshots/"+name+".png";
		FileUtils.copyFile(src, new File(path));
		return path;
	}

}

