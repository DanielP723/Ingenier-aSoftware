
public class Main {

    public static void main(String[] args) {
        
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        
        logger1.setValue("log1");
        System.out.println(logger2.getValue());
        
    }
    
}
