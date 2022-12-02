

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.awt.Color;
import org.junit.Test;
import Volvo240;

public class Volvo240test {
    


public void speedFactorVolvo240(){
    Volvo240 testVolvo = new Volvo240();
    testVolvo.speedfactor();
    assertTrue(testVolvo.speedFactor() == getEnginePower() * 0.01 * trimFactor);
}

// TODO fix this method according to lab pm
public void gas(double amount){
    incrementSpeed(amount);
}

// TODO fix this method according to lab pm
public void brake(double amount){
    decrementSpeed(amount);
}

}
