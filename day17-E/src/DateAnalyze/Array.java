package DateAnalyze;

public class Array {
    public static void main(String[] args) {
        float[][] array = {{1,2,3},{2,4,6},{3,6,9}};
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
        //for (int j = 0; j <n; j++) {
            //先对j列下的元素找出最大值
            float max=array[0][0];
            int index=0;
            for (int i = 0; i <array.length ; i++) {
                if (max< array[i][0]) {
                    max=array[i][0];
                    index=i;
                }
            }
            //交换数组位置使得向上移动
            float[] temp=array[index];
            array[index]=array[0];
            array[0]=temp;
            //将该列下面的所有都变为零
            for (int i = 1; i <array.length; i++) {
                //改变下一行的比例系数
                float r= array[i][0]/array[0][0];//得到比例数
                for (int k = 0; k <array.length ; k++) {
                    System.out.println(r);
                    array[i][k]=array[i][k]-r*array[0][k];
                }
            }
        //}
        System.out.println("*************************");
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
