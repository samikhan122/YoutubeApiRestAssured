package Utils;

import org.apache.poi.xwpf.usermodel.BreakType;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateGenerator {

    public static int getCurrentYear(){
        return LocalDate.now().getYear();
    }
}
