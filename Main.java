public class Main {
    public static void main(String [] args){
        Point p1 = new Point(0, 0, 'A');
        Point p2 = new Point(3, 4, 'B');
        Point p3 = new Point(0, 4, 'C');

        Point[] tabPoint;
        tabPoint = new Point[]{
            p1, p2, p3
        };

        Polygone poly;

        poly = new Polygone(tabPoint);
/*         p1.afficher();
        p2.afficher();

        System.out.println("La distance entre "+p1.getNom() +
                           " et "+p2.getNom()+" est de "+ p1.distance(p2)); */



        poly.afficher();
        System.out.println("Le périmètre du polygone est de :" + poly.perimetre());

        if(p1.getX() == p2.getX() && p1.getX() == p3.getX()
           || p1.getY() == p2.getY() && p1.getY() == p3.getY()
        ){
            return;
        }
        Triangle t = new Triangle(tabPoint);

        try{
            // Du code qu'on veut vérifier
        }catch(Exception e){
            System.out.println("Erreur: Utilisation erronée d'un triangle");
        }

        Rectangle r1 = new Rectangle(new Point(14, 12, 'E'), 6, 7);
        Rectangle r2 = new Rectangle(new Point(20, 12, 'F'), 2, 10);
        Rectangle r3 = new Rectangle(new Point(5, 9, 'G'), 7, 1);
        Rectangle r4 = new Rectangle(new Point(10, 21, 'H'), 4, 4);


        CollectionFigure cf = new CollectionFigure(t);
        
        cf.ajouterFigure(poly);
        cf.ajouterFigure(t);
        cf.ajouterFigure(r1);
        cf.ajouterFigure(r2);
        cf.ajouterFigure(r3);
        cf.ajouterFigure(r4);


        cf.afficherFigure();



    }
}
