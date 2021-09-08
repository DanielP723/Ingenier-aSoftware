
public class Villano extends Personajes{

    public Villano(String nombre, int altura, int peso, int inteligencia){
        super(nombre,altura,peso,inteligencia);
    }
    
    public Villano(Villano prototype){
        super(prototype);
    }
    
    @Override
    public Personajes Clone() {
        return new Villano(this);
    }
    
    
}
