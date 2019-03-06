package flexbox;

import flexbox.ui.FlexBoxUserInterface;
import java.awt.EventQueue;

/**
 * Entry point of the program
 * @author Group D4
 */
public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new FlexBoxUserInterface(new OrderSession()).setVisible(true));
    }
}
