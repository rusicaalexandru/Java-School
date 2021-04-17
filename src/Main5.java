import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;
import javax.swing.*;

class FereastraL7Calculator extends JFrame implements ActionListener{
    public FereastraL7Calculator(String name) {
        super(name);
        setSize(400, 500);
        setLocation(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        Container x = getContentPane();
        x.setLayout(new FlowLayout());

        JButton calculateB = new JButton("Calculate");
        x.add(calculateB);
        calculateB.addActionListener(this);
        JLabel answerL = new JLabel("Hello");
        x.add(answerL);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().compareTo("yellow") == 0){ //delete and replace with other code...
        }
    }
}

public class Main5 {
    public static void main(String args[]){
        FereastraL7Calculator calc = new FereastraL7Calculator("Calculator");
    }
}
