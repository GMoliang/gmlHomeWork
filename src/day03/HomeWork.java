package day03;

/**
 * @program: gmlhomework
 * @description: 今天的作业
 * @author: Mr.Gml
 * @create: 2020-06-17 08:41
 **/
public class HomeWork {
    //打印九九乘法表
    public static void jiujiu(){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+" ");
            }
            System.out.println();
        }
    }
    //打印等腰三角形
    public static void dengyao(){
        int n=5;
        for(int i=0;i<n;i++){
           for(int j=0;j<n-i;j++){
               System.out.print(" ");
           }
           for(int j=0;j<=2*i;j++){
               System.out.print("*");
           }
            System.out.println();
        }
    }
    //100以内所有质数的和
    public static boolean check(int n){
        for(int i=2;i*i<=n;i++)
            if(n%i==0)
                return false;
        return true;
    }
    public static void prime_sum(){
        int sum=0;
        for(int i=2;i<=100;i++){
            if(check(i)){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        jiujiu();
        dengyao();
        prime_sum();
    }
}
