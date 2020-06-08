
import java.util.Arrays;

public class app {


    public static void main(String[] args) {

        Integer[] data = {100, 200, 300, 400, null};// Потому что тип Integer(не примитивный ) и под капотам мы имеем право вставить "null" (throws NullPointerException)
        Integer[] data1 = {null, 100, 200, 300, 400};


        System.out.print("Before [data] ---> " + Arrays.toString(data));
        data = leftShift(data);
        System.out.println(" After [data] --->" + Arrays.toString(data));
        System.out.println();
        System.out.print("Before [data1] --->" + Arrays.toString(data1));
        data1 = rightShift(data1);
        System.out.println(" After [data1] --->" + Arrays.toString(data1));
    }


    public static Integer[] leftShift(Integer[] array) {
        //Передвигает значения null с последней ячейки в первую
        for (int i = array.length - 1; i > 0; ) {
            array[i--] = array[i];
            array[i] = null;

        }

        return array;
    }

    public static Integer[] rightShift(Integer[] array) {
        //Передвигает значения null с первой ячейки в последнюю
        for (int i = 0; i < array.length - 1; ) {
            array[i++] = array[i];
            array[i] = null;
        }

        return array;
    }

}
