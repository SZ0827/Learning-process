import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            show();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
    public static  void show() throws ParseException {
        String data="2025-3-8 11:12:13";
        SimpleDateFormat str=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date strs=str.parse(data);
        System.out.println(strs);


    }
}
