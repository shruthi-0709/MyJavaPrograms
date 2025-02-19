

import java.util.Scanner;

public class TemperatureCheck {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int temp;
       do{
         System.out.println("Enter temperature (C):");
         temp = scanner.nextInt();
       }while (temp<20 || temp >30);
       System.out.println("Temperature within range!");
       scanner.close();

    }
}
