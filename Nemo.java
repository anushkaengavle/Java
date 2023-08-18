public class Nemo {
    public static void findNemo(String a) {
        if (a == "Nemo") { 
            System.out.println("FOUND NEMO!!");
        }
    }

    public static void main(String[] args) {
        String nemo = "Nemo"; //o(1)
        findNemo(nemo);//o(1)
    }
}
//O(1)