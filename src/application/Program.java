package application;

import java.util.Scanner;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter rectangle width and height: ");
		
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println("AREA: " + rectangle.area());
		System.out.println("PERIMETER: " + rectangle.perimeter());
		System.out.println("DIAGONAL: " + rectangle.diagonal());
		
		sc.close();

	}

}
