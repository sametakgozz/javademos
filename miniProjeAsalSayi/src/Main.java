public class Main {
    public static void main(String[] args) {
        //bug
        int number = 57;
        int remainder = number % 2;
        //System.out.println(remainder);
        boolean isprime = true;
        if (number == 1) {
            System.out.println("sayı asal değildir");
            return;
        }


        if (number < 1) {
            System.out.println("geçersiz sayı");
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isprime = false;

            }
        }
        if (isprime) {
            System.out.println("sayı asaldır");
        } else {
            System.out.println("sayı asal değildir");
        }
    }
}