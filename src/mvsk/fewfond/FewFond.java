package mvsk.fewfond;

import java.util.ArrayList;
import java.util.Scanner;

public class FewFond {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("[INPUT]: ");
		int x = reader.nextInt();
		ArrayList<Double> array = new ArrayList<Double>();
		for (int i = 0; i < x; i++) 
		{
			array.add(reader.nextDouble());
		}
	}

}
