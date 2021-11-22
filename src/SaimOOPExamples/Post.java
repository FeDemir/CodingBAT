package SaimOOPExamples;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {
    private String body;
    private String dateTime;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDateTime() {
        return dateTime;
    }

    public final void setDateTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/DD/YYYY HH:MM:SS");
        LocalDateTime now = LocalDateTime.now();
        dateTime= now.toString();
    }

    public Post(String body) {
        setBody(body);
        setDateTime();
    }
}
