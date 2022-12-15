import model.Saab95;
import model.Scania;
import model.Vehicle;
import model.Volvo240;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
public class CarApp {
    // The delay (ms) corresponds to 20 updates a sec (hz)
    private static final int delay = 50;
    // The timer is started with an listener (see below) that executes the
    // statements
    // each step between delays.
    private static Timer timer = new Timer(delay, new TimerListener());
    private static CarModel model;
    private static DrawPanel view;
    public static void main(String[] args) {
        model = new CarModel();
        model.add(new Volvo240());
        model.add(new Saab95());
        model.add(new Scania());
        view = new DrawPanel(800, 800 - 240, model);
        CarController controller = new CarController(model);
        AppWindow window = new AppWindow("CarSim 1.1", view, controller);
        timer.start();
    }
    /*
     * Each step the TimerListener moves all the vehicles in the list and tells the
     * view to update its images. Change this method to your needs.
     */
    private static class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (Vehicle vehicle : model.vehicles) {
                vehicle.move(); // TODO Move into model
            }
            // repaint() calls the paintComponent method of the panel
            view.repaint();
        }
    }
}