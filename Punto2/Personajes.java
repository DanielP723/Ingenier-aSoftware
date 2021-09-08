
public abstract class Personajes implements Prototype{
    String nombre;
    int altura;
    int peso;
    int inteligencia;

    public Personajes(String nombre, int altura, int peso, int inteligencia) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.inteligencia = inteligencia;
    }

    public Personajes(Personajes prototype) {
        this.nombre = prototype.nombre;
        this.altura = prototype.altura;
        this.peso = prototype.peso;
        this.inteligencia = prototype.inteligencia;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
    
    @Override
    public abstract Personajes Clone();
    
}

