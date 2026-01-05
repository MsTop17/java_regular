import java.awt.Color;
import javax.swing.JFrame;

public class BlackBox {
    public static void main(String[] args) {
        // 1. Create the frame (the window)
        JFrame frame = new JFrame("Black Box");

        // 2. Set the size of the box (Width, Height)
        frame.setSize(500, 700);

        // 3. Set the background color to black
        frame.getContentPane().setBackground(Color.BLACK);

        // 4. Tell the program to close when you click the 'X'
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 5. Center the window on the screen
        frame.setLocationRelativeTo(null);

        // 6. Make the box visible
        frame.setVisible(true);
    }
}