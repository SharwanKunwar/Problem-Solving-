package Practice;

public class Time {
    int hour, minute, second;

    void displayTime(){
        System.out.println(hour+"H :"+minute+"M :"+second+"S");
    }
    Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    Time addTime(Time t){
        int totalSecond = (hour*3600+minute*60+second)+(t.hour*3600+t.minute*60+t.second);

        int newHour = (totalSecond/3600)%24;
        totalSecond-=newHour*3600;

        int newMinute = totalSecond/60;
        totalSecond -= newMinute*60;

        int newSecond = totalSecond;

        return new Time(newHour, newMinute, newSecond);
    }
}
