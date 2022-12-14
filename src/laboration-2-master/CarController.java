import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.VetoableChangeListener;
import java.util.ArrayList;
import java.awt.*;

/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.
 */

public class CarController extends JPanel{


    private static final int X = 800;
    private static final int Y = 800;

    CarController carC;

    DrawPanel drawPanel = new DrawPanel(X, Y-240);

    JPanel controlPanel = new JPanel();

    JPanel gasPanel = new JPanel();
    JSpinner gasSpinner = new JSpinner();
    int gasAmount = 0;
    int brakeAmount = 0;
    JLabel gasLabel = new JLabel("Amount");

    JButton gasButton = new JButton("Gas");
    JButton brakeButton = new JButton("Brake");
    JButton turboOnButton = new JButton("Saab Turbo on");
    JButton turboOffButton = new JButton("Saab Turbo off");
    JButton liftBedButton = new JButton("Scania Lift Bed");
    JButton lowerBedButton = new JButton("Lower Lift Bed");

    JButton startButton = new JButton("Start all cars");
    JButton stopButton = new JButton("Stop all cars");


    // The delay (ms) corresponds to 20 updates a sec (hz)
    private final int delay = 50;
    // The timer is started with an listener (see below) that executes the statements
    // each step between delays.
    private Timer timer = new Timer(delay, new TimerListener());

    // The frame that represents this instance View of the MVC pattern
    CarView frame;
    // A list of vehicles, modify if needed
    
    public CarController(){
        CarController cc = new CarController();
                // Start a new view and send a reference of self
                cc.frame = new CarView("vehiclesim 1.0", cc);

                // Start the timer
                cc.timer.start();
    }
    
    //methods:
    /* Each step the TimerListener moves all the vehicles in the list and tells the
    * view to update its images. Change this method to your needs.
    * */
    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (Vehicle vehicle : VehicleFactory.vehicles) {
                vehicle.move();
            }
                // repaint() calls the paintComponent method of the panel
            frame.drawPanel.repaint();
        }
    }

    // Calls the gas method for each car once
    void gas(int amount) {
        double gas = ((double) amount) / 100;
        for (Vehicle vehicle : vehicles
                ) {
            vehicle.gas(gas);
        }
    }

    void brake(int amount) {
        double brake = ((double) amount) / 100;
        for (Vehicle vehicle : vehicles
                ) {
            vehicle.brake(brake);
        }
    }  
   

private void initComponents(String title) {

    SpinnerModel spinnerModel =
            new SpinnerNumberModel(0, //initial value
                    0, //min
                    100, //max
                    1);//step
    gasSpinner = new JSpinner(spinnerModel);
    gasSpinner.addChangeListener(new ChangeListener() {
        public void stateChanged(ChangeEvent e) {
            gasAmount = (int) ((JSpinner)e.getSource()).getValue();
            brakeAmount = (int) ((JSpinner)e.getSource()).getValue();
        }
    });

    gasPanel.setLayout(new BorderLayout());
    gasPanel.add(gasLabel, BorderLayout.PAGE_START);
    gasPanel.add(gasSpinner, BorderLayout.PAGE_END);


    controlPanel.setLayout(new GridLayout(2,4));

    this.add(gasButton, 0);
    this.add(turboOnButton, 1);
    this.add(liftBedButton, 2);
    this.add(brakeButton, 3);
    this.add(turboOffButton, 4);
    this.add(lowerBedButton, 5);
    this.setPreferredSize(new Dimension((X/2)+4, 200));
    this.setBackground(Color.CYAN);

    startButton.setBackground(Color.blue);
    startButton.setForeground(Color.green);
    startButton.setPreferredSize(new Dimension(X/5-15,200));
//dessa gör inget, hur implementerar vi detta?

    stopButton.setBackground(Color.red);
    stopButton.setForeground(Color.black);
    stopButton.setPreferredSize(new Dimension(X/5-15,200));

//dessa gör inget, hur implementerar vi detta?

    // This actionListener is for the gas button only
    // TODO: Create more for each component as necessary

    
    gasButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            carC.gas(gasAmount);
            drawPanel.paintComponent(getGraphics());
        }
    });

    brakeButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            carC.brake(brakeAmount);
            drawPanel.paintComponent(getGraphics());
        }
    });

    // Make the frame pack all it's components by respecting the si
}
}