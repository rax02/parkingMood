package utility;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class DateTimeUtil {
    /**
     * Convert String into LocalDateTime
     * DateTime format should be "2011-10-02 20:48:05"
     * @param timestamp
     * @return LocalDateTime
     */
    public static LocalDateTime getLocalDateTime(String timestamp){
        return LocalDateTime.of(Integer.valueOf(timestamp.substring(0,4)),
                Integer.valueOf(timestamp.substring(5,7)),
                Integer.valueOf(timestamp.substring(8,10)),
                Integer.valueOf(timestamp.substring(11,13)),
                Integer.valueOf(timestamp.substring(14,16)),
                Integer.valueOf(timestamp.substring(17,19)));


    }
}
