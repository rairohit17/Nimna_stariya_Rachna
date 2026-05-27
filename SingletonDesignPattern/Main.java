// package SingletonDesignPattern ;
// Singleton design pattern is a design pattern in which we make s sure there is only oone instance of a class 
// and aavoid creating multiple Instance of a class 
// we create a class that  a statkc instance and we serve that instance every time all this happens by keeping the constructor private 

class Singleton{

    private static Singleton singletonInstance ; 
    private Singleton(){
        System.out.println("enw Singleton ahs been intitlaaized  ");
        

    }

    static public synchronized Singleton getInstance(){
        
        if ( singletonInstance == null) {
            singletonInstance = new Singleton() ; 

        }
        return singletonInstance ; 
    }
}





public class Main {

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance() ; 
        Singleton s2 = Singleton.getInstance() ; 
        
        System.out.println(s1);
        System.out.println(s2);

        
    }
    
}
