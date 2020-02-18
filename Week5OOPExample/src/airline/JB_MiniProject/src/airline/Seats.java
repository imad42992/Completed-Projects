/**
 * 
 */
package airline.JB_MiniProject.src.airline;



/**
 * @author Darril
 *
 */
public class Seats {
	private static String[][] seats = new String[26][10];

	private static int counterFitFamily = 78;

	
	//default constructor
	public Seats() {
		
		popSeats();
	}//Eugene
	//method to initiate seating
	private void popSeats() {
		
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < 10; j++) {
				seats[i][j] = " ";
			}
		}
	}
	//method to check if seat is already booked if seat is already booked it will have you enter
	  //  another seat
	//Imad
	private boolean bookSeats(int s, int num) {
		if (seats[s][num] == "booked") {
			System.out.println("seat is already booked please choose another.");
			return false;
		} else {

			return true;
		}

	}
	//method to check how many families we can fit after booking
	public void output(int a) {

		if (seats[a][0] == "booked" || seats[a][1] == "booked" || seats[a][2] == "booked") {
			counterFitFamily--;
		}
		if (seats[a][4] == "booked" || seats[a][5] == "booked") {
			counterFitFamily--;
		}
		if (seats[a][7] == "booked" || seats[a][8] == "booked" || seats[a][9] == "booked") {
			counterFitFamily--;
		}
		if (seats[a][3] == "booked" && seats[a][6] == "booked") {
			counterFitFamily--;
		}

	}

	//Madhu
	//method to take input and split it into row and columns
	public void enterSeats(String seatbook) {
		int s = 0, num = 0;
		//take input seats and split into array
		String[] b = seatbook.toLowerCase().split(",");
		//to separate alphabet and the integer
		for (int i = 0; i < b.length; i++) {
			String[] c = b[i].split("(?<=\\D)(?=\\d)");
			char ch = c[0].trim().charAt(0);
			num = Integer.parseInt(c[1]);
		
			//method to convert alphabet to row index
			s = convertRow(ch);

			if (bookSeats(s, num - 1)) {
				seats[s][num - 1] = "booked";
			
			} else {
				System.out.println("this seat is already booked");
			}

		}

		for (int j = 0; j < 26; j++) {
			output(j);

		}
		System.out.println(" this is how many familys we can seat " + counterFitFamily);
		System.out.println("that is "+(counterFitFamily*3)+" seats");
	}
	//Valli
	//mapping each ALPHABET to corresponding row index in the array
	private int convertRow(char row) {
		int r = -1;
		try {

			switch (row) {
			case 'a':
				r = 0;
				break;
			case 'b':
				r = 1;
				break;
			case 'c':
				r = 2;
				break;
			case 'd':
				r = 3;
				break;
			case 'e':
				r = 4;
				break;
			case 'f':
				r = 5;
				break;
			case 'g':
				r = 6;
				break;
			case 'h':
				r = 7;
				break;
			case 'i':
				r = 8;
				break;
			case 'j':
				r = 9;
				break;
			case 'k':
				r = 10;
				break;
			case 'l':
				r = 11;
				break;
			case 'm':
				r = 12;
				break;
			case 'n':
				r = 13;
				break;
			case 'o':
				r = 14;
				break;
			case 'p':
				r = 15;
				break;
			case 'q':
				r = 16;
				break;
			case 'r':
				r = 17;
				break;
			case 's':
				r = 18;
				break;
			case 't':
				r = 19;
				break;
			case 'u':
				r = 20;
				break;
			case 'v':
				r = 21;
				break;
			case 'w':
				r = 22;
				break;
			case 'x':
				r = 23;
				break;
			case 'y':
				r = 24;
				break;
			case 'z':
				r = 25;
				break;

			}

		} catch (Exception ex) {
			System.out.println("something went wrong");
		}
		return r;
	}
	//Mamadou
	//printing the seating chart
	public void printPlane() {
		for (int k = 0; k < 26; k++) {
			System.out.print("row " + k + " |");
			for (int l = 0; l < 10; l++) {
				if (l == 3 || l == 7) {
					System.out.print("* * *|" + seats[k][l] + " |");
				} else
					System.out.print(seats[k][l] + " |");
			}
			System.out.println();
		}
	}

}
