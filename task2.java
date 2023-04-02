// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.




import java.io.BufferedReader;
import java.io.FileReader;

public class task2 {
    public static void main(String[] args) throws Exception {

        String dataFile = "file.txt";
        String[] infoBase;
        StringBuilder sb = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new FileReader(dataFile));
            String line; {
                while ((line = br.readLine()) != null) {
                    infoBase = line.replace("\"", "").split(":|,");
                    sb.append("Студент ").append(infoBase[1]).append(" получил ").append(infoBase[3])
                            .append(" по предмету ").append(infoBase[5]).append(".\n");
                }
                System.out.println(sb);
            }
            br.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
