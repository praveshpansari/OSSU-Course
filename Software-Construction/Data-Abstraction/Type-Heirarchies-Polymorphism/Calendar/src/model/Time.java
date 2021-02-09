package model;

public class Time {
    int minutes, hours;

    public Time(int minutes, int hours) {
        this.hours = hours;
        if (minutes > 59) {
            this.hours++;
            this.minutes = minutes - 60;
        } else {
            this.minutes = minutes;
        }
    }

    public String getTime12() {
        String hoursFormat = String.format("%02d", hours);
        String minutesFormat = String.format("%02d", minutes);
        if (hours < 12)
            return hoursFormat + ":" + minutesFormat + " AM";
        else if (hours == 12)
            return hoursFormat + ":" + minutesFormat + " PM";
        else if (hours == 24)
            return 0 + ":" + minutesFormat + " AM";
        else
            hoursFormat = String.format("%01d", hours - 12);
        return hoursFormat + ":" + minutesFormat + " PM";
    }

    public String getTime24() {
        return String.format("%02d", hours) + ":" + String.format("%02d", minutes) + " hours";
    }

}
