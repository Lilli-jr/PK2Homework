package Exercise1;

public class DotProductThread extends Thread{
    int v1;
    int v2;
    int dot;

    public DotProductThread(int v1, int v2) {
        this.v1 = v1;
        this.v2 = v2;
    }
    public void run(){
        dot = v1 * v2;
    }

    public int getDot() {
        return dot;
    }
}
