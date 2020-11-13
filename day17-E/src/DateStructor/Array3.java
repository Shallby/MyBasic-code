package DateStructor;

public class Array3 {
    public static void main(String[] args) {
        //直接输入待求的线性方程组的增广矩阵
//        float[][] array = {{ 31,-13,  0,  0,  0,-10,  0, 0, 0,-15},
//                           {-13, 35, -9,  0,-11,  0,  0, 0, 0, 27},
//                           {  0, -9, 31,-10,  0,  0,  0, 0, 0,-23},
//                           {  0,  0,-10, 79,-30,  0,  0, 0,-9,  0},
//                           {  0,  0,  0,-30, 57, -7,  0,-5, 0,-20},
//                           {  0,  0,  0,  0, -7, 47,-30, 0, 0, 12},
//                           {  0,  0,  0,  0,  0,-30, 41, 0, 0, -7},
//                           {  0,  0,  0,  0, -5,  0,  0,27,-2,  7},
//                           {  0,  0,  0, -9,  0,  0,  0,-2,29, 10}};
        float[][] array = {{ 2,-4,  6,  3},
                           { 4,-9,  2,  5},
                           { 1,-1,  3,  4}};
        //输出未操作的矩阵
        System.out.println("**************************待求线性方程组为：*****************************");
        for(int i = 0; i < array.length; i ++) {
            for(int j = 0; j < array[i].length; j ++) {
                if (j==array[i].length-1) {
                    System.out.print(array[i][j]);
                    System.out.println();
                }else {
                    System.out.print(array[i][j]+",  ");
                }
            }
        }
        //使用列主元Gauss消去法解方程
        //找到列主元
        for (int j = 0; j <array.length; j++) {
            //先对j列下的元素找出最大值
            float max=array[j][j];//假设对角线上的是最大的
            int index=j;
            //寻找最大的值并返回索引
            for (int i = j; i <array.length ; i++) {
                if (max< array[i][j]) {
                    max=array[i][j];
                    index=i;
                }
            }
            //交换数组位置使得最大值总是在对角线上
            float[] temp=array[index];
            array[index]=array[j];
            array[j]=temp;
            //将该列下面的地方所有都变为零
            for (int i = 1+j; i <array.length; i++) {
                //改变下一行的比例系数
                    float r= array[i][j]/array[j][j];//得到比例数
                    for (int k = 0; k <array[0].length ; k++) {
//                        System.out.println(r);
                        array[i][k]=array[i][k]-r*array[j][k];
                    }
            }
        }
        System.out.println("*************************利用列主元Gauss消去法求得的矩阵：*************************");
        //输出操作之后的矩阵
        for(int i = 0; i < array.length; i ++) {
            for(int j = 0; j < array[i].length; j ++) {
                if (j==array[i].length-1) {
                    System.out.print(array[i][j]);
                    System.out.println();
                }else {
                    System.out.print(array[i][j]+",  ");
                }
            }
        }

        //输出解向量
        //for (int k = 0; k <array.length; k++) {
            for (int k = array.length - 1; k >= 0; k--) {
                //先进行单位化最后一行 用于回代
                array[k][array.length] = array[k][array.length] / array[k][k];
                array[k][k] = 1;
                //改变上一行的比例系数
                for (int i = k-1; i >=0; i--) {
                    //System.out.println(i);
                    float r = array[i][k];//得到比例数
                    for (int j =0; j<array.length+1 ; j++) {
                        //System.out.println(r);
                        array[i][j] = array[i][j] - r * array[k][j];
                    }
                }
            }
        //}
        System.out.println("*************************该线性方程组的解向量为：*************************");
        //输出操作之后的矩阵
        for(int i = 0; i < array.length; i ++) {
            for(int j = 0; j < array[i].length; j ++) {
                if (j==array[i].length-1) {
                    System.out.print(array[i][j]);
                    System.out.println();
                }else {
                    System.out.print(array[i][j]+",  ");
                }
            }
        }
    }
}
