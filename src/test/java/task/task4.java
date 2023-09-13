package task;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class task4 {
    public static void main(String[] args) {
        happyNY();
    }

    public static void happyNY() {
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String currentDateTime = dateFormat.format(calendar.getTime());

        assert currentDateTime.equals("01/01/2023") : "Еще 2022 год :(";
        if(currentDateTime.equals("01/01/2023")){
        System.out.println("С новым годом!");}
    }
}
