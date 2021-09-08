
public class Heroe extends Personajes{

    public Heroe(String nombre, int altura, int peso, int inteligencia){
        super(nombre,altura,peso,inteligencia);
    }
    
    public Heroe(Heroe prototype){
        super(prototype);
    }
    
    @Override
    public Personajes Clone() {
        return new Heroe(this);
    }
    
}
