public class Polygone {
    protected Point [] tableauPoints;
    protected int taille;

    public Polygone(Point[] p){
        this.tableauPoints = p;
        this.taille = p.length;
    }

    public void afficher(){
        for(int i=0; i<taille;i++){
            this.tableauPoints[i].afficher();
        }
    }
    
    public double perimetre(){
        double dist = 0;
        for(int i=0; i<taille-1; i++){
            dist+= this.tableauPoints[i].distance(this.tableauPoints[(i+1)%taille]);
        }

        //dist+=this.tableauPoints[taille-1].distance(this.tableauPoints[0]);


        return dist;
    }


}
