
package co.unicauca.parkinglot.domain;

import java.util.Map;

/**
 *
 * @author hp
 */
public class ParkingCostFactory {
    
    private Map dictionary;
    private ParkingCostFactory instance;
    
    private int  VehicleFactory(){
        return 0;
    }
    
    public ParkingCostFactory getInstance(){
        ParkingCostFactory e = null;
        return e;
    }
    
    public IParkingCost getParkingCost(){
        IParkingCost d = null;
        return d;
    }
    
   /* private Map<TypeEnum, IParkingCost> dictionary;

    // Singleton
    private static ParkingCostFactory instance;

    private ParkingCostFactory() {
        dictionary = new EnumMap<>(TypeEnum.class);
     */   

    
}
