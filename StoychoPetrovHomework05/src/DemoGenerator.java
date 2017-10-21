import java.util.Scanner;

public class DemoGenerator {

	public static void main(String[] args) {
		
		Person[] hora;
		
		System.out.println("Vyvedete broj na horata:");
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		sc.nextLine();
		
		hora = new Person[cnt];
		for(int i=0; i<hora.length; i++) {
			System.out.println("element[" + i + "]:");
			hora[i] = new Person(sc.nextLine());
		}

		
		RandomGroupsGenerator rg1 = new RandomGroupsGenerator(hora, 2);
		
		rg1.printGroup();
		
		rg1.shuffle();
		rg1.printGroup();
		
		
		sc.close();
		
	}

}
