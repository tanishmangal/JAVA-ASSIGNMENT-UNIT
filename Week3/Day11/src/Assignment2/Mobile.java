package Assignment2;
import java.util.Scanner;
import javax.sound.midi.VoiceStatus;

public class Mobile {
	String[] outdatedModels = {"note4","note5","note6","note7"};

		void searchOutdatedModel(String name,String model) {
			
			for(String models: outdatedModels) {
				if(models.equals(model)) {
					System.out.println(model + "_OUTDATED");
					return;
				}
			}
			System.out.println("This Model Is Not Present");
			return;
		
	}

	public Mobile() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name of the company : ");
		String name = input.next();
		System.out.println("Enter the model no. : ");
		String model = input.next();
		new Mobile().searchOutdatedModel(name,model);

	}

}
