package singelton.v1;

public class ChocolateBoilerWithSingelton {
    private boolean empty;  //BO'SH
    private boolean boiled; //QAYNATILGAN
    private static ChocolateBoiler uniqueInstance;

    public ChocolateBoilerWithSingelton(){
        empty = true;
        boiled = false;
        System.out.println("Boshlang'ich holat: empty=" + empty + "  boiled=" + boiled +"\n");
    }

    public static ChocolateBoiler getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }
    
    public boolean isEmpty(){
        return empty;
    }
    public boolean isBoiled(){
        return boiled;
    }
    //TO'LDIRISH
    public void fill(){
        if (isEmpty()){
            empty = false;
            boiled = false;
            System.out.println("ISITGICHNI SUT VA SHOKOLAD ARASHLASHMASI BILAN TO'LDIRISH");
            System.out.println("empty: " + empty);
            System.out.println("boiled: " + boiled);
            //ISITGICHNI SUT VA SHOKOLAD ARASHLASHMASI BILAN TO'LDIRISH
        }
    }
    //DRINAJ
    public void drain(){
        if (!isEmpty() && isBoiled()){
            //ISITILGAN SUT VA SHOKOLAD TO'KIB
            empty = true;
            System.out.println("ISITILGAN SUT VA SHOKOLAD TO'KIB");
            System.out.println("empty: " + empty);
        }
    }
    public void boil(){
        if (!isEmpty() && !isBoiled()){
            //TARKIBNI QAYNATISHGA KELTIRING
            boiled = true;
            System.out.println("TARKIBNI QAYNATISHGA KELTIRING");
            System.out.println("boiled: " + boiled);
        }
    }

    public static void main(String[] args) {
        ChocolateBoilerWithSingelton chocolateBoiler = new ChocolateBoilerWithSingelton();
        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.drain();

        System.out.println("==================================================================");

        ChocolateBoilerWithSingelton chocolateBoiler1 = new ChocolateBoilerWithSingelton();
        chocolateBoiler1.fill();
        chocolateBoiler1.boil();
        chocolateBoiler1.drain();


    }
}
