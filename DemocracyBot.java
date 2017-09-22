
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends Robot
{
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void fixBallots() {
        while(frontIsClear()){
            fix();
        }
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void fix(){
        while(!nextToABeeper()){
            move();
        }
        if(nextToABeeper()){
            pickBeeper();
            turnLeft();
            while(!nextToABeeper()){
                move();
            }
            if(nextToABeeper()){
                pickBeeper();
            }
            faceSouth();
             while(!nextToABeeper()){
                move();
            }
            if(nextToABeeper()){
                pickBeeper();
            }
        }
        faceNorth();
        move();
        turnRight();
    }
    public void faceNorth(){
        while(!facingNorth()){
            turnLeft();
        }
    }
    public void faceSouth(){
        while(!facingSouth()){
            turnLeft();
        }
    }
    
    
}

