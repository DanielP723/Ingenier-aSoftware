
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
    
    @Override
    public String toString(){
        if (inteligencia < 90){
            return("Mi nombre es "+nombre+" y soy un Heroe, mido "+altura+" centímetros y peso "+peso+" kilos y soy bobo");
        }else{
            return("Mi nombre es "+nombre+" y soy un Heroe, mido "+altura+" centímetros y peso "+peso+" kilos y soy listo");
        }
        
    }
    
}
