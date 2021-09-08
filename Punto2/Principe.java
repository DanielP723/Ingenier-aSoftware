
public class Principe extends Personajes{

    public Principe(String nombre, int altura, int peso, int inteligencia){
        super(nombre,altura,peso,inteligencia);
    }
    
    public Principe(Principe prototype){
        super(prototype);
    }
    
    @Override
    public Personajes Clone() {
        return new Principe(this);
    }
    
    
}
