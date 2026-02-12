public class EarthVolume {

    public static void main(String[] args) {
        // Radius of the Earth in kilometers
        double earthRadiusKm = 6378;

        // Calculate volume in cubic kilometers using the formula: (4/3) * π * r^3
        double earthVolumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(earthRadiusKm, 3);

        // Conversion factor from kilometers to miles
        double kmToMiles = 0.621371;

        // Convert radius to miles
        double earthRadiusMiles = earthRadiusKm * kmToMiles;

        // Calculate volume in cubic miles
        double earthVolumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(earthRadiusMiles, 3);

        // Display volume in cubic kilometers and cubic miles
        System.out.printf("The volume of Earth in cubic kilometers is %.2e and cubic miles is %.2e%n", 
                          earthVolumeKm3, earthVolumeMiles3);
    }
}
