//Clase director
public class Concesionario {
    private CarroBuilder carrobuilder;
    
    public void setCarBuilder(CarroBuilder cb){
        carrobuilder = cb;
    }
    
    public Carro getCarro(){
        return carrobuilder.getCarro();
    }
    
    public void buildCarro(){
        carrobuilder.crearCarro();
        carrobuilder.buildcilindraje();
        carrobuilder.buildpotencia();
        carrobuilder.buildmarca();
        carrobuilder.buildmodelo();
        carrobuilder.buildcombustible();
        carrobuilder.buildpuertas();
    }
}
