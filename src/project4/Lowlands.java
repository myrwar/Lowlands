
package project4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


class Lowlands {

	public static void main(String[] args) {

		Lowlands lowlands = new Lowlands();
		lowlands.naarLowlandsgaan();	
	}

	Scanner scanner = new Scanner(System.in); 
	//ArrayList <Podia> podia = new ArrayList<Podia>();
	ArrayList <SuperBezoeker> bezoeker = new ArrayList<SuperBezoeker>(); 
	
	
	Lowlands(){
		
		//podia.add(new Alpha());
		//podia.add(new Bravo());
		//podia.add(new Heineken());
		//podia.add(new India());
		//podia.add(new XRay());	
		
		bezoeker.add(new bezoeker1());

		bezoeker.add(new bezoeker3());
		
		System.out.println("Welkom op Lowlands 2018!!!");
	}
	
	 void naarLowlandsgaan () {}
		SuperBezoeker bezoekerKiezen(Lowlands lowlands) {
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
		return scanner.nextInt();
		}
		
		
		//public void concertKiezen() {
			//System.out.println("Welk concert wilt u bezoeken?\n"
					//+ "U heeft de volgende keuzes: ");
	
			
		//}
		//String okToetsen() {
			//return scanner.next();
			
		
		/*Moshen() {
			try {			
				Concertencontroleren(lowlands);
			} catch Maxconcertexception {
				String ok;
				do 
					System.out.println("Je hebt erg hard gefeest, toets ok om even te rusten en weer door te kunnen gaan");				
					mosh = okToetsen();
				} while(ok.equals("ok"));
				System.out.println("Lekker doorgaan");
			}
		}
	
		
		private void Moshen() {
			// TODO Auto-generated method stub
			
		}

		void Concertencontroleren(Lowlands lowlands) throws Maxconcertexception {
			lowlands.HP();
			if (lowlands.concerten == 4 ) {
				concerten.controle = 0;
				throw new Maxconcertexception();
			} else Lowlands.naarLowlandsgaan;
	}*/
		
}


	


