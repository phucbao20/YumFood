
package Utils;

import java.text.SimpleDateFormat;
import java.util.Date;


public class XDate {
    static SimpleDateFormat formater = new SimpleDateFormat();
    public static java.util.Date toDate(String date, String pattern)
    {
        try
        {
            formater.applyPattern(pattern);
            return formater.parse(date);
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        return null;
    }
    public static String toString(Date date, String pattern)
    {
        if(date != null){
            formater.applyPattern(pattern);
            return formater.format(date);
        }
        return null;
    }
    public static java.util.Date addDay(Date date, long days)
    {
        date.setTime(date.getTime() + days*25*60*60*1000);
        return date;
    }


}
