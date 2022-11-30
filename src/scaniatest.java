import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.awt.Color;



public class scaniatest {

    @Test
    public void angleOnFlatbedWork (){ //inte klar än
        Scania testScania = new Scania();
        testScania.setAngleOnFlatbed2(70);
        assertTrue(testScania.getAngleOnFlatbed() == 70 );
    }
    @Test
    public void ensureStationaryWork(){ 
        Scania testScania = new Scania();
        testScania.ensureStationary();
        assertTrue(testScania.getAngleOnFlatbed() == 0 );
    }
    @Test
    public void AngleNotZeroNoMove(){
        Scania testScania = new Scania();
        testScania.move();
        assertTrue()
    }




    //* */public void scaniaspeedzeroiszero(){ //Klar
        //Scania testScania = new Scania();
        //testScania.ScaniaSpeedzero(currentspeed > 0);
        //assertTrue(testScania.ScaniaSpeedzero() == 0 );
    //}
    

}

//--------Minnesanteckningar--------------------------------------------------

//Fixa testerna


