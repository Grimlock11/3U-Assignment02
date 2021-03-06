
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ayyaf3300
 */
public class ProgrammingExercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // create acity
        City kw = new City();

        // create a robot
        Robot dino = new Robot(kw, 2, 3, Direction.EAST);

        // create walls
        new Wall(kw, 2, 3, Direction.SOUTH);
        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 2, 6, Direction.SOUTH);
        new Wall(kw, 2, 7, Direction.SOUTH);
        new Wall(kw, 2, 8, Direction.SOUTH);
        new Wall(kw, 2, 9, Direction.SOUTH);
        new Wall(kw, 2, 10, Direction.SOUTH);
        new Wall(kw, 2, 11, Direction.SOUTH);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 2, 6, Direction.EAST);
        new Wall(kw, 2, 9, Direction.EAST);

        // create thing
        new Thing(kw, 2, 11);
 
        // create algorithem that will tell the robot to avoid the hurdles 
        while (!dino.canPickThing()) {

            if (!dino.frontIsClear()) {
                dino.turnLeft();
                dino.move();
                dino.turnLeft();
                dino.turnLeft();
                dino.turnLeft();
                dino.move();
                dino.turnLeft();
                dino.turnLeft();
                dino.turnLeft();
                dino.move();
                dino.turnLeft();

            } else {
                dino.move();
            }

            

        }
        dino.pickThing();


    }
}
