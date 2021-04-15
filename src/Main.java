import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Fereastra extends JFrame implements ActionListener {
    String sir;
    JLabel B;
    public Fereastra(String titlu) {
        super(titlu);
        setSize(120, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container x = getContentPane();
        x.setLayout(new FlowLayout());
        JButton A = new JButton("Date Noi");
        x.add(A);
        A.addActionListener(this);
        B = new JLabel();
        x.add(B);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        sir = JOptionPane.showInputDialog("Cum te numesti?");
        B.setText("Buna ziua " + sir);
    }

}

    public class Main {
    public static void main(String args[]){
        Fereastra frame = new Fereastra("prima");
    }
}
