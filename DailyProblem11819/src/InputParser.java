import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputParser {
	private BufferedReader buff;
	
	public InputParser() {
		buff = new BufferedReader(new InputStreamReader(System.in)); 
	}
	
	protected List<Integer> getNumberList () {
        System.out.println("Enter several numbers: ");
        List<Integer> list = new ArrayList<Integer>();
        do {
	        try {
				String[] test = buff.readLine().split(" ");
		        for (String temp : test) {
		        	list.add(Integer.parseInt(temp));
		        }
			} catch (Exception e) {
				System.out.println("You did not enter a valid series of numbers. Please enter several numbers:");
			}
        }while(list.isEmpty());
        return list;
	}
}
