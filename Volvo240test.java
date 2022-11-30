
public class Volvo240test {
    
}

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


