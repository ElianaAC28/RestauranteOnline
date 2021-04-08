package co.unicauca.parkinglot.access;

import co.unicauca.parkinglot.domain.Vehicle;
import java.util.List;


/**
 *
 * @author hp
 */
public interface IVehicleRepository {
    boolean save(Vehicle newVehiculo);
    List<Vehicle> list();
}
