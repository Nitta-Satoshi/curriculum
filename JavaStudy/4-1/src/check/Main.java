package check;

import constants.Constants;

public class Main {

	private String firstName;
	private String lastName;
	

	public Main() {
		
		this.firstName = "新田";
		this.lastName = "恵士";
	}
	
	private void printName() {
		
		System.out.println("printNameメソッド → " + this.firstName + this.lastName);
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Main main = new Main();
		main.printName();
		
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();
		
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robotPet.introduce();
		
	}

}
