package DateAnalyze;

import java.lang.module.FindException;
import java.util.Scanner;

public class Vector {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //输入矩阵的阶数
        System.out.println("请输入矩阵的阶数:");
        int n =sc.nextInt();
        //输入矩阵的内容
        int[][] arrayVec=new int[n][n+1];//能够装n位元素的矩阵
        for(int i = 0; i < arrayVec.length; i ++) {
            System.out.println("请输入矩阵的第"+(i+1)+"行元素");
            for(int j = 0; j < arrayVec[i].length; j ++) {
                arrayVec[i][j]=sc.nextInt();
            }
        }
        //打印矩阵的内容；
        for(int i = 0; i < arrayVec.length; i ++) {
            for(int j = 0; j < arrayVec[i].length; j ++) {
                if (j==arrayVec[i].length-1) {
                    System.out.print(arrayVec[i][j]);
                    System.out.println();
                }else {
                    System.out.print(arrayVec[i][j]+",");
                }
            }
        }
        //使用列主元Gauss消去法解方程
            //找到列主元
        for (int j = 0; j <n; j++) {
            //先对j列下的元素找出最大值
            int max=arrayVec[0][j];
            int index=0;
            for (int i = 0; i <n ; i++) {
                if (max< arrayVec[i][j]){
                    max=arrayVec[i][j];
                    index =i;
                }
            }
            //交换数组位置使得向上移动
            int[] temp=arrayVec[index];
        }

    }
}
