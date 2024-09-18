public class Main{
    public static void main(String[] args) {
        //Задача 1
        int sum = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма чисел, кратных 3 или 5, равна " + sum);
        
        //Задача 2
        int[][] x = { {20, 34, 2}, {9, 12, 18}, {3, 4, 5} };
        int min = x[0][0];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] < min) {
                    min = x[i][j];
                }
            }
        }
        System.out.println("Минимальный элемент массива равен " + min);
    }
}