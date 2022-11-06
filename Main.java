

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		 int min = Integer.MAX_VALUE;
		    int max = Integer.MIN_VALUE;

	 Scanner input = new Scanner(System.in);
     System.out.print("kaç tane sayı gireceksiniz ?");
     int number = input.nextInt();
    
     for(int i=1;i<=number;i++) {
    	 System.out.print(i+".sayıyı giriniz.");
         int n = input.nextInt(); 
       
         if (n < min) {
             min = n;
         }
         if (n > max) {
            max = n;
         }
     }
       System.out.println("minimum :"+min);
     System.out.println("maximum:" +max);
   
	 } 
	 
}
