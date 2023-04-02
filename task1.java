// 1. Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.*;

public class task1 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task1.class.getName());
        FileHandler fh = new FileHandler("Log.txt", false);
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        int[] arr = {12, 2, 59, 89, 525, 7, 43, 32, 58};
        int temp;
        logger.info("start sort");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                logger.info("check " + j + " element = " + arr[j]);
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    logger.info("swap " + arr[j+1] + " and " + arr[j]);
                }
            }
        }
        logger.info("end sort");
        System.out.println(Arrays.toString(arr));
    }
}
