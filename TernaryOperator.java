public class TernaryOperator {
    public static void main(String[] args) {
        String makeOfCar = "Volkswagon";
        // boolean isDomestic = makeOfCar == "Volkswagon" ? false : true;
        boolean isDomestic = (makeOfCar != "Volkswagon") ; //better way
        
        // System.out.println(isDomestic);
        // if(isDomestic){
        //     System.out.println("this car is domestic to our country");   
        // }
        // else{
        //     System.out.println("this car is not domestic to our country");
        // }


        //better way
        String print = (isDomestic) ? "This car is domestic" : "This car is not domestic";
            System.out.println(print);
    }
}
