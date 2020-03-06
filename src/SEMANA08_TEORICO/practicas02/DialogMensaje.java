import javax.swing.*;

public class DialogMensaje extends JFrame {
    public DialogMensaje() {

      JOptionPane.showMessageDialog(null,
      "Existen actualizaciones para el programa.");
    }

    public static void main(String[] arguments) {
        DialogMensaje dialog = new DialogMensaje();
    }
    }