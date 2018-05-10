import javax.swing.JOptionPane;
	
	public class ForExer1 {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero que deseja a tabuada"));
		
		String texto = "";
		
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j < 1; j++) {
				texto += (i + " x " + numero + " = " + (i * numero));
			}
			texto = texto + "\n";
		}
		JOptionPane.showMessageDialog(null, texto);
		
		}
}