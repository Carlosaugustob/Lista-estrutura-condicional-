import javax.swing.JOptionPane;
	
	public class ForExer3 {

	public static void main(String[] args) {
		
		  String texto = "";
	        for (int i = 0; i <=21; i++) {
	            for (int j = 0; j <= 21; j++) {
	                texto +=" * ";
	            }
	            texto = texto + "\n";
	        }
	        System.out.println(texto);
	    }
	}

