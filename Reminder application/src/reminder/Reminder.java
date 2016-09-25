package reminder;

import java.util.Date;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import static jdk.nashorn.internal.objects.NativeDate.setTime;




//get reminder deatils from user
class Reminder {
    
    private String reminderName;
    private int reminderNO;
    private Date date;
    private String time;

    public String getReminderName() {
        return reminderName;
    }

    public void setReminderName(String reminderName) {
        this.reminderName = reminderName;
    }

    public int getReminderNO() {
        return reminderNO;
    }

    public void setReminderNO(int reminderNO) {
        this.reminderNO = reminderNO;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    
     
    
            }

