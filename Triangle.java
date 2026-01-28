public class Triangle extends Polygone{
    private final static int TAILLE = 3;
    /**
     * Précondition : p est de taille 3
     * Les points ne sont pas alignés
     */
    public Triangle(Point []p){
        super(p);
        super.taille = TAILLE;
    }

    public Boolean estRectangle(){
        double coteA = this.tableauPoints[0].distance(this.tableauPoints[1]);
        double coteB = this.tableauPoints[1].distance(this.tableauPoints[2]);
        double coteC = this.tableauPoints[2].distance(this.tableauPoints[0]);

        if(carre(coteA) + carre(coteB) == carre(coteC)){
            return true;
        }else if(carre(coteA) + carre(coteC) == carre(coteB)){
            return true;
        }else if(carre(coteC) + carre(coteB) == carre(coteA)){
            return true;
        }

        return false;
    }

    public Boolean estIsocele(){
        double coteA = this.tableauPoints[0].distance(this.tableauPoints[1]);
        double coteB = this.tableauPoints[1].distance(this.tableauPoints[2]);
        double coteC = this.tableauPoints[2].distance(this.tableauPoints[0]);

        if((coteA==coteB)||(coteA==coteC)||(coteA==coteC)){
            return true;
        }
        return false;
    }

    public Boolean estEquilateral(){
        double coteA = this.tableauPoints[0].distance(this.tableauPoints[1]);
        double coteB = this.tableauPoints[1].distance(this.tableauPoints[2]);
        double coteC = this.tableauPoints[2].distance(this.tableauPoints[0]);

        if((coteA==coteB)&&(coteA==coteC)){
            return true;
        }
        return false;
    }



    private double carre(double a){
        return a * a;
    }
}
