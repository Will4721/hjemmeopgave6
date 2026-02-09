import java.util.Random;

public class opgave6 {
    Random random;
    int action = 0;
     int p = 1;
    public opgave6() {
        this.random = new Random();
    }

        public void spin () {
        if(p == 1){
        int result = random.nextInt(6);
        if (result == 0) {
            System.out.println("Eating breakfeast");
        }
        if (result == 1) {
            System.out.println("Study something boring");
        }
        if (result == 2) {
            System.out.println("Go swimming");
        }
        if (result == 3) {
            System.out.println("Go fishing");
        }
        if (result == 4) {
            System.out.println("call your mom");
        }
        if (result == 5) {
            System.out.println("Go back to bed");
            action++;
        }
        if (action > 3) {
            p = 0;
            System.out.println("he was lazy and went back too bed for the rest of the day");

        }

    }
    }
}

