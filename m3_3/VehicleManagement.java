public class VehicleManagement {
    private final int vehiclesCount;

    private final int containersCount;

    private final int includedContainersCount;

    VehicleManagement(int vehiclesCount, int containersCount, int includedContainersCount) {
        this.vehiclesCount = vehiclesCount;
        this.containersCount = containersCount;
        this.includedContainersCount = includedContainersCount;
    }

    public void displayAllStuff() {
        for(int i = 0; i < this.vehiclesCount; ++i) {
           System.out.println("Vehicle number: " + (i + 1));

           for(int j = 0; j < this.containersCount; ++j) {
               System.out.println("\tContainers number: " + (j + 1));

               for(int k = 0; k < this.includedContainersCount; ++k) {
                   System.out.println("\t\tIncluded containers number: " + (k + 1));
               }
           }
        }
    }
}
