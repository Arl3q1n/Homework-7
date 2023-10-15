package exercises;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public void setDay(int day) {
        if (day < 31) {
            this.day = day;
        } else {
            this.day = 0;
        }
    }

    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        if (0 < month && month < 12) {
            this.month = month;
        } else {
            this.month = 0;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        if (0 < year && year <= 2023) {
            this.year = year;
        } else {
            this.year = 0;
        }
    }

    public int getYear() {
        return year;
    }


    public void displayDate() {
        System.out.println(getDay() + "/" + getMonth() + "/" + getYear());
    }
}
