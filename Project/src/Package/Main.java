package Package;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		String msg = "Hello, Java!";
		System.out.println(msg);
		
		Grade g = new Grade();
		g.input_grade(85, 90);
		g.output_grade();
	
		int array[];
		array = new int[5];
		
		for( int i = 0; i < array.length; i++ )
			array[i] = i;
		
		for( int i : array )
			System.out.print(i + " ");
		
		Scanner sc = new Scanner(System.in, "euc-kr");
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
			
		}

		
	}

}
