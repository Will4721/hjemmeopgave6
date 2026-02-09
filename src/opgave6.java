import java.util.Random;

public class opgave6 {
    Random random;
    int action = 0;

    public opgave6() {
        this.random = new Random();
    }

    public void spin(){
        int result = random.nextInt(6);
        System.out.println(result);

    }
}


