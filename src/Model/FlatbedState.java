package model;

public class FlatbedState {
    public static boolean changeFlatbedState;
    public boolean flatbedUp;
    public FlatbedState(){
        this.flatbedUp = false;
    }
    public boolean flatbedState(){
        return flatbedUp;
    }
    public void changeFlatbedState(boolean position){ //upp = false
        if(position == false){
            flatbedUp = false;
        }
        else if(position == true){
            flatbedUp = true;
        }
    }
}
