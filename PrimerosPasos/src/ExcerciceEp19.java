import java.util.Scanner;

public class ExcerciceEp19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int randNum = (int) (Math.random()*100)+1;
		int userOption = 0;
		int userTimes = 0;
		Scanner input=new Scanner(System.in);
		
		while (randNum!=userOption)
		{
			System.out.println("Ingresa un numero entre 1 y 100:");
			userOption=input.nextInt();
			
			userTimes++;
			
			if (randNum>userOption) System.out.println("El numero es mayor que " +userOption+ ". Llevas " +userTimes+ " intentos");
			
			else if (randNum<userOption) System.out.println("El numero es menor que " +userOption+ ". Llevas " +userTimes+ " intentos");
	
			}
		
		System.out.println("Felicidades, el numero era " +userOption+ ", solo te tomo " +userTimes+ " intentos.");
		
		input.close();
	}

}
