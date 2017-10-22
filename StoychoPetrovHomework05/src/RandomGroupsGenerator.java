import java.util.Random;

/**
 * Задача 1. Напишете програма за генериране на групи. Трябва да може да се
 * въвежда брой на хората и след това да се въвеждат и имената на самите хора.
 * Програмата трябва да генерира на случаен принцип групи от по 2-ма човека (ако
 * броят на хората е нечетно число, то някоя от групите ще бъде съставена от
 * 3-ма човека) и да изписва кои са групите.
 * 
 * @author Stoycho Petrov
 *
 */
public class RandomGroupsGenerator {

	// Fields
	private int groupSize;
	private Object[] group;

	// Ctors
	public RandomGroupsGenerator(Object[] arr) {
		this(arr,2);
	}

	public RandomGroupsGenerator(Object[] arr, int groupSize) {
		this.group = arr;
		this.groupSize = groupSize;
				
		shuffle();
	}
	
	
	// Methods
	
	private void swapElements(int a, int b) {
		Object tmp = group[a];
		group[a] = group[b];
		group[b] = tmp;
	}
	
	public void printGroup() {
		
		int numberOfGroups = group.length / groupSize;
		int reminder = group.length % groupSize;
		
		if(reminder != 0) {
			// uneven distribution - adjust nr of groups
			if(reminder > groupSize / 2) {				
				numberOfGroups++;
			}			
		}		
		
		// print 'em :)
		int idx = 0;
		int start = 0;
		int end = 0;
		
		for(idx = 0; idx < numberOfGroups; idx++) {
			
			System.out.print("Group[" + (idx+1) + "]: ");
			start = idx * groupSize;
			end = start + groupSize;
			// if it's last group - use last index (till the end of the grup), no matter what
			// if the last group has less people than previous - go back to bounds
			if(idx == numberOfGroups-1 || end > group.length) {
				end = group.length;
			}
			String participants = createGroup(start,end);
			System.out.println(participants);			
		}		
	}
	
	/**
	 *  string consist of [start,end) from class member group(array)
	 * @param start
	 * @param end
	 * @return comma separated list
	 */
	private String createGroup(int start, int end) {		
		StringBuilder result = new StringBuilder();		
		for(int i = start; i < end; i++ ) {
			result.append(group[i]);			
			if(i < end - 1) {
				result.append(", ");
			}
		}		
		return result.toString();		
	}	

	public void shuffle(int newGroupSize) {
		this.groupSize = newGroupSize;
		shuffle();
	}
	
	public void shuffle() {
		Random randomizer = new Random();
		for(int n = 0; n <= group.length/2; n++) {			
			int i = randomizer.nextInt(Integer.MAX_VALUE) % group.length;
			int j = randomizer.nextInt(Integer.MAX_VALUE) % group.length;			
			swapElements(i, j);
		}	
	}	
	

}
