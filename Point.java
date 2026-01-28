public class Point{
    private int x;
    private int y;
    private char nom;

    public Point(int x, int y, char nom){
        this.x = x;
        this.y = y;
        this.nom = nom;

    }

    public void afficher(){
        System.out.println(this.nom +"("+ this.x +"," + this.y + ")");
    }

    public double distance(Point autrePoint){
        return Math.sqrt((this.x - autrePoint.x)*(this.x - autrePoint.x) + 
                    (this.y - autrePoint.y)* (this.y - autrePoint.y)  
               );
    }

    /**
     * Getters & setters
     */

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getNom() {
        return nom;
    }

    public void setNom(char nom) {
        this.nom = nom;
    }


    

}