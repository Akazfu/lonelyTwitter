package ca.ualberta.cs.lonelytwitter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public abstract class Mood{
    protected Date date;

    public Mood(){
        this.date = new Date();
    }

    public Mood(Date date){
        this.date = date;
    }

    public void setDate(String input) throws ParseException {
        String date_string = input;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH.ENGLISH);
        this.date = sdf.parse(date_string);

    }

    public Date getDate(){
        return this.date;
    }
}