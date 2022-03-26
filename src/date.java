//Create a class called Date that includes three instance variables—a month (type
//int), a day (type int) and a year (type int). Provide a constructor that initializes the three instance
//variables and assumes that the values provided are correct. Provide a set and a get method for each
//instance variable. Provide a method displayDate that displays the month, day and year separated
//by forward slashes (/).

public class date {
    private int Day;
    private int Month;
    private int Year;

    public date(int Day, int Month, int Year){
        this.Day = Day;
        this.Month = Month;
        this.Year = Year;

    }

    public void setDay(int day) {
        if (day >=1 && day <=31)
        Day = day;

        else {
            day = 0;
        }
    }

    public int getDay() {
        return Day;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12)
                this.Month = month;

        else{
            month=0;
        }
    }

    public int getMonth() {
        return Month;
    }

    public void setYear(int year) {
        if (year >= 1)
        Year = year;
        else {
            year = 0;
        }
    }

    public int getYear() {
        return Year;
    }
     public void displayDate(){
       System.out.printf("%nToday's date is %d/%d/%d", getDay(),getMonth(),getYear());
     }
}
