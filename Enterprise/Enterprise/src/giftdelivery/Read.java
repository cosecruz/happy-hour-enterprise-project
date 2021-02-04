package giftdelivery;
import java.io.File;
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; 

public class Read {
File location;
	
	Read(File location){
		this.location=location;
	}
	
	public File translate(File location) {
		File droneAPI = new File("droneAPI.txt");
		String txt;
		try {
			File file = new File("Customerlocation.json");
			Scanner read = new Scanner(file);
			while (read.hasNextLine()) {
		        String data = read.nextLine();
		        
		        
			}
			
		txt = RecalculatingRoute();
			
			}
			catch(FileNotFoundException e){
				System.out.println("System are unable to find the file droneAPI");
				e.printStackTrace();
			}
		return droneAPI;
	}
	public String RecalculatingRoute() {
		return "API";
	}
}
