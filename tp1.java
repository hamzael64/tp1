package tp;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int secnum=10;
		while(true) {
		System.out.println("Enter the integer: ");
		Scanner ss = new Scanner(System.in);
       int num = ss.nextInt();
        if (num>secnum) {
        	System.out.println(" le numéro que vous avez saisi est supérieur au numéro secret \n");
        	} else if (num<secnum) {
        		System.out.println(" le numéro que vous avez saisi est inferieur au numéro secret \\n");
        	}else {
        		System.out.println("Bravo");
        	}
	}}
}