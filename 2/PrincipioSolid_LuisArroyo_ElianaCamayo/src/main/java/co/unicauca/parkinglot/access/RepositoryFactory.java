package co.unicauca.parkinglot.access;

import co.unicauca.parkinglot.domain.Vehicle;
import java.util.List;


/**
 * @author 
 * Luis Manuel Arroyo luisarroyo@unicauca.edu.co 104617010904
 * Eliana Camayo eacamayo@unicauca.edu.co 104616021725
 */
public class RepositoryFactory implements IVehicleRepository{
    
    private RepositoryFactory instance;
    
    private RepositoryFactory(){
        
    }

    public RepositoryFactory getInstance() {
        return instance;
    }

    public void setInstance(RepositoryFactory instance) {
        this.instance = instance;
    }

    @Override
    public boolean save(Vehicle newVehiculo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehicle> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
