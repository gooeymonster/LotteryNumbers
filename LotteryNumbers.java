import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();
    private ArrayList<Integer> numbersMain;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        this.numbersMain = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        int i = 1;
        int counter = 0;
        while(counter<39){
            this.numbersMain.add(i);
            i++;
            counter++;
        }
        int counter2 = 0;
        while(counter2<7){
            if(!this.containsNumber(numbersMain.size())){
                this.numbers.add(1 * this.random.nextInt(numbersMain.size()));
            }
            else{

            }

            counter2++;
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if(this.numbers.contains(number)){
            return true;
        }
        return false;
    }
}
