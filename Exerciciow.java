import javax.swing.JOptionPane;

    public class Exerciciow{

    public static void main(String[] args) {
       
        String nome = JOptionPane.showInputDialog("Digite um nome: ");

     while (!nome.equalsIgnoreCase("sair")){
     nome = JOptionPane.showInputDialog("Outro nome: ");
     
     }
    
 
     

         
     }
    
    }