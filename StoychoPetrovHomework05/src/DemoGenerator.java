import java.util.Scanner;

public class DemoGenerator {

	public static void main(String[] args) {
				
		System.out.println("Vyvedete broj na horata:");
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		// get the parasite \n left in the buffer
		sc.nextLine();
		
		Person[] personArr;
		String[] strArr;
		
		personArr = new Person[cnt];
		strArr = new String[cnt];
		
		for(int i=0; i<personArr.length; i++) {
			System.out.println("element[" + i + "]:");
			strArr[i] = new String(sc.nextLine());
			personArr[i] = new Person(strArr[i]);
		}

		// it's nice if the Array member type(Class) has toString() method overridden
		RandomGroupsGenerator rg1 = new RandomGroupsGenerator(personArr, 2);		
		System.out.println("--- Вариант 1 ---");
		rg1.printGroup();
		
		System.out.println("--- Вариант 2 ---");
		rg1.shuffle();
		rg1.printGroup();
		
		System.out.println("--- Вариант 3 ---");
		rg1.shuffle(3);
		rg1.printGroup();
		
		System.out.println("--- Вариант 4 ---");
		rg1.shuffle(4);
		rg1.printGroup();
		
		
		System.out.println("--- Вариант 5 ---");
		RandomGroupsGenerator rg2 = new RandomGroupsGenerator(strArr);
		rg2.printGroup();
		
		sc.close();
		
	}

}
