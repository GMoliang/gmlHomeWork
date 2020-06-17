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
    public static void main(String[] args) {
        jiujiu();
        dengyao();
    }
}
