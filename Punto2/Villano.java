
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
    
    @Override
    public String toString(){
        if (inteligencia < 90){
            return("Mi nombre es "+nombre+" y soy un Villano, mido "+altura+" centímetros y peso "+peso+" kilos y soy bobo");
        }else{
            return("Mi nombre es "+nombre+" y soy un Villano, mido "+altura+" centímetros y peso "+peso+" kilos y soy listo");
        }
        
    }
    
}
