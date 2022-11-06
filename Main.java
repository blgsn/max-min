
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		//assign the minimum to the maximum positive integer value that can be represented in 32 bits
		 int min = Integer.MAX_VALUE;
		 //assign the maximum to represents the minimum or least integer value that can be represented in 32 bits
		    int max = Integer.MIN_VALUE;
	//asks the user how many values to enter and gets the value
	 Scanner input = new Scanner(System.in);
     System.out.print("kaç tane sayı gireceksiniz ?");
     int number = input.nextInt();
    //shows numbers,if the number smaller than assigned min value,the number is min
     //if the number greater than assigned max value,the number is max
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
     //prints the max and min values 
       System.out.println("minimum :"+min);
     System.out.println("maximum:" +max);
   
	 } 
	 
}
