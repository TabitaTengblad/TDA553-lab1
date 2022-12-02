public class CarWorkshop {
        private int maxNrOfCars;
        private double maxDistance;
        private double distance;
        private double x;
        private double y;


    
        public CarWorkshop(int maxNrOfCars, double maxDistance, double x, double y){
            this.maxNrOfCars = 4;
            this.maxDistance = 5;
            this.x = 5;
            this.y = 5;
    }

    public Vehicle unLoadCar(){  
        if (distanceOff() == true){ 
        Loading.unLoad();
        }
       }
        
    public boolean distanceIsRight(){
        distance = Loading.calculateDistance(1.0, 1.0, x, y);
        Loading.distanceIsRight(distance, maxDistance);
       }
    
       public void Load(Vehicle car){
        if (distanceIsRight() == true & Loading.getNrOfCars() <= maxNrOfCars){ 
        Loading.load();
       }
    }
}
