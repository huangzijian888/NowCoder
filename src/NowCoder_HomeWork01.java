import java.util.Random;

public class NowCoder_HomeWork01 {
    public static void main(String args[]) {

        /*
        * Math.random()方法生成10个[0,99)之间的随机数字
        * */
        int[] randomNumMadeOfMath = new int[10];
        for (int i = 0; i < 10; i++) {
            randomNumMadeOfMath[i] = (int) (Math.random() * 99);
        }
        for (int i : randomNumMadeOfMath) {
            System.out.println("Math.random()生成:" + i);
        }

        /*
        * Random()生成10个[0,99)之间的随机数
        * 种子相同的Random对象产生的随机数序列是一样
        * 直接使用Random无法避免产生重复数字
        * */
        int[] randomNumMadeOfRandom = new int[20];
        Random random_01 = new Random(10);
        for (int i = 0; i < 10; i++) {
            randomNumMadeOfRandom[i] = random_01.nextInt(100);
        }
        for (int i : randomNumMadeOfRandom) {
            System.out.println("Random()生成:" + i);
        }

        /*
        * String操作
        * */
        String i = "88888";
        int numForTestString = i.hashCode();

    }
}
