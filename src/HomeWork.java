/**
 * @Auther: lh
 * @Date: 2021/9/2 - 09 - 02 - 23:56
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
import java.util.Random;
import java.util.Scanner;

public class HomeWork {

        public static void main (String[] args){
            //编写代码模拟三次密码输入的场景。最多能输入三次密码，密码正确，提示“登录成功"
            // 密码错误，可以重新输入，最多输入三次。三次均错，则提示退出程序
            Scanner scan = new Scanner(System.in);
            int count = 3;
            while (count != 0) {
                System.out.println("请输入你的密码：");
                String password = scan.nextLine();//密码是字符串
                if (password.equals("123456")) {//注意！！！在Java中比较字符串内容相同用equals
                    System.out.println("密码正确，登录成功！");
                    break;
                } else {
                    count--;
                    System.out.println("你还有" + count + "次机会");
                }

            }
        }


        public static void main13 (String[]args){
            //编写程序数一下1-100的所有整数中出现多少个数字9
            //9 19 29 39 49 59 69 79 89 90-99
            //判断数的个位和十位是不是9 个位：i % 10 十位： i/10
            int count = 0;
            for (int i = 1; i < 100; i++) {
                if (i / 10 == 9) {
                    count++;
                }
                if (i % 10 == 9) {
                    count++;
                }
            }
            System.out.println(count);

        }


        public static void main12 (String[]args){
            //计算1/1-1/2+1/3-1/4+1/5......+1/99-1/100
//            Scanner scan = new Scanner(System.in);
//            int n = scan.nextInt();
            double sum = 0;
            int flg = 1;
            for (int i = 1; i <= 100; i++) {
                sum = sum + 1.0 / i * flg;
                flg = -flg;
            }
            System.out.println(sum);
        }


        public static void main11 (String[]args){
            //求两个正整数的最大公因数  最简单方法：辗转相除法
            //余数为 0 的时候，除数就是最大的公约数
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = b;
            while (a % b != 0) {
                c = a % b;
                a = b;
                b = c;
            }
            System.out.println("最大公约数为：" + c);
        }


        public static void main10 (String[]args){
            //判断一个数是不是素数 方法2
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            for (int i = 2; i <= n / 2; i++) {
                //这种写法也可以
                // for (int i = 2; i <=(int)Math.sqrt(n); i++){
                if (n % i == 0) {
                    System.out.println(n + "不是素数！");
                    break;
                }
            }

        }


        public static void main9 (String[]args){
            //使用Scanner循环读取 N个数字，并求取其平均值
            Scanner sc = new Scanner(System.in);
            int sum = 0;
            int num = 0;
            while (sc.hasNextInt()) {
                int tmp = sc.nextInt();
                sum += tmp;
                num++;
            }
            System.out.println("sum=" + sum);
            System.out.println("avg=" + sum / num);
            sc.close();
        }//当循环输入多个数据的时候，使用ctrl+z来结束输入


        public static void main8 (String[]args){
            //猜数字游戏
            Scanner scan = new Scanner(System.in);
            Random random = new Random();
            //Random random =new Random(20210903);//如果给定一个时间戳，产生的随机数都相同
            //java中没有时间戳
            int randNum = random.nextInt(100);//[0,100)
            while (true) {
                System.out.println("请输入你要猜的数字：");
                int num = scan.nextInt();
                if (num < randNum) {
                    System.out.println("你猜的数字小了！");
                } else if (num == randNum) {
                    System.out.println("恭喜你猜对了！");
                    break;
                } else {
                    System.out.println("你猜的数字大了！");
                }
                scan.close();//注意使用Scanner的调用关闭方法
            }
        }


        public static void main7 (String[]args){
            //打印 X 图形
            Scanner sc = new Scanner(System.in);
            while (sc.hasNextInt()) {
                int x = sc.nextInt();
                char[][] arr = new char[x][x];//以用户输入的数字创建一个相同大小的二维数组
                //设置数组全为空格
                for (int i = 0; i < x; i++) {
                    for (int j = 0; j < x; j++) {
                        arr[i][j] = ' ';
                    }
                }
                //利用下标设置x
                for (int i = 0; i < x; i++) {
                    int left = 0;
                    int right = x - 1;
                    for (; left < x && right >= 0; left++, right--) {
                        arr[i][i] = '*';
                        arr[left][right] = '*';
                    }
                }
                //打印数组
                for (int i = 0; i < x; i++) {
                    for (int j = 0; j < x; j++) {
                        System.out.printf("%c", arr[i][j]);//格式化打印
                    }
                    System.out.println();
                }
            }
        }


        public static void main6 (String[]args){
            //打印0～999之间的所有“水仙花数”。
            // (“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身，
            // 如: 153＝1＋5＋3?，则153是一个“水仙花数“。）
            //判断一个数是不是水仙花数
            // 方法：先确定它是几位数 -> 再求取每一位，然后进行运算 -> 和原来的数字比较，如果结果相同就是要求的结果
            for (int i = 1; i < 1000; i++) {
                int a = i / 100;//百位
                int b = i % 100 / 10;//十位
                int c = i % 10;//个位
                if (a * a * a + b * b * b + c * c * c == i) {
                    System.out.println(i + "是水仙花数");
                }
            }
        }


//    public static void multiplicationTable(int n) {
//        //输出n*n的乘法口诀表，n由用户输入。
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + "*" + i + "=" + j * i + "\t");
//                //"\t"是java语言默认的制表符号 public static void main (String[]args){，
//                  //使用此符号打印出的惩罚表格较为美观
//            if (i == j) {
//                System.out.print("\n");//当换行条件成立时，进行换行打印
//                }
//            }
//        }
//    }

//    public static void main4(String[] args) {
//            Scanner scan = new Scanner(System.in);
//            int n = scan.nextInt();
//            multiplicationTable(n);
//        }


        public static void main3 (String[]args){
            //根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
            Scanner sc = new Scanner(System.in);//从键盘中输入一个数
            System.out.println("请输入需要判断的年龄");
            while (sc.hasNext()) {//循环读入多个整型
                int age = sc.nextInt();
                String tmp;
                if (age < 0) {
                    System.out.println("输入有误！");
                    break;
                } else if (age <= 18) {//少年(低于18)
                    tmp = "early youth";
                } else if (age >= 19 && age <= 28) {//青年(19-28)
                    tmp = "youth";
                } else if (age > 28 && age <= 55) {//中年(29-55)
                    tmp = "middle age";
                } else {
                    tmp = "old age";//老年(56以上)
                }

                switch (tmp) {
                    case "early youth":
                        System.out.println(age + "岁是少年人");
                        break;
                    case "youth":
                        System.out.println(age + "岁是青年人");
                        break;
                    case "middle age":
                        System.out.println(age + "岁是中年人");
                    case "old age":
                        System.out.println(age + "岁是老年人");
                        break;
                    default:
                        break;
                }
            }
        }


        public static void main2 (String[]args){
            //给定一个数字，判定一个数字是否是素数
            int num = 8;//给定数字为 8
            int n = 0;
            if (num < 2) {// 0、1都不是素数
                System.out.println("不是素数！");
            } else if (num == 2) {
                System.out.println("是素数！");
            } else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        System.out.println("不是素数！");
                        break;
                    } else if (i == (num - 1)) {
                        System.out.println("是素数！");
                        break;
                    }
                }
            }
        }


        public static void main1 (String[]args){
            //输出 1000 - 2000 之间所有的闰年
            for (int year = 1000; year <= 2000; year++) {
                boolean Isleapyear = false;
                if (year % 4 == 0 && year % 100 != 0) {
                    Isleapyear = true;
                } else if (year % 400 == 0) {
                    Isleapyear = true;
                } else {
                    System.out.println(year + " ");
                }
            }
        }

    }



