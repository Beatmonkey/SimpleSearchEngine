class Clock {

    int hours = 12;
    int minutes = 0;
    int minutesMin = 0;
    int minutesMax = 59;
    int hoursMin = 1;
    int hoursMax = 12;

    void next() {
        if (minutes == minutesMax) {
            this.minutes = minutesMin;
            if (this.hours >= this.hoursMax) {
                this.hours = this.hoursMin;
            } else {
                this.hours++;
            }

        } else {
            this.minutes++;
        }
    }

/*    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.hours = 12;
        clock.minutes = 59;

        clock.next();
        System.out.println(clock.hours + " " + clock.minutes);
    }*/
}