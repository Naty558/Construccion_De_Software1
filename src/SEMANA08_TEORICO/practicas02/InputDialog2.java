import javax.swing.*;

public class InputDialog2 extends JFrame {
    public InputDialog2() {

      String response = JOptionPane.showInputDialog(null,
      "¿Cual es tu Email?",
      "Escribe tu Email",
      JOptionPane.QUESTION_MESSAGE);
    }

    public static void main(String[] arguments) {
        InputDialog2 dialog = new InputDialog2();
    }
    }
