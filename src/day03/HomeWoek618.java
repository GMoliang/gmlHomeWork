package day03;

import java.util.Scanner;

/**
 * @program: gmlhomework
 * @description: 618作业
 * @author: Mr.Gml
 * @create: 2020-06-18 17:00
 **/
public class HomeWoek618 {

    public static void input(int[] odd,int[] even,int[] num){
        int oddNum=0;//奇数
        int evenNum=0;//偶数
        for(int i=0;i<8;i++){
            if((num[i]%2)==1){
                odd[oddNum++]=num[i];
            }else{
                even[evenNum++]=num[i];
            }
        }
        int index=0;
        while ((index<oddNum)&&(index<evenNum)){
            System.out.println(odd[index]);
            System.out.println(even[index]);
            index++;
        }
        while(index<oddNum){
            System.out.println(odd[index++]);
        }
        while(index<evenNum){
            System.out.println(even[index++]);
        }
    }

    public static void main(String[] args) {
        int[] num=new int[8];
        int oddNum=0;//奇数
        int evenNum=0;//偶数
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<8;i++){
            num[i]=sc.nextInt();
            if(num[i]%2==0) evenNum++;
            else oddNum++;
        }
        int[] odd=new int[oddNum];
        int[] even=new int[evenNum];
        input(odd,even,num);
    }


}
