package model;

public abstract class Entry {
    Date date;
    Time time;
    String label;
    int interval;

    public Entry(Date date, Time time, String label) {
        this.date = date;
        this.time = time;
        this.label = label;
    }

    public Date getEntryDate() {
        return date;
    }

    public void setInterval(Date d, Time t) {
        date = d;
        time = t;
    }

    public String getLabel() {
        return label;
    }

    public Time getTime() {
        return time;
    }

    public boolean isRepeating() {
        return interval != 0;
    }

    public void setIntervalOfRepetition(int interval) {
        this.interval = interval;
    }

    public int getInterval() {
        return interval;
    }


}
