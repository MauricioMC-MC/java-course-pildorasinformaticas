import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Por favor ingresa tu nombre");
		String user_name=input.nextLine();
		System.out.println("Bienvenido " + user_name + " podrias decirme cual es tu edad?");
		int age=input.nextInt();
		System.out.println("Oh, entiendo " + user_name +", tu edad es de " + age + " años.");
		input.close();
	}

}
