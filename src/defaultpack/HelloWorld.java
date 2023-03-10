package defaultpack;
import java.util.Scanner;


//Scope issues
int num1;
int num2;

public static int add(int a, int b) {
	int sum = a + b;
	return sum;
}

// end scope issues

public class HelloWorld {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World");
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name?");
        String firstName = input.nextLine();
        System.out.printf("Hello %s!\n", firstName);
        System.out.printf("Goodbye %s!\n", firstName);
        System.out.println("What is your favorite number?");
        int favNumber = input.nextInt();
        System.out.println("So your favorite number is " + favNumber);
        input.close();
      //  int nextNum = input.nextInt(); //Won't work because scanner has been closed
      //  String myString = (3); //Won't work because 3 is an int not string
        String anotherString;
        anotherString = "this is a string";

        int result = add(5, 5); //Doesn't work because the function is outside of the scope
        System.out.println(result);
        
        string oops = "string should be capitalized!"; //Should be String not string
        
        int i;
        for(i=0; i < 6; i++) {
        	if(i % 2 = 0) { //Won't work because = should be ==
      		System.out.println("fizz");
        	} else {
        		System.out.println("buzz");
        	}
        }
        
	}

}
