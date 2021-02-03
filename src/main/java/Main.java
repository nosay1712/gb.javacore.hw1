import Interfaces.MovingObject;
import part1.Cat;
import part1.Human;
import part1.Robot;
import part2.Barrier;
import part2.Treadmill;
import part2.Wall;


public class Main {

    public static void main(String[] args) {

        MovingObject[] participants = new MovingObject[6];

        participants[0] = new Cat("Barsik", 850, 1);
        participants[1] = new Cat("Murzik", 300, 0);
        participants[2] = new Human("Petr", 600, 1.7);
        participants[3] = new Human("Semen", 1000, 1.4);
        participants[4] = new Robot("Bender", 2000, 10);
        participants[5] = new Robot("Electronik", 2500, 15);


        Barrier[] barriers = new Barrier[2];

        barriers[0] = new Treadmill(800);
        barriers[1] = new Wall(1.5);

        passBarriers(participants, barriers);

    }

    private static void passBarriers(MovingObject[] participants, Barrier[] barriers) {

        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < barriers.length; j++) {

                if (barriers[j] instanceof Wall) {
                    if (participants[i].isHasObjectDoneThat()) {
                        participants[i].jump((Wall) barriers[j]);
                    }
                }

                if (barriers[j] instanceof Treadmill) {
                    if (participants[i].isHasObjectDoneThat()) {
                        participants[i].run((Treadmill) barriers[j]);
                    }
                }
            }
        }
    }
}
