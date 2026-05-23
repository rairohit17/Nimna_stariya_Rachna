//  In the  Strategy design pattern we take algorithm and mudalize then in order tho decide the behavious in the run time 
//  we create abstract class and then using it some concrete classes and then  
//  Create a Context class  which has a Has relation with the Interface and we cann pass and  of the CHild implementations in place of the Interface
// This way awe can define the bahaviour of the program at teh run time and the algorithms are modularized 

// ABSTRACT CLASS THAT IS USED TO CREATE VARIOUS ALGORITHM IMPLEMENTATIONS 
interface PaymentStrategy{

     void pay() ; 

    
}
// CONCRETE CLASSES IMPLEMENTING THE ASBTRACT CLASS 
class Gpay implements PaymentStrategy {

   public void pay(){

        System.out.println("This is Google Payment");
    }
}

class Neft implements PaymentStrategy {

    public void pay(){
        System.out.println("This is a Neft payment ");
    }
}

class PhonePay implements PaymentStrategy{

    public void pay() {
        System.out.println("This is Phone Pay payment ");
    }
}


// CONTEXT CLASS 

class ShoppingCart{
    PaymentStrategy payment ; 

    ShoppingCart(PaymentStrategy payment){
        this.payment = payment ; 

    }

    public void payment(){
        payment.pay() ; 
    }
}

public class Main{
public static void main(String[] args) {

    PaymentStrategy newGpay = new Gpay() ; 
    ShoppingCart cart = new ShoppingCart(newGpay) ; 
    cart.payment() ; 
    
}
}