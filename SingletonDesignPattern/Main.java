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

// This is a better Synchronization approach  as we are only synchronizing if the instance has not been created if it already exists then ther eis no need ofr that 
// also double check is there becaluse 2 parallal thread can  have instance == null and then one gets locked and then again if no check is done then new  isntance may get created 

class OptimizedSingleton {

    private static  OptimizedSingleton instance ; 
    private OptimizedSingleton(){}

    public static OptimizedSingleton getInstance(){

        if ( instance == null ) {

            synchronized(OptimizedSingleton.class){

                if ( instance == null ) {
                    instance = new OptimizedSingleton() ; 
                }
            }
        }
        return instance ;
    }
}





public class Main {

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance() ; 
        Singleton s2 = Singleton.getInstance() ; 

        OptimizedSingleton o1 = OptimizedSingleton.getInstance() ; 
        OptimizedSingleton o2 = OptimizedSingleton.getInstance() ; 
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(o1);
        System.out.println(o2);

        
    }
    
}
