/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Main main_object = new Main();

        //Early test case
        //int x = 1 + 2 + 3 + 4;
        //System.out.println(x);
        //System.out.println(main_object.sumOfNumbers(100));
        //System.out.println(main_object.gaussVersion(100));

        
    }

    int sumOfNumbers (int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    int gaussVersion(int n) {
        int sum = n * (n + 1) / 2;
        return sum;
    }
}
