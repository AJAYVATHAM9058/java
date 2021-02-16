public class HelloWorld{

     public static void main(String []args){
         
         byte numberOfSeats = 5;
         byte numberOfDoors = 3;
         byte numberOfVehicleOwners = 1;
         byte emissionSticker = 4;
         
         short power = 362;
         short horsePower = 492;
         short co2Emission = 333;
         short cubicCapacity = 6417;
         
         int price = 29999;
         int mileage = 14999;
         
         long registrationNumber = 23452345232352345L;
         
         float fuelConsumptioncombined = 15.5F;
         float fuelConsumptionUrban = 21.4F;
         float fuelConsumptionExtraUrban = 13.6F;
         
         double fuelConsumptionPreciseAverage = 152.34523534656456e-1;
         boolean isDamaged = true;
         
         char energyEfficiencyCategory = 'G';
         
         System.out.println("2018 Dodge Challenger SRT 392");
         System.out.println("Price: €" +price);
         System.out.println("Mileage :" +mileage+ "km");
         System.out.println("The car is Damaged: "+isDamaged);
         System.out.println("Registration number:" +registrationNumber);
         System.out.println("Cubic Capacity: "+cubicCaapacity+"ccm");
         System.out.println("Power: "+power+"KW("+horsePower +"hp)");
         System.out.println("CO2 emission :" +co2Emission+"g/km");
         System.out.println("Emission Sticker :"+emissionSticker +"(Energy efficiency category:"+ energyEfficiencyCategory+")");
         System.out.println("Combined fuel consumption:"+fuelConsumptioncombined +"l/100km");
         System.out.println("Urban fuel consumption:"+fuelConsumptionUrban +"l/100km");
         System.out.println("Extra urban fuel consumption:"+fuelConsumptionExtraUrbanUrban +"l/100km");
         System.out.println("Precise average fuel consumption:"+fuelConsumptionPreciseAverage +"l/100km");
         System.out.println("Number of Previous owners:"+ numberOfVehicleOwners);
         System.out.println("Number of Doors:"+ numberOfDoors);
         System.out.println("Number Of Seats:" +numberOfSeats);
     }
}
