public class LoadOff extends Load {
    
    public boolean onOffFlatbed;
    public double carsLoad;
    
        public LoadOff(){
            onOffFlatbed = true;
            carsLoad = 1;  
        }

       public void UnLoadCarTransporter(){    
        if (onOffFlatbed == true);
        carsLoad -= 1;
       }

       public boolean DistanceOff(){  //metod för hur långt från cartransport som bilen hamnar
        return true;
       }
}

//-------------------------Minnesanteckning---------------------------------------------------

//