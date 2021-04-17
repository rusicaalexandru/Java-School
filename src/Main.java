import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;
import javax.swing.*;

class Fereastra extends JFrame implements ActionListener {
    String sir;
    JLabel B;
    public Fereastra(String titlu) {
        super(titlu);
        setSize(320, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container x = getContentPane();
        x.setLayout(new FlowLayout());
        JButton A = new JButton("Date Noi");
        x.add(A);
        A.addActionListener(this);
        B = new JLabel();
        x.add(B);

        //JButton openCalculatorButton = new JButton("Calculator");
        //x.add(openCalculatorButton);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        sir = JOptionPane.showInputDialog("Cum te numesti?");
        B.setText("Buna ziua " + sir);
    }

}
class FereastraL7 extends JFrame implements ActionListener{
    JPanel panel;
    public FereastraL7(String name) {
        super(name);
        setSize(400, 500);
        setLocation(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //---------------------------------------------------------------------------------------
        Container x = getContentPane();
        x.setLayout(new FlowLayout());
        JButton A = new JButton("B1"); x.add(A);A.addActionListener(this);
        JButton B = new JButton("B2"); x.add(B);B.addActionListener(this);
        //---------------------------------------------------------------------------------------colors
        panel = new JPanel();
        JButton yellowB = new JButton("yellow");panel.add(yellowB);yellowB.addActionListener(this);
        JButton blueB = new JButton("blue");panel.add(blueB);blueB.addActionListener(this);
        JButton greenB = new JButton("green");panel.add(greenB);greenB.addActionListener(this);
        x.add(panel);
        //---------------------------------------------------------------------------------------
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        //--------------------------------------------------------------------------------------- messagebox
        if(ae.getActionCommand().compareTo("B1") == 0){
            JOptionPane.showMessageDialog(this, "Ai apasat B1");
        } else if (ae.getActionCommand().compareTo("B2") == 0){
            JOptionPane.showMessageDialog(this, "Ai apasat B2");
        }
        //---------------------------------------------------------------------------------------collors
        if(ae.getActionCommand().compareTo("yellow") == 0){
            panel.setBackground(Color.yellow);
        } else if (ae.getActionCommand().compareTo("blue") == 0){
            panel.setBackground(Color.blue);
        } else if (ae.getActionCommand().compareTo("green") == 0){
            panel.setBackground(Color.green);
        }
    }
}

public class Main {
    public static void main(String args[]){
        FereastraL7 frame = new FereastraL7("Lab7");

    }
}
