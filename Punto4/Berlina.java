
public class Berlina extends CarroBuilder{

    @Override
    public void buildcilindraje() {
        carro.setCilindraje(1997);
    }

    @Override
    public void buildpotencia() {
        carro.setPotencia(130);
    }

    @Override
    public void buildmarca() {
        carro.setMarca("Peugeot");
    }

    @Override
    public void buildmodelo() {
        carro.setModelo("Peugeot 508");
    }

    @Override
    public void buildcombustible() {
        carro.setCombustible(7);
    }

    @Override
    public void buildpuertas() {
        carro.setPuertas(5);
    }
    
}
