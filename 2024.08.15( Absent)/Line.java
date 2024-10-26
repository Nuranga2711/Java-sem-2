public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin,Point end){
        this.begin=begin;
        this.end=end;
    }
    public Line(int beginx,int beginy,int endx,int endy){
        this.begin=new Point(beginx,beginy);
        this.end=new Point(endx,endy);
    }

    public int getBeginX(){
        return begin.getX();
    }
    public int getBeginY(){
        return begin.getY();
    }
    public int getEndX(){
        return end.getX();
    }
    public int getEndY(){
        return end.getY();
    }

    public void setBeginX(int beginx){
        this.begin.setX(beginx);
    }
    public void setBeginY(int beginy){
        this.begin.setY(beginy);
    } 
    public void setEndX(int endx){
        this.end.setX(endx);
    }
    public void setEndY(int endy){
        this.end.setY(endy);
    }

    public double FindDistance(){
        return Math.sqrt((Math.pow((getBeginX()-getEndX()),2))+(Math.pow((getBeginY()-getEndY()),2)));
    }
    public double FindGradient(){
        return ((double)(getEndY()-getBeginY())/(double)(getEndX()-getBeginX()));
    }

    public String toString(){
        return("Begin Point is - "+begin.toString()+"\nEnd Point is - "+end.toString()+"\nDistance between points is : "+String.valueOf(FindDistance())+"\nGradient of points is : "+String.valueOf(FindGradient()));
    }
}
