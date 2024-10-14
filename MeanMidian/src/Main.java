import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrNum = new int[9];
        for(int i = 0; i < arrNum.length; i++){
            arrNum[i] = scanner.nextInt();
        }
        for(int i : arrNum){
            System.out.println(i);
        }
        System.out.println("Mean: " + mean(arrNum));
        System.out.println("Median: " + median(arrNum));
    }
    public static int mean(int[] arrNum){
        int average = 0;

        average = total(arrNum) / arrNum.length;
        return average;
    }
    public static int total(int[] arrNum){
        int total = 0;
        for(int i = 0; i < arrNum.length; i++){
            total += arrNum[i];
        }
        return total;
    }
    public static int median(int[] arrNum){
            return (int) Math.pow(((double) arrNum.length / 2), total(arrNum));
    }
}