import javax.swing.JOptionPane;

public class UsoArrays {

	public static void main(String[] args) {

		int quantityOfArrays = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros:"));

		int[] myArray = new int[quantityOfArrays];
		// Get quantity of spaces in the array.

		for (int i = 0; i < quantityOfArrays; i++) {

			int arrayValue = Integer
					.parseInt(JOptionPane.showInputDialog("Ingrese el numero en la posicion " + (i + 1) + " :"));
			myArray[i] = arrayValue;
			// Assign values to each space in the array.

		}

		for (int i = 0; i < quantityOfArrays; i++) {
			System.out.println(myArray[i]);
			// Show the array content.
		}

	}

}
