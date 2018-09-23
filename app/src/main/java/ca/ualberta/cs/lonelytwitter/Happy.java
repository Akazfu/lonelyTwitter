package ca.ualberta.cs.lonelytwitter;

import android.util.Log;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class Happy extends Mood{

    protected String message;

    public void setDate(String input) throws ParseException {
        String date_string = input;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH.ENGLISH);
        this.date = sdf.parse(date_string);

    }

    public Date getDate(){
        return date;
    }

    public void moodstring(){
        this.message = "I am happy!";
        Log.d("happy","I am happy!");
    }


}
