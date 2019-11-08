import java.util.ArrayList;
import java.util.List;

public class Calculator {
	
	protected Calculator() {
		
	}
	
	protected List<Integer> getNewListAfterCalculationWithoutDivision(List<Integer> list) {
		List<Integer> newList = new ArrayList<Integer>();
		for(int i=0; i<list.size(); i++) {
			newList.add(1); 
			for(Integer num : list) {
				if(!num.equals(list.get(i))) {
					newList.set(i, newList.get(i) * num);
				}
			}
		}
		return newList;
	}
	
	protected List<Integer> getNewListAfterCalculation(List<Integer> list){
		List<Integer> newList = new ArrayList<Integer>();
		for(int i=0; i<list.size(); i++) {
			newList.add(list.get(i));
			for(Integer num : list) {
				if(!num.equals(list.get(i))) {
					newList.set(i, newList.get(i) * num);
				}
			}
			newList.set(i, newList.get(i)/list.get(i));
		}
		return newList;
	}
}
