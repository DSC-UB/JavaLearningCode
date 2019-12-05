import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class SplitNumber{
	
	private Scanner keyboardInput;
	private int testNumber;

	public SplitNumber() {
		keyboardInput = new Scanner(System.in);
		
		System.out.println("Enter the number to split");
		testNumber = keyboardInput.nextInt();

		//get a number say 697
		int highestPlaceValue = (int)Math.pow(10, (Integer.toString(testNumber)).length());
		List<Integer> integers = new ArrayList<Integer>();

		for(int i=1; i<highestPlaceValue; i=i*10) {
			int temp = testNumber/10;
			integers.add(0, testNumber%10);
			testNumber = temp;
		}
		System.out.println(integers);		
	}

	public static void main(String[] args) {
		SplitNumber numberSplit = new SplitNumber();
	}
}
