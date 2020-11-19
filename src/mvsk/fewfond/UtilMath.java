package mvsk.fewfond;

import java.util.ArrayList;
import java.util.Collections;

public class UtilMath {

	public static double getAverage(ArrayList<Double> array) {
		if (array.isEmpty()) 
		{
			return 0;
		}
		double more = 0;
		for (int i = 0; i < array.size(); i++) 
		{
			more = more+array.get(i);
		}
		double total = more/array.size();
		return total;
	}
	
	public static double getMidrange(ArrayList<Double> array) {
		if (array.isEmpty()) 
		{
			return 0;
		}
		return (array.get(0)+array.get(array.size()-1))/2;
	}
	
	public static double getMedian(ArrayList<Double> array) {
		if (array.isEmpty()) 
		{
			return 0;
		}
		sortArray(array);
		double total = 0;
		int number = array.size()%2;
		if (number == 0) 
		{
			double min = array.get(array.size()/2-1);
			double max = array.get(array.size()/2);
			total = min+max;
		} else {
			total = (array.size()+1);
		}
		total = total/2;
		return total;
	}
	
	public static ArrayList<Double> sortArray(ArrayList<Double> array) {
		if (array.isEmpty()) 
		{
			return null;
		}
		Collections.sort(array);
		return array;
	}
	
}
