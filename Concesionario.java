
public class Concesionario {
    private CarroBuilder carbuilder;
    
    public void setCarBuilder(CarroBuilder cb){
        carbuilder = cb;
    }
    
    public Carro getCarro(){
        return carbuilder.getCarro();
    }
    
}
