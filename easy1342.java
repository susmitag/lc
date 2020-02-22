public class easy1342 {

    static public int numberOfSteps (int num) {
        if (num == 0) return 0;
        boolean isOdd = (num % 2 == 1) ? true : false;
        return 1 + numberOfSteps(isOdd ? num - 1 : num / 2);
    }

    public static void main(String args[]){
        System.out.println(numberOfSteps(123));
    }
}
