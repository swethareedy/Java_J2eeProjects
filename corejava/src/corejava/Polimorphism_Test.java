package corejava;


class BankA{
    int getRateOfInterest(){
        return 0;
    }
}

class IC extends BankA{
    int getRateOfInterest(){
        return 7;
    }
}

class HSBC extends BankA{
    int getRateOfInterest(){
        return 8;
    }
}

class HINDU extends BankA{
    int getRateOfInterest(){
        return 9;
    }
}

public class Polimorphism_Test {
    public static void main(String[] args) {
        BankA b1=new IC();
        BankA b2=new HSBC();
        BankA b3=new HINDU();
        
        System.out.println("IC Rate of Interest:"+b1.getRateOfInterest());
        System.out.println("HSBC Rate of Interest:"+b2.getRateOfInterest());
        System.out.println("HINDU Rate of Interest:"+b3.getRateOfInterest());
    }

}