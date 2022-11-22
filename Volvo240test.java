import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.Color;

import javax.management.relation.InvalidRoleValueException;

import org.junit.Test;

public class Volvo240test {

@Test
public void isspeedFactor(){
    Volvo240 testVolvo = new Volvo240();
    testVolvo.speedFactor();
    assertTrue(testVolvo.speedFactor() == getEnginePower() * 0.01 * trimFactor);
}
}