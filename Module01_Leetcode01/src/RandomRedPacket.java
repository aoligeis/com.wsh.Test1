import java.util.Random;
import java.util.Scanner;

public class RandomRedPacket {
    public static void main(String[] args) {
        System.out.println("-------微信抢红包-------");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入红包金额：");
        double total = sc.nextDouble();
        System.out.println("请输入红包个数：");
        int bagCount = sc.nextInt();


        double min = 0.01;
        Random r = new Random();

        for (int i=1;i<bagCount;i++){
            double max = total-(bagCount-i)*min;
            double bound = max-min;
            double safe = (double) r.nextInt((int) (bound*100))/100;
            double money = safe+min;
            total = total-money;
            System.out.println("第"+i+"红包"+String.format("%.2f",money)+"元");

        }
        System.out.println("第"+bagCount+"红包"+String.format("%.2f",total)+"元");
        sc.close();

    }
}
