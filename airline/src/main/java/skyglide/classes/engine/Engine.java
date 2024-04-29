package skyglide.classes.engine;

public abstract class Engine {
    int speed;
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void UseEngine(){
        System.out.println("the Engine is on");
    }
}
