import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;
import javax.swing.*;

class FereastraL7Calculator extends JFrame implements ActionListener{
    JLabel answer;
    JTextField input1, input2;
    public FereastraL7Calculator(String name) {
        super(name);
        setSize(500, 100);
        setLocation(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        Container x = getContentPane();
        x.setLayout(new FlowLayout());

        input1 = new JTextField(10);
        x.add(input1);
        JLabel operand = new JLabel("+");
        x.add(operand);
        input2 = new JTextField(10);
        x.add(input2);


        JButton calculateB = new JButton("Calculate");
        x.add(calculateB);
        calculateB.addActionListener(this);
        answer = new JLabel("Hello");
        x.add(answer);

    }
    public void actionPerformed(ActionEvent ae) {
        String in1 = input1.getText();
        String in2 = input2.getText();
        int a = Integer.parseInt(in1);
        int b = Integer.parseInt(in2);
        int c = a + b;
        String result = String.valueOf(c);
        answer.setText(result);
    }
}

public class Main5 {
    public static void main(String args[]){
        FereastraL7Calculator calc = new FereastraL7Calculator("Calculator");
    }
}
