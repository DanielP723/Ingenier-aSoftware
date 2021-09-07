
public class Monovolumen extends CarroBuilder {

    @Override
    public void buildcilindraje() {
        carro.setCilindraje(1995);
    }

    @Override
    public void buildpotencia() {
        carro.setPotencia(120);
    }

    @Override
    public void buildmarca() {
        carro.setMarca("Renault");
    }

    @Override
    public void buildmodelo() {
        carro.setModelo("Espace I");
    }

    @Override
    public void buildcombustible() {
        carro.setCombustible(9);
    }

    @Override
    public void buildpuertas() {
        carro.setPuertas(5);
    }
    
}
