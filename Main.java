
public class Main {

    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario();
        CarroBuilder carroMonovolumen = new Monovolumen();
        
        concesionario.setCarBuilder(carroMonovolumen);
        concesionario.buildCarro();
        
        Carro carro = concesionario.getCarro();
        System.out.println(carro);
    }
    
}
