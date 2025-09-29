public class problems {

    static void countDownOrigin(int num) {
        if (num == 0) {
            System.out.println("Blastoff!");
        } else {
            System.out.println("...");
            countDownOrigin(num - 1); // recursive call
        }
    }
    static void countDownNew(int num){
        if (num == 0) {
            System.out.println("Blastoff!");
        }else  {

            if (num % 2 == 0) {
                System.out.println(num);
            }
            countDownNew(num - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Original Countdown");
        countDownOrigin(5);
    }
}
/*
The output for this code is:

...
...
...
Blastoff!

The modification for the new print method will be done with the new method CountDownNew

The time complexity (Big O) of this code is O(n) because the amount of work remains constant
within the recursion so the code as a whole will run n number of times
 */