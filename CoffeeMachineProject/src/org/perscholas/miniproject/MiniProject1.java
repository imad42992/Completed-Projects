package org.perscholas.miniproject;

import java.util.Scanner;

public class MiniProject1 {
	static int waterE = 250;	static int costE = 4;
	static int waterL = 350;	static int costL = 7;
	static int waterC = 200;	static int costC = 6;
	static int milkE = 0;		static int rWater = 10000;
	static int milkL = 75;		static int rMilk = 10000;
	static int milkC = 100;		static int rBeans = 10000;
	static int beansE = 16;
	static int beansL = 20;
	static int beansC = 12;
	static int cash =0;


	
	
		

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			System.out.println("Please make a selection:");
			while(true) {
			System.out.printf("\nMain Menu:\n -Buy\n -Fill\n -Take\n -Remaining\n -Exit\n");
			String userMenu = input.next();
			
			
			switch(userMenu.toLowerCase()) {
				case "buy": 
					System.out.printf("  1.Espresso-$4\n  2.Latte-$7\n  3.Cappucino-$6\n");
					int userCoffee = input.nextInt();
					
					while (userCoffee<1 || userCoffee>3) {
						System.out.println("Please enter 1-3");
						userCoffee = input.nextInt();
					}	
					if(userCoffee==1) {
						System.out.println("How many cups?");
						int userCup = input.nextInt();
						
						if(userCup*waterE > rWater || userCup*milkE > rMilk || userCup*beansE > rBeans) {
							System.out.print("Not Enough resources ");
						
							if(userCup*waterE > rWater) {
							System.out.print("water");
							}
							if(userCup*milkE > rMilk){
							System.out.print(" milk ");
							}
							if(userCup*beansE > rBeans)  {
							System.out.print(" coffee beans");
						}
						}
						else {
						System.out.printf("I have enough resources, making you %d cup(s) espresso\nOrder cost: $%d",userCup,(userCup*costE));
					
						
						rWater-=userCup*waterE;											
						rMilk-=userCup*milkE;				
						rBeans-=userCup*beansE;
						cash+= (userCup *costE);	

						
						userCup =0;
						userCoffee =0;
						
						}
						
					}
					else if(userCoffee==2) {
						System.out.println("How many cups?");
						int userCup = input.nextInt();
						
						if(userCup*waterL > rWater || userCup*milkL > rMilk || userCup*beansL > rBeans) {
							System.out.print("Not Enough resources ");
						
							if(userCup*waterL > rWater) {
							System.out.print("water");
							}
							if(userCup*milkL > rMilk){
							System.out.print(" milk ");
							}
							if(userCup*beansL > rBeans)  {
							System.out.print(" coffee beans");
						}
						}
						else {
						System.out.printf("I have enough resources, making you %d cup(s) latte\nOrder cost: $%d",userCup,(userCup*costL));
					
						
						rWater-=userCup*waterL;											
						rMilk-=userCup*milkL;				
						rBeans-=userCup*beansL;
						cash+= (userCup *costL);	

						
						userCup =0;
						userCoffee =0;
					}}
					else if(userCoffee==3) {
						System.out.println("How many cups?");
						int userCup = input.nextInt();
						
						if(userCup*waterC > rWater || userCup*milkC > rMilk || userCup*beansC > rBeans) {
							System.out.print("Not Enough resources ");
						
							if(userCup*waterC > rWater) {
							System.out.print("water");
							}
							if(userCup*milkC > rMilk){
							System.out.print(" milk ");
							}
							if(userCup*beansC > rBeans)  {
							System.out.print(" coffee beans");
						}
						}
						else {
						System.out.printf("I have enough resources, making you %d cup(s) cappucino\nOrder cost: $%d",userCup,(userCup*costC));
					
						
						rWater-=userCup*waterC;											
						rMilk-=userCup*milkC;				
						rBeans-=userCup*beansC;
						cash+= (userCup *costC);	

						
						userCup =0;
						userCoffee =0;
					}}
					break;

					
				case "fill":
					System.out.printf("How much water would you like to add?");
					rWater+=input.nextInt();
					System.out.printf("How much milk would you like to add?");
					rMilk+=input.nextInt();
					System.out.printf("How much coffee bean would you like to add?");
					rBeans+=input.nextInt();
					System.out.printf("You now have %d mL water, %d mL milk and %d mL coffee beans",rWater,rMilk,rBeans);
					
					input.close();
					break;

				case "take":
					System.out.printf("I'll give you a total of $%d",cash);
					cash=0;
					break;

				case "remaining":
					System.out.printf("We have %d water, %d milk, %d coffee beans\n Total cash is $%d",rWater,rMilk,rBeans,cash);
					break;

				case "exit":
					System.out.println("You have exited the coffee machine, have a great day!");
					System.exit(1);
					break;
				default:
					System.out.println("Incorrect input, please try again.");
					
			}
			}

	}

}
