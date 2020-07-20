package InterviewQuestions;

import java.io.File;
import java.nio.file.Files;

import javax.swing.filechooser.FileSystemView;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class filesystem_methods {

//	@Test
	public static void drive_space()
	{
		
		System.out.println("List of Drives in the System :");
		File[] drives = File.listRoots();
		
		for (File files : drives) {
			System.out.println(files);
			FileSystemView files_folders = FileSystemView.getFileSystemView();
			System.out.println("type of drive "+files_folders.getSystemTypeDescription(files));
			System.out.println("total space of drive "+(files.getTotalSpace()/(1024*1024*1024)));
			System.out.println("usable space of drive "+files.getUsableSpace()/(1024*1024*1024));
			
		}
		
//		System.out.println("List of files and folders in the Drives in the System :");
		
		
		
		
	}
	
	
}
