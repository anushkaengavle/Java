public class challenge1 {
    public static void main(String[] args) {
        double var1 = 20.00;
        double var2 = 80.00;
        double add = (var1+var2)*100.00;
        // System.out.println("The addition of the 2 variable multiplied by 100.00 is "+add);    
        double rem = add % 40.00 ;
        // System.out.println("The remainder is " +rem);
        Boolean x = (rem == 0.00); 
        // Boolean x = rem==0.00 ? true : false ;//other way 

        if ((x==true)){
        System.out.println("The Remainder was 0");
        }else{
        System.out.println ("You got some Remainder.");
        }

        }
}
