// The wildcard import
import java.util.*;

public class Lottery {
    // create a simple print
    static void print(String x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // get random lottery number
        int lotteryNumber = (int) (Math.random() * 100);
        // extract digits from lottery numbers
        int lastLotteryNumber = lotteryNumber % 10;
        int firstLotteryNumber = (int) (lotteryNumber / 10);
        // prompt for user input
        print("Guess Number between 0 - 99: ");
        // the user guesses
        int guessNumber = input.nextInt();
        // extract digits form guess number
        int lastGuessNumber = guessNumber % 10;
        int firstGuessNumber = (int) (guessNumber / 10);
        print("The lottery number is " + lotteryNumber);
        if(guessNumber == lotteryNumber) {
            print("Exact Match, you win $10000");
        }else if(firstGuessNumber == lastLotteryNumber && lastGuessNumber == firstLotteryNumber) {
            print("All digits matched, you win $3000");
        }else if(firstGuessNumber == lastLotteryNumber || firstGuessNumber == firstLotteryNumber || lastGuessNumber == lastLotteryNumber || lastGuessNumber == firstLotteryNumber) {
            print("One digit matched, you win $1000");
        }else {
            print("Sorry friend, no digit matched");
        }
    }
}