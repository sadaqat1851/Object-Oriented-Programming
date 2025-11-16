// Lab1_Q2_Time.java
class Time {
    public int hr, min, sec;

    public void setTime(int h, int m, int s) {
        hr = h;
        min = m;
        sec = s;
    }

    public void display() {
        System.out.println("Time = " + hr + ":" + min + ":" + sec);
    }
}

public class Lab1_Q2_TimeRunner {
    public static void main(String[] args) {
        Time t = new Time();
        t.setTime(10, 45, 30);
        t.display();
    }
}
