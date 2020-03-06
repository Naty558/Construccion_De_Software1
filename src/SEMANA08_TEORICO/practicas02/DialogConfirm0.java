import javax.swing.*;

public class DialogConfirm0 extends JFrame {
    public DialogConfirm0() {
        int respuesta = JOptionPane.showConfirmDialog(null,
        "¿Estás seguro que quieres borrar este archivo?");
    }

    public static void main(String[] arguments) {
        DialogConfirm0 dialog = new DialogConfirm0();
    }
    }
