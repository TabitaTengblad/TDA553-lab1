public class Loading {
    
    public boolean onOffFlatbed;
    public boolean DistanceIsRight;
    public double carsLoad;
    public boolean distance;
    
        public Loading(){
            onOffFlatbed = true;
            carsLoad = 1;
            distance = true; 
        }

       public void UnLoadCarTransporter(){    
        if (onOffFlatbed == true & carsLoad > 0);
        carsLoad -= 1;
       }

       public void DistanceOff(){  //metod för hur långt från cartransport som bilen hamnar
        
       }

    public boolean DistanceIsRight(){
        if (distance = true);
        return true;
       }
    
       public void LoadCarTransporter(){
        if (onOffFlatbed == true & DistanceIsRight == true);
        carsLoad += 1;
       }
}
