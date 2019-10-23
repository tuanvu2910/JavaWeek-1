package Fan;

public class main {
    public static void main(String[] args) {
        aFan Fan1 = new aFan(true,10,"yellow");
        Fan1.setSpeed(Fan1.FAST);
        aFan Fan2 = new aFan(false,5,"blue");
        Fan2.setSpeed(Fan1.MEDIUM);
        Fan1.tostring();
        Fan2.tostring();
    }
}
