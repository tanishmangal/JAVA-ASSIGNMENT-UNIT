package checkWhether;
import java.util.Scanner;
public class CheckWhether {
	 boolean isSnowing;
	 boolean isRaining;
	 double temperature;
     void userInput() {
    	 Scanner myObj=new Scanner(System.in);
    	 System.out.println("Is Snowing");
    	  isSnowing=myObj.nextBoolean();
    	 System.out.println("Is raining");
    	  isRaining=myObj.nextBoolean();
    	 System.out.println("Enter Temperature");
    	  temperature=myObj.nextDouble();
     }
     void check(){
    	 if(isSnowing==true ||isRaining==true || temperature<50 )
    		 System.out.println("Lets stay home");
    	 else 
    		 System.out.println(" Let's go out.");
     }
	public static void main(String[] args) {
		
		CheckWhether obj=new CheckWhether();
		obj.userInput();
		obj.check();
		
	}

}
