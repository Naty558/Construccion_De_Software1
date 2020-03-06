import javax.swing.*;

public class InputDialog extends JFrame {
    public InputDialog() {

      String respuesta = JOptionPane.showInputDialog(null,
      "Escribe tu nombre:");
    }

    public static void main(String[] arguments) {
        InputDialog dialog = new InputDialog();
    }
    }
