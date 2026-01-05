package Day23JavaExamDay;

/*

 */
class Time{
    int hour,minute,second;

    // constructor
    Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //add time method
    Time addTime(Time t){
        int totalSecond = (this.hour*3600+this.minute*60+this.second)+(t.hour*3600+t.minute*60+t.second);

        int newHour = totalSecond/3600;
        totalSecond -= newHour*3600;
        int newMinute = totalSecond/60;
        totalSecond -= newMinute*60;
        int newSecond = totalSecond;
        return new Time(newHour,newMinute,newSecond);
    }
    // display
    void display(){
        System.out.println(this.hour+" : "+this.minute+" : "+this.second);
    }

}

public class Code12 {
    static void main(String[] args) {
        Time t1 = new Time(5,20,10);
        Time t2 = new Time(3,50,6);
        Time result = t1.addTime(t2);
        result.display();



    }
}
