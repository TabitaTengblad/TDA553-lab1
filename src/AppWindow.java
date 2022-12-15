import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class represents the full view of the MVC pattern of your car simulator.
 * It initializes with being center on the screen and attaching it's controller in it's state.
 * It communicates with the Controller by calling methods of it when an action fires of in
 * each of it's components.
 * TODO: Write more actionListeners and wire the rest of the buttons
 **/

public class AppWindow extends JFrame{
    private static final int X = 800;
    private static final int Y = 800;

    // Constructor
    public AppWindow(String framename, JPanel panel1, JPanel panel2){
        initComponents(framename, panel1, panel2);
    }

    // Sets everything in place and fits everything
    // TODO: Take a good look and make sure you understand how these methods and components work
    private void initComponents(String title, JPanel panel1, JPanel panel2) {

        setTitle(title);
        setPreferredSize(new Dimension(X,Y));
        setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        add(panel1);
        add(panel2);
    
        pack();
        // Get the computer screen resolution
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        // Center the frame
        setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        // Make the frame visible
        setVisible(true);
        // Make sure the frame exits when "x" is pressed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}