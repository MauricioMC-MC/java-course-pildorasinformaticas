import javax.swing.JOptionPane;

public class ExcerciseWeight {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		String gender="";
		int weight;
		int height;
		
		while (!gender.equalsIgnoreCase("M") && !gender.equalsIgnoreCase("H"))
		{

			gender=JOptionPane.showInputDialog("Por favor introduce tu genero (M/H):").toUpperCase();
		}
		
		String input =JOptionPane.showInputDialog("Por favor introduce tu altura en centimetros:");
		height = Integer.parseInt(input);

		if (gender.equals("M")) {
			weight = height-120;
			gender = "Mujer";
		}
		else {
			weight = height-110;
			gender = "Hombre";
		}

		JOptionPane.showMessageDialog(null, "Gracias, segun esta informacion su genero es " +gender+ ", su estatura es " +height+ "cms, y su peso ideal es " +weight+ "Kgs.");

	}

}
