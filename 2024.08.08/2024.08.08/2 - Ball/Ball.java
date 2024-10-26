public class Ball {
    private double x;
    private double y;
    private double xStep;
    private double yStep;
    
    public Ball(double x, double y, double xStep, double yStep) {
        this.x = x;
        this.y = y;
        this.xStep = xStep;
        this.yStep = yStep;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    public double getXStep() {
        return this.xStep;
    }

    public double getYStep() {
        return this.yStep;
    }
    
    public void setXStep(double xStep) {
        this.xStep = xStep;
    }
    
    public void setYStep(double yStep) {
        this.yStep = yStep;
    }
    
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
   
    
    public void setXYStep(double xStep, double yStep) {
        this.xStep = xStep;
        this.yStep = yStep;
    }

    public String toString() {
        return(" -x "+x+" -y "+y+" -xStep "+xStep+" -yStep "+yStep)
    }
   

}
