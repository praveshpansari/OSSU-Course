package model;

public class Date {
    int month, date, year;
    String[] months = {"January", "February", "March", "April",
            "May", "June", "July", "August", "September", "October", "November", "December"};

    public Date(int date, int month, int year) {
        this.month = month;
        this.date = date;
        this.year = year;
    }

    public static boolean isGreaterThan(Date date1, Date date2) {
        int year1 = date1.getYear(),
                month1 = date1.getMonth(),
                day1 = date1.getDate();
        int year2 = date2.getYear(),
                month2 = date2.getMonth(),
                day2 = date2.getDate();

        if (year1 > year2)
            return true;
        else {
            if (month1 > month2)
                return true;
            else
                return (day1 > day2);
        }
    }

    public int getMonth() {
        return month;
    }

    public int getDate() {
        return date;
    }

    public int getYear() {
        return year;
    }

    public String getDateShort() {
        return date + "-" + month + "-" + (year % 1000);
    }

    public String getDateLong() {
        String temp;

        switch (date % 10) {
            case 1:
                temp = "st";
                break;
            case 2:
                temp = "nd";
                break;
            case 3:
                temp = "rd";
                break;
            default:
                temp = "th";
                break;
        }

        return date + temp + " " + months[month - 1] + ", " + year;
    }

}
