public class Pairsofelement {

        public static void findPairsWithSum(int[] list, int targetSum) {
            int n = list.length;//o(1)
            for (int i = 0; i < n; i++) {//o(n)
                for (int j = i + 1; j < n; j++) {//o(m)
                    if (list[i] + list[j] == targetSum) {//o(n*m)
                        System.out.println("Pair found: " + list[i] + " + " + list[j] + " = " + targetSum);
                    
                    }
                }
            }
        }
    
        public static void main(String[] args) {
            int[] array = { 1, 4, 6, 8, 10, 12, 14, 16 };//o(1)
            int targetSum = 16;//o(1)
    
            findPairsWithSum(array, targetSum);//o(1)
        }
    
    
}
// O(n*n)
