
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
    
    @Override
    public String toString(){
        if (inteligencia < 90){
            return("Mi nombre es "+nombre+" y soy un Principe, mido "+altura+" centímetros y peso "+peso+" kilos y soy bobo");
        }else{
            return("Mi nombre es "+nombre+" y soy un Principe, mido "+altura+" centímetros y peso "+peso+" kilos y soy listo");
        }
        
    }
    
}
