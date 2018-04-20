import javax.swing.JOptionPane;
 
public class Exertres{

    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int numerodois = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
        

        int menu = Integer.parseInt(JOptionPane.showInputDialog("1 - Somar\n2- Subtrair\n3-Multiplicar\n4-Dividir"));
      
     
        if (menu == 1) { 
        int numerosoma =  numero + numerodois;
      JOptionPane.showMessageDialog(null, "Resultado: " + numerosoma);
      }else if (menu == 2) {
      int numerosub = numero - numerodois;
      JOptionPane.showMessageDialog(null, "Resultado: " + numerosub);
      }else if (menu == 3) 
      {int numeromulti = numero * numerodois;
      JOptionPane.showMessageDialog(null, "Resultado: " + numeromulti);
      }else if (menu == 4); {
      int numerodivi = numero / numerodois;
      JOptionPane.showMessageDialog(null, "Resultado " + numerodivi);
      }
    }

  }

