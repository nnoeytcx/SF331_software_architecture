import java.util.Scanner;
public class pizza {
	public static void main(String[] args) {
		String choice;
		Scanner sn = new Scanner(System.in);

		System.out.print("Insert choice a-h or insert x to finished : ");
		
		choice = sn.nextLine();
		System.out.println("Choice is: " + choice);
	}
}
