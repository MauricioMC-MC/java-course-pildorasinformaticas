import javax.swing.JOptionPane;

public class UsoArraysII {
    public static void main(String[] args) {

        int countriesQuantity = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de paises:"));

        String[] countryName = new String[countriesQuantity];
        // Get quantity of spaces in the array.

        for (int i = 0; i < countriesQuantity; i++) {

            countryName[i] = JOptionPane.showInputDialog("Ingrese el nombre del pais " + (i + 1) + " :");
            // Assign values to each space in the array.

        }

        for (String elemento : countryName)
            System.out.println(elemento);
        // Show the array content for countries.

        // -----------------------------------------------------------------------

        int randNumQuantity = Integer
                .parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros aleatorios que desea generar:"));

        int[] randNum = new int[randNumQuantity];

        for (int i = 0; i < randNumQuantity; i++) {

            randNum[i] = (int) (Math.random() * 100);

        }

        for (int numList : randNum)
            System.out.println(numList);
        // Show the array content for random numbers.

    }

}
