import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestPane extends JPanel implements ActionListener {

    private final JButton[][] firstBoard;

    public TestPane() {
        setLayout(new GridLayout(9, 9));
        firstBoard = new JButton[9][9];

        for (int x = 0; x < firstBoard.length; x++) {
            for (int y = 0; y < firstBoard[0].length; y++) {
                firstBoard[x][y] = new JButton();
                //firstBoard[x][y].setActionCommand("0|" + (x + (firstBoard.length * y)));
                firstBoard[x][y].setActionCommand((x + ", " + y));
                firstBoard[x][y].addActionListener(this);
                add(firstBoard[x][y]);
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            System.out.println((((JButton) e.getSource()).getActionCommand()));
            ((JButton) e.getSource()).setBackground(Color.BLUE);
            ((JButton) e.getSource()).setContentAreaFilled(true);
            ((JButton) e.getSource()).setOpaque(true);
        }
    }
}

