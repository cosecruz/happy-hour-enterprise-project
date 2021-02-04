package giftdelivery;

import java.io.File;
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; 

public class RobotAI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void Execute(File inputCode) {
		try {
		File file = new File("droneAPI.txt");
		Scanner read = new Scanner(file);
		while (read.hasNextLine()) {
	        String data = read.nextLine();
	        Deliver(data);
	        
		}}
		catch(FileNotFoundException e){
			System.out.println("System are unable to find the file droneAPI");
			e.printStackTrace();
		}
		
	}
	public void Deliver(String data) {
		String direction = data;
		
		if(direction == "north") {
			Fly01();
		}
		else if(direction == "south")
			Fly02();
		else if(direction == "east")
			Fly03();
		else if(direction == "west");
	}
	public void Fly01() {
		System.out.print("fly north");
	}

	public void Fly02() {
		System.out.print("fly south");
	}
	public void Fly03() {
		System.out.print("fly east");
	}
	public void Fly04() {
		System.out.print("fly west");
	}
}
