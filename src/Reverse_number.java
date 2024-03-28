public class Reverse_number {
    // to write program to reverse number using for loop

    public static void main(String[] args) {
        int num =1234567,reverse = 0;
        for (;num != 0; num /= 10){
            int digit = num %10;
            reverse = reverse * 10 + digit;

        }
        System.out.println("reversed number is " + reverse);

    }
}
