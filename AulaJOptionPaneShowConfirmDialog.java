import javax.swing.JOptionPane;
  public class AulaJOptionPaneShowConfirmDialog{

    public static void main(String[] args){
      int[] codepoints = {0x1F1EB, 0x1F1F7};
      String s = new String(codepoints, 0, codepoints.length);
      JOptionPane.showMessageDialog(null, s);
    }
  }

  