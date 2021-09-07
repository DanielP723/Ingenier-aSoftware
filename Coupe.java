
public class Coupe extends CarroBuilder{

    @Override
    public void buildcilindraje() {
        carro.setCilindraje(4000);
    }

    @Override
    public void buildpotencia() {
        carro.setPotencia(385);
    }

    @Override
    public void buildmarca() {
        carro.setMarca("Jaguar");
    }

    @Override
    public void buildmodelo() {
        carro.setModelo("Jaguar XK Coupé");
    }

    @Override
    public void buildcombustible() {
        carro.setCombustible(11);
    }

    @Override
    public void buildpuertas() {
        carro.setPuertas(2);    
    }
    
}
