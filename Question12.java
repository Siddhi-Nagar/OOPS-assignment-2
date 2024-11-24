class Distance {
    double distanceInMiles;

    Distance(double distanceInMiles) {
        this.distanceInMiles = distanceInMiles;
    }
    void travelTime() {
        double speedInMilesPerHour = 60;  
        double time = distanceInMiles / speedInMilesPerHour;
        System.out.printf("Time to cover %.2f miles at %d miles/hour: %.2f hours\n",
                distanceInMiles, (int) speedInMilesPerHour, time);
    }
}
class DistanceMKS extends Distance {
    DistanceMKS(double distanceInKilometers) {
        super(distanceInKilometers);
    }
    @Override
    void travelTime() {
        double speedInKilometersPerHour = 100; 
        double time = distanceInMiles / speedInKilometersPerHour;
        System.out.printf("Time to cover %.2f kilometers at %d km/hour: %.2f hours\n",
                distanceInMiles, (int) speedInKilometersPerHour, time);
    }
}

public class Question12 {
    public static void main(String[] args) {
        Distance distanceInMiles = new Distance(120); 
        System.out.println("Output from base class Distance:");
        distanceInMiles.travelTime();  
        System.out.println();

        DistanceMKS distanceInKilometers = new DistanceMKS(200);  
        System.out.println("Output from derived class DistanceMKS:");
        distanceInKilometers.travelTime();  
    }
}
