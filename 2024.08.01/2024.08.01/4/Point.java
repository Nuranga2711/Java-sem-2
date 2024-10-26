public class Point {
private int x;
private int y;

public Point() {
    this.x = 0;
    this.y = 0;
}
    
public Point(int x, int y) {
    this.x = x;
    this.y = y;
}
    
public int getX() {
    return x;
}

public int getY() {
    return y;
}

public void setX(int x) {
    this.x = x;
}

public void setY(int y) {
    this.y = y;
}

public void setXY(int x,int y) {
    this.x = x;
    this.y = y;
}

public double distance(int x,int y){
     double xDiffrance = x -this.x;
     double yDiffrance = y -this.y;
     double distance =  Math.sqrt(xDiffrance * xDiffrance + yDiffrance * yDiffrance);

    return Math.round(distance * 1000) / 1000.0;
}

public double distance(){
     double xDiffrance = this.x-0;
     double yDiffrance = this.y-0;
     double distance =  Math.sqrt(xDiffrance * xDiffrance + yDiffrance * yDiffrance);

    return Math.round(distance * 1000) / 1000.0;
}
public String toString() {
        return ("[ x = " + this.x + " y = " + this.y + "]");
    }
}
