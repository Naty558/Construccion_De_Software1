import javax.swing.*;

public class DialogoMensaje2 extends JFrame {
    public DialogoMensaje2() {

      JOptionPane.showMessageDialog(null,
      "Existen nuevas actualizaciones.",
      "Aviso Actualizaciones",
      JOptionPane.WARNING_MESSAGE);
    }

    public static void main(String[] args) {
    

  DialogoMensaje2 dialog = new DialogoMensaje2();
}


  
}


    
    