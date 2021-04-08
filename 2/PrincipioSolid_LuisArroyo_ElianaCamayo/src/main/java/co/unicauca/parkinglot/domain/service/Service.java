
package co.unicauca.parkinglot.domain.service;

import co.unicauca.parkinglot.access.IVehicleRepository;
import co.unicauca.parkinglot.access.VehicleRepository;
import co.unicauca.parkinglot.domain.Vehicle;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 
 * Luis Manuel Arroyo luisarroyo@unicauca.edu.co 104617010904
 * Eliana Camayo eacamayo@unicauca.edu.co 104616021725
 */
public class Service implements IVehicleRepository {

    // Aqui hay una dependencia directa con un módulo inferior
    // Se debería reemplazar la dependencia con una abstracción
    private IVehicleRepository repository;

    public Service() {
        repository = new VehicleRepository();
    }

    public double calculateParkingCost(Vehicle vehicle) {

       return 0;
    }
    public boolean saveVehicle(Vehicle newVehicle){
        //Validate product
        //if (newVehicle == null || newProduct.getProductId() < 0 || newProduct.getName().isBlank()) {
        if (newVehicle == null ) {
            return false;
        }

        repository.save(newVehicle);
        return true;
    }
    public List<Vehicle> listVehicles(){
        List<Vehicle> vehiculos = new ArrayList<>();
        vehiculos = repository.list();

        return vehiculos;
    }

   /* public boolean saveVehicle(Vehicle vehicle) {

      
        
        /*if (newVehicle == null || newVehicle.getProductId() < 0 || newProduct.getName().isBlank()) {
            return false;
        }

        repository.saveProduct(newProduct);
        return true;*/

    

    /*public List<Vehicles> listProducts() {
        List<Vehicles> products = new ArrayList<>();
        products = repository.listVehicles();
        
        

        return products;
    }*/

    @Override
    public boolean save(Vehicle newVehiculo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehicle> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
