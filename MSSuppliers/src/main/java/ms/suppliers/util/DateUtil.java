package ms.suppliers.util;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DateUtil {
	public String getFormatDate(Date date){
        return new SimpleDateFormat("yyyy-MM-dd").format(date);
    }
}
