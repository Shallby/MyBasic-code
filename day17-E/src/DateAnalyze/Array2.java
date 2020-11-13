package DateAnalyze;

public class Array2 {
    public static void main(String[] args) {
        float[][] array = {{1,2,1,5},{1,1,1,4},{2,1,3,9}};
        //输出矩阵
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
            float max=array[j][j];
            int index=j;
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
            //将该列下面的所有都变为零
            for (int i = 1+j; i <array.length; i++) {
                //改变下一行的比例系数
                    float r= array[i][j]/array[j][j];//得到比例数
                    for (int k = 0; k <array[0].length ; k++) {
                        System.out.println(r);
                        array[i][k]=array[i][k]-r*array[j][k];
                    }
            }
        }

        System.out.println("*************************");
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
