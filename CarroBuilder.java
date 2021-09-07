
public abstract class CarroBuilder {
    protected Carro carro;
    
    public Carro getCarro(){
        return carro;
    }
    
    public void crearCarro(){
        carro = new Carro();
    }
    
    public abstract void buildCilindraje();
    public abstract void buildpotencia();
    public abstract void buildmarca();
    public abstract void buildmodelo();
    public abstract void buildcombustible();
    public abstract void buildpuertas();
}
