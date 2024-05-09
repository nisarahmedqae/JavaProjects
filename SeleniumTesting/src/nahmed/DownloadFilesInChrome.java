package nahmed;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadFilesInChrome {

	public static void main(String[] args) throws InterruptedException {

		HashMap<String, Object> map = new HashMap<>();
		// change default download location
		map.put("download.default_directory", "C:\\SeleniumDownloadedFiles");

		// Turn off ask everytime to save each file before downloading
		map.put("download.prompt_for_download", false);

		// download pdf files instead of opening it
		map.put("plugins.always_open_pdf_externally", true);

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", map);

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// download doc file
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		driver.findElement(By.xpath("//a[contains(@href,'file-sample_100kB.doc')]")).click();

		driver.close();
	}

}
