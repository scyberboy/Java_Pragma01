
public class ArrayDemo {

	public static void main(String[] args) {

		int[] myArray = new int[5];
		System.out.println(myArray.length);
		
		//////
		
		int index = 1;
		myArray[index]++;
		System.out.println(myArray[index-1]);
		
		System.out.println(myArray.toString());
		
		/////
		
		int[] myArray2 = new int[myArray.length + 1];
		System.arraycopy(myArray, 0, myArray2, 0, myArray.length);
		myArray2[myArray.length] = 33;
		
		// foreach | iterate over an array or iterable...
		for (int i : myArray2) {
			System.out.println(i);
		}
		
		/////
		
		
		
	}

}
