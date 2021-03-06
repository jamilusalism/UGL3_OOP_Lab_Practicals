package src;

/**
 * @author @Jamilusalism & @hauwajibrilibrahim
 */

public class TestSphere extends Sphere {
    public static void main(String[] args) {
        Sphere sp1 = new Sphere(15);
        Sphere sp2 = new Sphere(20);
        Sphere sp3 = new Sphere(25);

        System.out.println("Volume of the Sphere with radius: " + sp1.getRadius() + " is " + sp1.volume(sp1.radius));
        System.out.println("Volume of the Sphere with radius: " + sp2.getRadius() + " is " + sp2.volume(sp2.radius));
        System.out.println("Volume of the Sphere with radius: " + sp3.getRadius() + " is " + sp3.volume(sp1.radius));

        System.out.println("The height of contact point between the spheres of radius: " + sp1.getRadius() + " and "
                + sp2.getRadius() + " is " + sp1.heightContactPoint(10));
        System.out.println("The height of contact point between the spheres of radius: " + sp1.getRadius() + " and "
                + sp3.getRadius() + " is " + sp2.heightContactPoint(20));
        System.out.println("The height of contact point between the spheres of radius: " + sp2.getRadius() + " and "
                + sp3.getRadius() + " is " + sp3.heightContactPoint(30));
        
    } 
}
