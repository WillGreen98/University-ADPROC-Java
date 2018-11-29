package gui_calculation;

public class Main {
    public static void main(String[] args) {
        Calc_GUI calc_gui = new Calc_GUI();
        calc_gui.setVisible(true);
        java.awt.EventQueue.invokeLater ( new Runnable() {
            public void run() {
                new Calc_GUI().setVisible(true);
            }
        });
    }
}
