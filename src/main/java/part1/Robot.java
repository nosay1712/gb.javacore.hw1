package part1;

import Interfaces.MovingObject;
import part2.Treadmill;
import part2.Wall;

public class Robot implements MovingObject {

    private String name;
    private int maxLength;
    private double maxHeight;
    private boolean hasObjectDoneThat = true;

    public Robot(String name, int maxLength, double maxHeight)
    {
        this.name = name;
        this.maxHeight =  maxHeight;
        this.maxLength = maxLength;
    }

    public boolean isHasObjectDoneThat() {
        return hasObjectDoneThat;
    }

    @Override
    public void jump() {
        System.out.println(getClass().getName() + " can jump" );
    }

    @Override
    public void jump(Wall wall) {
        if (wall.getHeight() <= maxHeight)
        {
            System.out.println("Robot " + name + " jumped " + wall.getHeight() + " meters");
            hasObjectDoneThat = true;
        }
        else {
            System.out.println("Robot " + name + " can't jump so much");
            hasObjectDoneThat = false;
        }
    }

    @Override
    public void run() {
        System.out.println(getClass().getName() + " can run" );
    }

    @Override
    public void run(Treadmill treadmill) {
        if (treadmill.getLength() <= maxLength)
        {
            System.out.println("Robot " + name + " ran " + treadmill.getLength() + " meters");
            hasObjectDoneThat = true;
        }
        else {
            System.out.println("Robot " + name + " can't run so much");
            hasObjectDoneThat = false;
        }
    }
}
