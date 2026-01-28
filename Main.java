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
    }
}
