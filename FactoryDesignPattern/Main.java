
public class Main {
    public static void main(String[] args) {

        String type = "veg" ; 

        PizzaFactory factory = new PizzaFactory() ; 
        PizzaInterface pizzaInstance = factory.returnPizza(type);
        pizzaInstance.bake(); 
        
    }
    
}


interface PizzaInterface{
    void bake() ; 

}

class VegPizza implements PizzaInterface{

    public void bake(){
        System.out.println("Baking VEG PIZZA right now ");
    }
} 

class NonVegPizza  implements PizzaInterface {

    public void bake(){
        System.out.println("Baking NonVeg pizza");
    }
}



class PizzaFactory {

    public PizzaInterface returnPizza(String pizzaType){
        if (pizzaType =="veg") return  new VegPizza(); 

        else   return  new NonVegPizza() ; 
    }
}



