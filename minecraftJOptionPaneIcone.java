import javax.swing.ImageIcon;
import javax.swing.JOptionPane; 
   
   public class minecraftJOptionPaneIcone{

        public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Olá Mundo", "Sistema da Vovó", 
        JOptionPane.WARNING_MESSAGE,
        new ImageIcon(
         minecraftJOptionPaneIcone.class.getResource
         ("/Imagens/minecraft.png")
        )
  ); 
        }
    }