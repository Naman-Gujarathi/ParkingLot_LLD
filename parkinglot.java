/*
 * Click Run to execute the snippet below!
 */

import java.io.*;
import java.util.*;

import com.google.protobuf.Internal.BooleanList;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution{
  private List<VanSpot> totalVanParkingSpotAvalaible;
  private List<CarSpot> totalCarParkingSpotAvalaible;
  private List<MotorcycleSpot> totalMotorcycleParkingSpotAvalaible;
  private Map<Integer, Boolean> motorcycleReservedInfo;
  private Map<Integer, Boolean> carReservedInfo;
  private Map<Integer, Boolean> vanReservedInfo;

  public Solution(List<VanSpot> totalVanParkingSpotAvalaible, List<CarSpot> totalCarParkingSpotAvalaible, List<MotorcycleSpot> totalMotorcycleParkingSpotAvalaible,Map<Integer, Boolean> motorcycleReservedInfo, Map<Integer, Boolean> carReservedInfo, Map<Integer, Boolean> vanReservedInfo){
      this.totalVanParkingSpotAvalaible = totalVanParkingSpotAvalaible;
      this.totalMotorcycleParkingSpotAvalaible = totalMotorcycleParkingSpotAvalaible;
      this.totalCarParkingSpotAvalaible = totalCarParkingSpotAvalaible;
      this.carReservedInfo = carReservedInfo;
      this.motorcycleReservedInfo = motorcycleReservedInfo;
      this.vanReservedInfo = vanReservedInfo;
      
  }

  public int getTotalSpotsRemaining(){
     int total = totalCarParkingSpotAvalaible.size() + totalMotorcycleParkingSpotAvalaible.size() + totalVanParkingSpotAvalaible.size();
     return total;
  }

   public boolean isParkingLotFull(){
     int total = totalCarParkingSpotAvalaible.size() + totalMotorcycleParkingSpotAvalaible.size() + totalVanParkingSpotAvalaible.size();
     if(total == 0){
      return true;
     }
     return false;
  }


   public boolean isParkingLotEmpty(){
     int total = vanReservedInfo.size() + motorcycleReservedInfo.size() + carReservedInfo.size() ;
     if(total == 0){
      return true;
     }
     return false;
  }



  public int getTotalSpots() {
      int total = vanReservedInfo.size() + motorcycleReservedInfo.size() + carReservedInfo.size() + totalCarParkingSpotAvalaible.size() + totalMotorcycleParkingSpotAvalaible.size() + totalVanParkingSpotAvalaible.size();

      return total;
  }

  public int getTotalCarSpotsRemaining(){
     return totalCarParkingSpotAvalaible.size();
  }

  public List<VanSpot> getTotalVanAvailableList(){
     return totalVanParkingSpotAvalaible;
  }

  public List<CarSpot> getTotalCarAvalaibleList(){
    return totalCarParkingSpotAvalaible;
  }

  public List<MotorcycleSpot> getTotalMotorcycleAvailaibleList(){
    return totalMotorcycleParkingSpotAvalaible;
  }

  public int getTotalMotorCycleSpotsRemaining(){
    return totalMotorcycleParkingSpotAvalaible.size();
  }

  public int getTotalVanSpotsRemaining(){
    return  totalVanParkingSpotAvalaible.size();
  }

  public List<MotorcycleSpot> getRemainingMotorCycleParkingSpot(){
    if(totalMotorcycleParkingSpotAvalaible.size() == 0){
        System.out.println("MotorCycel Spots are Full");
    }
    return totalMotorcycleParkingSpotAvalaible;
  }

  public List<CarSpot> getRemainingCarParkingSpot(){
    if(totalCarParkingSpotAvalaible.size() == 0){
        System.out.println("Car Spots are Full");
    }
    return totalCarParkingSpotAvalaible;
  }

  public List<VanSpot> getRemainingVanParkingSpot(){
    if( totalVanParkingSpotAvalaible.size() == 0){
       System.out.println("Van Spots are Full");
    }
    return totalVanParkingSpotAvalaible;
  }

  public Map<Integer, Boolean> getmotorcycleReservedInfo(){
    return motorcycleReservedInfo;
  }

  public Map<Integer, Boolean> getCarReservedInfo(){
    return carReservedInfo;
  }

  public Map<Integer, Boolean> getVanReservedInfo(){
    return vanReservedInfo;
  }


   public void reserveSpotForVan(){
          if(getRemainingVanParkingSpot().size() !=0){
              int lastIdx = getRemainingVanParkingSpot().size()-1;
              VanSpot obj = getRemainingVanParkingSpot().get(lastIdx);
              getRemainingVanParkingSpot().remove(lastIdx);
              
              obj.parkVehicle(obj.getParkingId(), getVanReservedInfo());
          }
          return;
      }

      public void reserveSpotForCar(){
          if(getRemainingCarParkingSpot().size() !=0){
              int lastIdx = getRemainingCarParkingSpot().size()-1;
              CarSpot obj = getRemainingCarParkingSpot().get(lastIdx);
              getRemainingCarParkingSpot().remove(lastIdx);
              
              obj.parkVehicle(obj.getParkingId(), getCarReservedInfo());
          }
          return;
      }

      public void reserveSpotForMotorcycle(){
          if(getRemainingMotorCycleParkingSpot().size() !=0){
              int lastIdx = getRemainingMotorCycleParkingSpot().size()-1;
              MotorcycleSpot obj = getRemainingMotorCycleParkingSpot().get(lastIdx);
              getRemainingMotorCycleParkingSpot().remove(lastIdx);
              
              obj.parkVehicle(obj.getParkingId(), getCarReservedInfo());
          }
          return;
      }

  public static void main(String[] args) {
      // created Motorcyclespot object
      List<MotorcycleSpot> motorcycleList = new ArrayList<>();
      MotorcycleSpot mobj = new MotorcycleSpot();
      motorcycleList.add(mobj);
      MotorcycleSpot mobj1 = new MotorcycleSpot();
      motorcycleList.add(mobj1);
      MotorcycleSpot mobj2 = new MotorcycleSpot();
      motorcycleList.add(mobj2);

      // created carSpot object
      List<CarSpot> carList = new ArrayList<>();
      CarSpot cobj = new CarSpot();
      carList.add(cobj);
      CarSpot cobj1 = new CarSpot();
      carList.add(cobj1);
      CarSpot cobj2 = new CarSpot();
      carList.add(cobj2);

      //created VanSpot object
      List<VanSpot> vanList = new ArrayList<>();
      VanSpot vobj = new VanSpot();
      vanList.add(vobj);
      VanSpot vobj1 = new VanSpot();
      vanList.add(vobj1);
      VanSpot vobj2 = new VanSpot();
      vanList.add(vobj2);
      

      Map<Integer, Boolean> motorcycleReservedInfo = new HashMap<>();
      Map<Integer, Boolean> carReservedInfo = new HashMap<>();
      Map<Integer, Boolean> vanReservedInfo = new HashMap<>();

      Solution controller = new Solution(vanList, carList, motorcycleList, motorcycleReservedInfo, carReservedInfo, vanReservedInfo);

      System.out.println("Total Remaning Spots " + controller.getTotalSpotsRemaining());

      System.out.println("Motorcyle Parking Spot Remaining" + controller.getTotalMotorCycleSpotsRemaining() );
      System.out.println("Car Parking Spot Remaining" + controller.getTotalCarSpotsRemaining());
      System.out.println("Van Parking Spot Remaining" + controller.getTotalVanSpotsRemaining());

      System.out.println("Total Spots in parking lot" + controller.getTotalSpots());

      System.out.println("Parking lot is full" + controller.isParkingLotFull());

      System.out.println("Parking lot is empty" + controller.isParkingLotEmpty()); 

    System.out.println("After Reservation");

    controller.reserveSpotForVan();
    controller.reserveSpotForCar();
    controller.reserveSpotForMotorcycle();

    System.out.println("Updated Motorcyle Parking Spot Remaining" + controller.getTotalMotorCycleSpotsRemaining() );
    System.out.println("Updated Car Parking Spot Remaining" + controller.getTotalCarSpotsRemaining());
    System.out.println("Updated Van Parking Spot Remaining" + controller.getTotalVanSpotsRemaining());
    System.out.println("Total Remaning Spots " + controller.getTotalSpotsRemaining());

  }
}

