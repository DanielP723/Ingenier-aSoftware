
public class Monstruo extends Personajes{

    public Monstruo(String nombre, int altura, int peso, int inteligencia){
        super(nombre,altura,peso,inteligencia);
    }
    
    public Monstruo(Monstruo prototype){
        super(prototype);
    }
    
    @Override
    public Personajes Clone() {
        return new Monstruo(this);
    }
    
    @Override
    public String toString(){
        if (inteligencia < 90){
            return("Mi nombre es "+nombre+" y soy un Monstruo, mido "+altura+" centímetros y peso "+peso+" kilos y soy bobo");
        }else{
            return("Mi nombre es "+nombre+" y soy un Monstruo, mido "+altura+" centímetros y peso "+peso+" kilos y soy listo");
        }
        
    }
    
}
