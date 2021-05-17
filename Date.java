public class Date {
    int day;
    int month;
    int year;

    public Date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;

    }

    public int getDay() {
        return day;
    }

    public void setDay(int d) {
        if (day >=0 && day <= 31)
            d = day;
        else {
            day=0;
        }
        }

    public int getMonth() {
        return month;
    }

    public void setMonth(int m) {
        if (month>=0&&month<=12)

        m = month;
        else {
            month=0;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int y) {

        y= year;
    }

public void displayDate(){

    System.out.printf("%d/%d/%d",getDay(),getMonth(),getYear());
}
}
