/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.io.*;

public class Main
{
        static int menu1 = 0;
        static int menu2 = 0;
        static int menu3 = 0;
        static int increment = 0;
        // static Robot robot1 = new Robot();
        static ArrayList<Hotdog> hotdog1 = new ArrayList<Hotdog>();
        static ArrayList<Hamburger> burger1 = new ArrayList<Hamburger>();
        static ArrayList<Chicken> chicken1 = new ArrayList<Chicken>();
        static ArrayList<Fries> fries1 = new ArrayList<Fries>();
        static ArrayList<Drinks> drink1 = new ArrayList<Drinks>();
        static ArrayList<Fries> fries2 = new ArrayList<Fries>();
        static ArrayList<Drinks> drink2 = new ArrayList<Drinks>();
        static ArrayList<Fries> fries3 = new ArrayList<Fries>();
        static ArrayList<Drinks> drink3 = new ArrayList<Drinks>();
        
        // List<Thread> menu11 = new ArrayList<Thread>();
        // List<Thread> menu22 = new ArrayList<Thread>();
        // List<Thread> menu33 = new ArrayList<Thread>();
        // List<Thread> kentang = new ArrayList<Thread>();
        // List<Thread> minum = new ArrayList<Thread>();
    
         public static void promptEnterKey(){
        System.out.println("Press \"ENTER\" to continue...");
        try {
            int read = System.in.read(new byte[2]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void PackageA(int value){
        Thread coursethread = new Thread(hotdog1.get(value));
        Thread snackthread = new Thread(fries1.get(value));
        Thread drinksthread = new Thread(drink1.get(value));
        
        coursethread.run();
        snackthread.run();
        drinksthread.run();
        
        System.out.println("Package A is completed ");
    }
    
    public static void PackageB(int value){
        Thread coursethread = new Thread(burger1.get(value));
        Thread snackthread = new Thread(fries2.get(value));
        Thread drinksthread = new Thread(drink2.get(value));
        
        coursethread.run();
        snackthread.run();
        drinksthread.run();
        
        System.out.println("Package B is completed ");
    }
    
    public static void PackageC(int value){
        Thread coursethread = new Thread(chicken1.get(value));
        Thread snackthread = new Thread(fries3.get(value));
        Thread drinksthread = new Thread(drink3.get(value));
        
        coursethread.run();
        snackthread.run();
        drinksthread.run();
        
        System.out.println("Package C is completed ");
    }
    
	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);
	    int choice,order1,order2,order3;
	    char sure;
	    do{
	    System.out.print("\033[H\033[2J"); 
	    System.out.println("Amount Packages :"+increment);
		System.out.println("Welcome to Cheong-Sun!!");
		System.out.println("Choose Your Package:");
		System.out.println("1.Package A");
		System.out.println("2.Package B");
		System.out.println("3.Package C");
		System.out.println("4.Exit Program");
		System.out.print("Input Choice[1-4]:");
		choice = myObj.nextInt();
		switch(choice){
		    case 1:
		        String course1 = "",snack1 = "",drink11 = "";
		        System.out.print("\033[H\033[2J"); 
		        System.out.println("Package A Menu List:");
		        System.out.println("Hotdog");
		        System.out.println("1.Original Hotdog");
		        System.out.println("2.Spicy Hotdog");
		        System.out.print("Input Order:");
		        order1 = myObj.nextInt();
		        if(order1 == 1) course1 = "Original Hot Dog";
		        else if(order1 == 2) course1 = "Spicy Hot Dog";
		        
		        System.out.println("French Fries");
		        System.out.println("1.Original French Fries");
		        System.out.println("2.Spicy French Fries");
		        System.out.print("Input Order:");
		        order2 = myObj.nextInt();
		        if(order2 == 1) snack1 = "Original French Fries";
		        else if(order2 == 2) snack1 = "Spicy French Fries";
		        
		        System.out.println("Drinks");
		        System.out.println("1.Sprite");
		        System.out.println("2.Coca-cola");
		        System.out.print("Input Order:");
		        order3 = myObj.nextInt();
		        if(order3 == 1) drink11 = "Sprite";
		        else if(order3 == 2) drink11 = "Coca-cola";
		        
		        hotdog1.add(new Hotdog(course1));
                fries1.add(new Fries(snack1));
                drink1.add(new Drinks(drink11));
		        System.out.print("Do you want to add more package?[Y/N]");
		        sure = myObj.next().charAt(0); 
		        if(sure == 'Y' || sure == 'y'){
		        menu1++;
		        increment++;
		        main(null);
		        }
		        else if (sure == 'N' || sure == 'n'){
		        menu1++;
		        increment++;
		        total();
		        return;
		        
		        }
		        
		    case 2:
		        String course2 = "",snack2 = "",drink22 = "";
		        System.out.print("\033[H\033[2J"); 
		        System.out.println("Package B Menu List:");
		        System.out.println("Hamburger");
		        System.out.println("1.Original Hamburger");
		        System.out.println("2.Spicy Hamburger");
		        
		        System.out.print("Input Order:");
		        order1 = myObj.nextInt();
		        if(order1 == 1) course2 = "Original Hamburger";
		        else if(order1 == 2) course2 = "Spicy Hamburger";
		        
		        System.out.println("French Fries");
		        System.out.println("1.Original French Fries");
		        System.out.println("2.Spicy French Fries");
		        System.out.print("Input Order:");
		        order2 = myObj.nextInt();
		        if(order2 == 1) snack2 = "Original French Fries";
		        else if(order2 == 2) snack2 = "Spicy French Fries";
		        
		        System.out.println("Drinks");
		        System.out.println("1.Sprite");
		        System.out.println("2.Coca-cola");
		        System.out.print("Input Order:");
		        order3 = myObj.nextInt();
		        if(order3 == 1) drink22 = "Sprite";
		        else if(order3 == 2) drink22 = "Coca-cola";
		        
		        burger1.add(new Hamburger(course2));
                fries2.add(new Fries(snack2));
                drink2.add(new Drinks(drink22));
		        System.out.print("Do you want to add more package?[Y/N]");
		        sure = myObj.next().charAt(0); 
		        if(sure == 'Y' || sure == 'y'){
		        menu2++;
		        increment++;
		        main(null);
		        }
		        else if (sure == 'N' || sure == 'n'){
		        menu2++;
		        increment++;
		        total();
		        return;
		        }
		        
		    case 3:
		        String course3 = "",snack3 = "",drink33 = "";
		        System.out.print("\033[H\033[2J"); 
		        System.out.println("Package C Menu List:");
		        System.out.println("Fried Chicken");
		        System.out.println("1.Original Fried Chicken");
		        System.out.println("2.Spicy Fried Chicken");
		        System.out.print("Input Order:");
		        order1 = myObj.nextInt();
		        if(order1 == 1) course3 = "Original Fried Chicken";
		        else if(order1 == 2) course3 = "Spicy Fried Chicken";
		        
		        System.out.println("French Fries");
		        System.out.println("1.Original French Fries");
		        System.out.println("2.Spicy French Fries");
		        System.out.print("Input Order:");
		        order2 = myObj.nextInt();
		        if(order2 == 1) snack3 = "Original French Fries";
		        else if(order2 == 2) snack3 = "Spicy French Fries";
		        
		        System.out.println("Drinks");
		        System.out.println("1.Sprite");
		        System.out.println("2.Coca-cola");
		        System.out.print("Input Order:");
		        order3 = myObj.nextInt();
		        if(order3 == 1) drink33 = "Sprite";
		        else if(order3 == 2) drink33 = "Coca-cola";
		        
		        chicken1.add(new Chicken(course3));
                fries3.add(new Fries(snack3));
                drink3.add(new Drinks(drink33));
		        System.out.print("Do you want to add more package?[Y/N]");
			    sure = myObj.next().charAt(0); 
		        if(sure == 'Y' || sure == 'y'){
		        menu3++;
		        increment++;
		        main(null);
		        }
		        else if (sure == 'N' || sure == 'n'){
		        menu3++;
		        increment++;
		         total();
		         return;
		        }
		        
		    case 4:
		        System.out.println("Thanks for trying out this program!!");
		        promptEnterKey();
		        System.exit(0);
		        
		    default:
		    System.out.println("Input not Available!");
		}
	    }while(choice != 4 || choice != 99);
		
	}
	
	public static void total(){
	    System.out.print("\033[H\033[2J");
	    System.out.println();
	    for(int i=0;i<increment;i++){
		    if(menu1>0){
		        PackageA(menu1-1);
		        menu1--;
		    }
		    if(menu2>0){
		        PackageB(menu2-1);
		        menu2--;
		    }
		    if(menu3>0){
		        PackageC(menu3-1);
		        menu3--;
		    }
		}
				promptEnterKey();
		long startTime = System.currentTimeMillis();
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken:"+(endTime-startTime));
		System.exit(0);
	}
}
