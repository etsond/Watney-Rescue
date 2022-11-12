
import java.util.Scanner;
import static java.lang.Math.*;

public class WatneyRescue {

	public static void main(String[] args) {

		//Creates a new instance object. Don't worry about this for now.
		WatneyRescue wr = new WatneyRescue();
		
		//A new scanner to read input from the user
		Scanner s = new Scanner(System.in);
		
		//The user's menu selection; 'd', 'r', 'q' or something else
		char inputChoice;
		
		do {
		
			System.out.println("Do you want 'd' distance mode, 'r' rover mode, or 'q' quit?");
			inputChoice = s.nextLine().charAt(0);
			
			
			switch(inputChoice) {
			
				//Enter distance mode; make the table then compute walking time based on the table
				case 'd':
					System.out.println("How many meters to Watney?");
					String line = s.nextLine();
					double metersToWatney = Double.parseDouble(line.trim());
					
					String table = wr.generateContingency(metersToWatney);
					System.out.println(table);
					
					System.out.println("Which row?");
					line = s.nextLine();
					int row = Integer.parseInt(line.trim());
					
					System.out.println(wr.computeWalkingTime(metersToWatney,table,row));
					break;
					//Enter rover mode; receive and translate a series of angles for the rover
				
				case 'r':
					System.out.println("What series of angles?");
					String angles = s.nextLine();
					
					System.out.println("Mission control on earth sends the following message:\n");
					System.out.println(wr.interpretHexadecimal(angles) + "\n");
					break;
					//Quit
				
				case'q':
					continue;
					//Ignore anything that isn't 'd', 'r', or 'q'
				
				default:
					continue;
			
			}
		
		} while (inputChoice != 'q'); //keep going until we get 'q'

		System.out.println("Goodbye. May the hexadecimals be with you.");
		//Close the scanner to keep eclipse from driving me crazy with its warnings
		s.close();
	}

	
	/**
	* Generates a contingency table of distances that Watney
	* will have to travel to the ship
	* @param distLewisWatney The distance in meters from Lewis to Watney,
	* as read from Lewis' suit sensors
	* @return
	*/

	public String generateContingency(double distLewisWatney) {
		
		String result = "";
		result += "Contingencies given distance " + distLewisWatney + " from Lewis to Watney:\n";
		
		//TODO: Compute the table values for Lewis angle from north ranging every five degrees
		//from 15 to 75 inclusive, and for her distance to the hab for every three meters from 15
		//to 30 inclusive. Solve each row for Watney's distance to the hab. Round everything
		//to the nearest meter.
		
		int counting =1;
		//Create an int incrementing by 5
		for (int i=15; i<=75; i=i+5){
			//creatig a for loop inside a for loop to increment by 3
			for(int j=15; j<=30; j=j+3){
				int finalDistance;
				//Create local variable to add to the logarithm of law of cosine to compute the result
				double tmp1, tmp2, tmp3, dist;
				tmp1 = Math.pow(distLewisWatney, 2);
				tmp2 = Math.pow(j, 2);
				tmp3 = (2*distLewisWatney*j*Math.cos((Math.toRadians (90-i))));
				
				//Using the law of cosinne to compute the unknown
				dist = tmp1 + tmp2 - tmp3;
				finalDistance = (int) Math.rint(Math.sqrt(dist));
				//System.out.println(counting + ") " + i + " | " + j + " | " + finalDistance );
				result += (counting + ") " + i + " | " + j + " | " + finalDistance ) + "\n";
				counting++;
			}	
		}
		//Return what the string 
		return result;
	}

	/**
	* This method computes how long it will take Watney and Lewis to walk to the hab
	* given their distances from it. The necessary distances must be looked up within
	* the table provided as a parameter.
	* @param distLewisWatney The distance Lewis is from Watney, as measured by her suit
	* @param table The table of angle and distance values generated from another method
	* @param row The row of the table that should be used in the calculation
	* @return
	*/

	public String computeWalkingTime (double distLewisWatney, String table, int row) {
	
		//TODO: Traverse the table to get the correct row's string. (Hint: look at the
		//starter code for the interpretHexadecimal method to see a cool trick for stepping
		//through a String and breaking it apart using a certain character.)
		//TODO: Extract from that row the needed distance.
		//TODO: Compute the walking time for Watney and Lewis to the ship.
		//Watney is injured so his walking pace is 0.9 meters per second.
		//Lewis' walking pace is 1.7 meters per second.
		
		// First splitting to split all the different rows
		String[] tokens = table.split("\n");
		String valAtRow = tokens[row];
		
		//reading the space to skip it so the computer can read the next value using delimeters
		String delims = "[ |]+";
		String[] values = valAtRow.split(delims);
		
		//Create two int varible to store the values for both row 2 and three
		int numb1 = Integer.parseInt((values[2]));
		int numb2 = Integer.parseInt(values[3]);
		
		//Algorithm to solve the time it would take both lewis and watney by dividing it by there meters per second 
		double disToNumb1 =((numb1)/(1.7));
		double disToNumb2 = (numb2)/(0.9);
		
		//use two variable x and y to round the time for lewis and watney
		double x = Math.rint(disToNumb1);
		double y = Math.rint(disToNumb2);
		
		String result= ( "Lewis walking time to ship: " + (int)y + " seconds\n" + "Watney walking time to ship: " + (int)x + " seconds\n");
		System.out.println(result);
		return "";
	}

	
	/**
	* This method interprets a series of angles around a circle to find the hexadecimal
	* digit they "point to" on the circle. Then, it maps those hexadecimal pairs to characters from the
	* English alphabet. The 360 degrees of the circle are broken into 16 equal pieces of 22.5 degrees each.
	* @param angles The comma-delimited list of angles
	* @return a String with the message in English
	*/

	public String interpretHexadecimal(String angles) {
		
	
		//An easy way to break apart a list of things is to make a Scanner on it
		//This Scanner is unrelated to any other variables with the same name because this
		//one is only meaningful inside this method. Also, this scanner does not read from the
		//console! It only operates over the one String you created it on, namely angles.
		
		Scanner s = new Scanner(angles);
		
		//You can tell each Scanner what you want it to use to break up the String.
		//Making it a comma, when you call next() you get whatever is between the commas.
		//Pretty convenient.
		
		s.useDelimiter(",");
		
		//TODO: Complete this method :)
		//if else statement to convert from angle to hexadecimal
		//if else statement to convert from hexadecimal to decimal

		String[] storeNumb = angles.split(",");
		int[] secondNumbs = new int [storeNumb.length];
		String message= "";
		
		//Computing the hexadecimal values corresponding to every angle entered by user
		// and storing those values in an array
		for(int i=0; i< storeNumb.length ; i++){
			secondNumbs[i]= (int)(Double.parseDouble(storeNumb[i]) / 22.5);
		}
		
		//create the for loop inside of a for loop find when do you add the number in pairs
		for (int i=0; i< secondNumbs.length ; i++){
			if(i%2 == 1){
//						System.out.println("secondNumbs[0] = " + secondNumbs[0]);
//						System.out.println("secondNumbs[1] = " + secondNumbs[1]);
				
				//take the previous one and concatenate with the current one
				String prev = "" + Integer.toHexString(secondNumbs[i-1]);
				String curr = "" + Integer.toHexString(secondNumbs[i]);
				String hexPair = prev + curr;
				
//						System.out.println("hex pair: " + hexPair);
				message += (char) Integer.parseInt(hexPair, 16);
			}
		}
		return message;
	}
}
