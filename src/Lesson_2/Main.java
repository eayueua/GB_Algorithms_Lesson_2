package Lesson_2;

public class Main {

    public static void main(String[] args) {
        arrayRandom(5, 5);
    }

//Метод arrayRandom заполняет массив заданой длины b случайными цифрами.
//n - диапозон, в котором происходит генерация случайного числа
    public static void arrayRandom (int b, int n) {
        int[]arr = new int[b];
        System.out.println("Массив длинной" + " " + b + " "+"заполнен случайными цифрами:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*n);
            System.out.print(arr[i]+ " ");

        }
    }

}
