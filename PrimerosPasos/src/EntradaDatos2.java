import javax.swing.*;
public class EntradaDatos2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String user_name=JOptionPane.showInputDialog("Introduce tu nombre, por favor: ");
		int edad=Integer.parseInt(JOptionPane.showInputDialog("Ahora introduce tu edad:"));
		System.out.println("Hola "+user_name+", tu edad es de "+edad+" años");

	}

}
