public class LoadOn extends Load{

    public boolean onOffFlatbed;
    public boolean DistanceIsRight;
    public double carsLoad;
    
        public LoadOn(){
            onOffFlatbed = true;
            carsLoad = 0;  
        }

    public boolean DistanceIsRight(){
        return true;
       }
    
       public void LoadCarTransporter(){
        if (onOffFlatbed == true & DistanceIsRight == true);
        carsLoad += 1;
       }
}

//-------Minnesanteckning---------

//kanske klar...