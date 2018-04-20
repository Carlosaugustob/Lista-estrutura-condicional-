import javax.swing.JOptionPane;
 
  public class Exerseis{
      public static void main(String[] args){

    int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
    if (numero != 1) { 
      JOptionPane.showMessageDialog(null, "Diferente de um!!!! ");
    }else if (numero == 1) {
      JOptionPane.showMessageDialog(null, "UM!!" );

    }     
}

  }
    
