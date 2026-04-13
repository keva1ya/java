public class primecheck {
    public static void main(String[] args) {
        int n=7;
        for (int i=2; i<n; i++) {
            if (n ==0){
                System.out.println("Enter valid no.");
            }
            if (n % i == 0) {
                System.out.println("the number isnt prime");
            }
            else{
                System.out.println("the number is prime");
                }
                    
    }
}
}