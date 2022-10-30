package weekThree;

public class Date {
    private int day, month, year;

    public Date(){
        day = 1;
        month = 1;
        year = 1900;
    }
    public Date (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString(){
        String d = String.valueOf(this.day);
        String m = String.valueOf(this.month);
        if(this.day<10)
        d = ("0"+this.day);
        if(this.month<10)
        m = ("0"+this.month);
        return (d+"/" + m + "/" + this.year);
    }
    
    
    
}
