
public class Review02 {

    public static void main(String[] args) {
        // iの値が1から101より小さいあいだ、処理を繰り返す
        for(int i = 1; i < 101; i++) {
            // iの値が３でも5でも割り切れる時
            if(i % 3 == 0 && i % 5 == 0) {
                // fizzbuzzと表示する
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0) {
                //fizzと表示する
                System.out.println("Fizz");

            }else if(i % 5 ==0) {
                //buzzと表示する
                System.out.println("Buzz");
            }else
                // iの値を表示する
                System.out.println(i);
        }

    }

}
