package Lab1;

public class ControlFlow {
    private int times=10;

    public int addManyTimes(){
        int result=3;

        while (times > 0) {
            result++;
            times--;
        }
        return result; //daca era result fara times-- nu ar fi returnat nimic pentru ca times e mereu mai mare ca 0;
    }
}
