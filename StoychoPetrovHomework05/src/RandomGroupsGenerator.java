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

	private int minGroupSize;
	private int maxGroupSize;
	private Object[] group;
	
	public RandomGroupsGenerator(Object[] arr) {
		this(arr, 1, 3);
	}

	public RandomGroupsGenerator(Object[] arr, int groupSize) {
		this(arr, groupSize, groupSize);
	}
	
	public RandomGroupsGenerator(Object[] arr, int minGroupSize, int maxGroupSize) {

		this.minGroupSize = minGroupSize;
		this.maxGroupSize = maxGroupSize;
		this.group = arr;
		
		shuffle();
	}
	
	private void swapElements(int a, int b) {
		Object tmp = group[a];
		group[a] = group[b];
		group[b] = tmp;
	}
	
	public void printGroup() {
		
		for(int i = 0; i < group.length; i++) {
			
			System.out.println("Group[" + i + "]: ");
			
			for(int j = 0; j < minGroupSize; j++) {
				
				int index = (minGroupSize * i) + j;
				System.out.print(group[index]);
				if(j < minGroupSize - 1) {
					System.out.print(", ");
				} else {
					System.out.println();
				}
				
				
			}
			
			
		}
		
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