// Parking Spot
abstract class ParkingSpot {
  private int parkingId;
  private static int nextId = 1;
  private boolean isEmpty;
  // private  List<VanSpot> totalVanParkingSpotAvalaible;
  // private  List<CarSpot> totalCarParkingSpotAvalaible;
  // private  List<MotorcycleSpot> totalMotorcycleParkingSpotAvalaible;
  
  //  private Controller controller;
  //  private double priceParkingSpot;
   // vehicle assigned
   // price for spot
    public ParkingSpot(){
       this.parkingId = nextId++;
       this.isEmpty = true;

    }
   public int getParkingId(){
      return parkingId;
   }
   public void setParkingId(int parkingId){
     this.parkingId = parkingId;
   }

  abstract public void unparkVehicle(int parkingId, Map<Integer, Boolean> map);
  abstract public void parkVehicle(int parkingId, Map<Integer, Boolean> map);

  public boolean isParkingSpotEmpty(){
     return isEmpty;
  }

  abstract public double getPriceParkingSpot();
  abstract public void setPriceParkingSpot(double priceParkingSpot); 
}


class MotorcycleSpot extends ParkingSpot {
   private double priceParkingSpot;

   public MotorcycleSpot() {
     super();
   }

  @Override
  public double getPriceParkingSpot(){
     return priceParkingSpot;   
  }

