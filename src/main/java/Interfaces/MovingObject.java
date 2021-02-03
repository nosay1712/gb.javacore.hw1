package Interfaces;

import part2.Treadmill;
import part2.Wall;

public interface MovingObject {

    void jump();

    void jump(Wall wall);

    void run();

    void run(Treadmill treadmill);

    boolean isHasObjectDoneThat();
}
