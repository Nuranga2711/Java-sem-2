
public class Time {
    private int second = 0;
    private int minute = 0;
    private int hour = 0;

    public Time() {
        this.second = 0;
        this.minute = 0;
        this.hour = 0;
    }

    public Time(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (hour == 24) {
            this.hour = 0;
        } else if (hour < 24 && hour>=0) {
            this.hour = hour;
        } else {
            System.out.println("Input hour is error ");
        }
    }

    public void setMinute(int minute) {
        if (minute == 60) {
            this.minute = 0;
            this.hour = (this.hour + 1) % 24;
        } else if (minute < 60 && minute>=0) {
            this.minute = minute;
        } else {
            System.out.println("Input minute is error ");
        }
    }

    public void setSecond(int second) {
        if (second == 60) {
            this.second = 0;
            this.minute++;
            if ( this.minute >= 60) {
                 this.minute = 0;
                this.hour = (this.hour + 1) % 24;
            }
        } else if (second < 60 && second>=0) {
            this.second = second;
        } else {
            System.out.println("Input second is error ");
        }
    }

    
    public String toString() {
        return ("Hour:" + this.hour + " Minute:" + this.minute + " Second:" + this.second);
    }

    public void setTime(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;

    }
    
    public Time nextSecond() {
        second++;
        if (second >= 60) {
            second = 0;
            minute++;
            if (minute >= 60) {
                minute = 0;
                hour = (hour + 1) % 24;
            }
        }
        return this;

    }

}