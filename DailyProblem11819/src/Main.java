
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
        Calculator calculator = new Calculator();
        InputParser inputParser = new InputParser();
        
        List<Integer> list = inputParser.getNumberList();
        System.out.println("Here's the list once you multiply every element, except the element in the current position, together: "
        		+ calculator.getNewListAfterCalculation(list));
        System.out.println("Here's the list calculated without using division: "
        		+ calculator.getNewListAfterCalculationWithoutDivision(list));
    }
}
