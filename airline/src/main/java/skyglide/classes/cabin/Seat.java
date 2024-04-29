package skyglide.classes.cabin;

public class Seat {
    private int code;
    private boolean free;

    public Seat(int code){
        setCode(code);
        setFree(true);
    }



    public void setCode(int code) {
        this.code = code;
    }
    public void setFree(boolean free) {
        this.free = free;
    }
    public int getCode() {
        return code;
    }
    public boolean isfree(){
        return free;
    }

}
