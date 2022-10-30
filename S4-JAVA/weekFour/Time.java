package weekFour;

public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time(int hr, int min, int sec){
        this.hour = hr;
        this.minute = min;
        this.second = sec;
    }
    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hr, int min, int sec){
        this.hour = hr;
        this.minute = min;
        this.second = sec;
    }
    public Time nextSecond(){
        // if your current second is less than 58 you can increment 
        if(this.second<=58)
        this.second++;
        // if your second ==59 and your minute ==58
        else if(second==59 && minute<=58){
            this.second = 0;
            this.minute++;
        }
        // second ==59 && minute == 59 && hour <=22
        else if (this.second==59 && this.minute==59 && this.hour<=22){
            this.second = 0;
            this.minute = 0;
            hour++;
        }
        // second ==59 minute ==59 hour ==22
         else if(this.second==59 && this.minute==59 && this.hour==22){
            this.hour = 0;
            this.minute= 0;
            this.second = 0;
         }


        return(this);
    }
    public Time previousSecond(){
        if(second>=1)
        this.second++;
        else if(second==0 && minute>=1){
            this.second = 59;
            this.minute--;
        }
        else if(this.second==0 && this.minute>=0 && this.hour>=1){
            this.second = 59;
            this.minute = 59;
            hour--;
        }
        else if(this.second==0 && this.minute>=0 && this.hour==0){
            this.second = 59;
            this.minute = 59;
            this.hour = 23;
        }
        return(this);
    }
    @Override
    public String toString() {
        return "Time hour=" + hour + ", minute=" + minute + ", second=" + second;
    }
}   


