import java.util.Arrays;

import com.sun.org.apache.xpath.internal.SourceTree;

class Sort {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] data = { 2, 5, 1, 3, 9, 8, 6, 4, 10, 7, 30, 25 };

        //bubbleSort(data);
        //insertSort2(data);
        selectionSort(data);

        System.out.println(Arrays.toString(data));
    }

    /**
     * 冒泡排序
     */
    public static void bubbleSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 插入排序
     */
    public static void insertSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            if (data[i - 1] > data[i]) {
                int temp = data[i];
                int j = i;
                while (j > 0 && data[j - 1] > temp) {
                    data[j] = data[j-1];//将自己的位置移到j的位置
                    j--;//下一个，进行迭代
                }
                data[j] = temp;
            }

        }
    }

    public static void insertSort2(int[] data){
        for (int i = 1; i < data.length; i++) {
            //前面的一位数小于后面的数
            if(data[i-1]>data[i]){
                int temp = data[i];
                int j = i;
                while(j>0 && data[j-1]>temp){
                    data[j] = data[j-1];
                    j--;
                }
                data[j] = temp;
            }
        }
    }

    public static void selectionSort(int[] data){
        for (int i = 0; i < data.length-1; i++) {
            for (int j = i; j < data.length; j++) {
                if(data[i]>data[j]){
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
            
        }
    }

}