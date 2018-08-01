package poging3;

import java.util.ArrayList;
import java.util.Scanner;


class Lowlands3 {

	public static void main(String[] args) {

		Lowlands3 lowlands = new Lowlands3();
		lowlands.naarLowlandsgaan();	
	}

	Scanner scan = new Scanner(System.in); 
	ArrayList <Superbezoeker3> bezoeker = new ArrayList<Superbezoeker3>();
	
	Lowlands3(){
		bezoeker.add(new Bezoeker1());
		System.out.println("Welkom op Lowlands 2018!!");	
	}
	
	 void naarLowlandsgaan () {}
		Superbezoeker3 bezoekerKiezen(Lowlands3 lowlands) {
		System.out.println("U kunt kiezen om Lowlands te beleven door de ogen van \n"
				+ "3 verschillende mensen");	
		for(int i = 0 ; i < bezoeker.size() ; i++) {	
			System.out.println(i+1 + " " + bezoeker.get(i).getnaam() +bezoeker.get(i));				
		}		 
		int userInput;		
		do {
			System.out.println("\nToets het cijfer van de bezoeker die u graag wilt:");
			userInput = (toetsen());
		if (userInput < 1 | userInput >= 4 )
			System.out.println("Dit is onjuist, maak een keuze tussen 1 en 3. ");
		} 
		while (userInput != 1 && userInput != 2 && userInput != 3); 
		return bezoeker.get(userInput - 1);}
	
		int toetsen() {
		return scan.nextInt();
		}
	
	
}


