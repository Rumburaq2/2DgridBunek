import java.awt.event.*;
import javax.swing.*;
public class ButtonExample {
    public static void main(String[] args) {
        JFrame f=new JFrame("Button Example");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setLayout(null);
        JButton b=new JButton("Spustit");
        b.setBounds(50,100,95,30);
        b.setLocation(0,0);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //tf.setText("Welcome to Javatpoint.");
                System.out.println("Hello world!");
                Game g = new Game(20,20, 0,0);
            }
        });
        f.add(b);//f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}