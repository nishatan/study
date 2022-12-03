package com.nishatan.arrow;

public class QS12 {
    public static void main(String[] args) {
        int n = 3;
        int[] array = new int[n];
        if (n <= 0) return;
        printArray(array, 0);
    }

    private static void printArray(int[] array, int n) {
        for (int i = 0; i < 10; i++) {
            if (n != array.length) {				//依次将array的各位设为0-9
                array[n] = i;
                printArray(array, n + 1);			//设置下一位
            } else {								//设置好后就准备打印
                boolean isFirstNo0 = false;			//前面是否有非零的数
                for (int j = 0; j < array.length; j++) {
                    if (array[j] != 0) {			//从前向后打印，如果不为0就输出
                        System.out.print(array[j]);
                        if (!isFirstNo0)
                            isFirstNo0 = true;
                    } else {						//如果为0，就看前面是否有不为0的数，如果有就输出
                        if (isFirstNo0)
                            System.out.print(array[j]);
                    }
                }
                System.out.println();
                return;
            }
        }
    }
}
