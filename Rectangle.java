public class Rectangle extends Polygone{


    public Rectangle(Point[] p) {
        super(p);
    }
 
    public Rectangle(Point p, int l, int h){
        this(creerPoints(p, l, h));
    }

    private static Point[] creerPoints(Point p, int l, int h) {
        Point[] tPoints =  new Point[4];
        tPoints[0] = p;
        tPoints[1] = new Point(p.getX()+l, p.getY(), 'B');
        tPoints[2] = new Point(p.getX()+l, p.getY()+h, 'C');
        tPoints[3] = new Point(p.getX(), p.getY()+h, 'D');

        return tPoints;
    }


    public double aire(){
        double aireRectangle = this.tableauPoints[0].distance(this.tableauPoints[1]) * 
                            this.tableauPoints[1].distance(this.tableauPoints[2]);

        return aireRectangle;
    }

    public Boolean estCarre(){
        return this.tableauPoints[0].distance(this.tableauPoints[1]) == 
               this.tableauPoints[1].distance(this.tableauPoints[2]);
    }

}