  @Override
  public void setPriceParkingSpot(double priceParkingSpot){
     this.priceParkingSpot = priceParkingSpot;
  }

  @Override
  public void unparkVehicle(int parkingId, Map<Integer, Boolean> motorcycleReservedInfo){
      motorcycleReservedInfo.put(parkingId, false);
  }

  @Override
  public void parkVehicle(int parkingId, Map<Integer, Boolean> motorcycleReservedInfo ){
      motorcycleReservedInfo.put(parkingId, true);
      

  }

}


class CarSpot extends ParkingSpot {
   private double priceParkingSpot;

   public CarSpot() {
     super();
   }

  @Override
  public double getPriceParkingSpot(){
     return priceParkingSpot;   
  }
  
  @Override
  public void setPriceParkingSpot(double priceParkingSpot){
     this.priceParkingSpot = priceParkingSpot;
  }

  @Override
  public void unparkVehicle(int parkingId, Map<Integer, Boolean> carReservedInfo){
      carReservedInfo.put(parkingId, false);
  }

  @Override
  public void parkVehicle(int parkingId, Map<Integer, Boolean> carReservedInfo){
      carReservedInfo.put(parkingId, true);
}
}


class VanSpot extends ParkingSpot {

  private double priceParkingSpot;

  public VanSpot() {
     super();
  }

  @Override
  public double getPriceParkingSpot(){
     return priceParkingSpot;  
  }
  
  @Override
  public void setPriceParkingSpot(double priceParkingSpot){
     this.priceParkingSpot = priceParkingSpot;
  }

  @Override
  public void unparkVehicle(int parkingId, Map<Integer, Boolean> vanReservedInfo){
    vanReservedInfo.put(parkingId, false);
  }

  @Override
  public void parkVehicle(int parkingId, Map<Integer, Boolean> vanReservedInfo ){
      vanReservedInfo.put(parkingId, true);
}

}
