
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba que personaje desea crear");
        String character = sc.nextLine();
            switch(character){
            
            case "Heroe" :
                System.out.println("Ingrese los atributos del Heroe");
                System.out.println("Nombre:");
                String nombreh = sc.nextLine();
                System.out.println("Altura:");
                int alturah = sc.nextInt();
                System.out.println("Peso:");
                int pesoh = sc.nextInt();
                System.out.println("Inteligencia");
                int inteligenciah = sc.nextInt();
                Heroe hero = new Heroe(nombreh,alturah,pesoh,inteligenciah);
                System.out.println(hero);
                break; 

            case "Villano" :
                System.out.println("Ingrese los atributos del Villano");
                System.out.println("Nombre:");
                String nombrev = sc.nextLine();
                System.out.println("Altura:");
                int alturav = sc.nextInt();
                System.out.println("Peso:");
                int pesov = sc.nextInt();
                System.out.println("Inteligencia:");
                int inteligenciav = sc.nextInt();
                Villano villian = new Villano(nombrev,alturav,pesov,inteligenciav);
                System.out.println(villian);
                break; 

            case "Principe":
                System.out.println("Ingrese los atributos del Principe");
                System.out.println("Nombre:");
                String nombrep = sc.nextLine();
                System.out.println("Altura:");
                int alturap = sc.nextInt();
                System.out.println("Peso:");
                int pesop = sc.nextInt();
                System.out.println("Inteligencia:");
                int inteligenciap = sc.nextInt();
                Principe prince = new Principe(nombrep,alturap,pesop,inteligenciap);
                System.out.println(prince);
                break;

            case "Monstruo":
                System.out.println("Ingrese los atributos del Monstruo");
                System.out.println("Nombre:");
                String nombrem = sc.nextLine();
                System.out.println("Altura:");
                int alturam = sc.nextInt();
                System.out.println("Peso:");
                int pesom = sc.nextInt();
                System.out.println("Inteligencia:");
                int inteligenciam = sc.nextInt();
                Monstruo monster = new Monstruo(nombrem,alturam,pesom,inteligenciam);
                System.out.println(monster);
                break;
            default : 
                System.out.println("Elija entre Heroe, Villano, Principe, Monstruo");
                
        }
    }
}
