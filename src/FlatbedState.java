

public class FlatbedState {  //ingen position, mer av ett state 
    
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
