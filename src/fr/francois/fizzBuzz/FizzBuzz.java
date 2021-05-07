package fr.francois.fizzBuzz;


public class FizzBuzz {
	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++) {
			if(i%3 == 0 && i%5 == 0) {
				System.out.println("fizzBuzz");
			}else if (i%3 == 0) {
				System.out.println("fizz");
			}else if (i%5 == 0) {
				System.out.println("Buzz");
			}
			if(i%10 == 9) {
				System.out.println("\n");
			}
		}
	}
}
