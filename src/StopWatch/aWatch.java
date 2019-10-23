package StopWatch;

public class aWatch {
    private double startTime ;
    private double endTime ;
    public aWatch(){
    }
    public aWatch(double startTime,double endTime){
        this.startTime = startTime;
        this.endTime =  endTime;
    }

    public void start() {
       this.startTime = System.currentTimeMillis();
    }
    public void stop() {
       this.endTime = System.currentTimeMillis();
    }
    public double getElapsedTime(){
        return this.endTime - this.startTime;
    }



    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }
}
