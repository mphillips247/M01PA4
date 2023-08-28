public class RegularPolygonTest {
    public static void main(String[] args) {
	//creates objects
        RegularPolygon rp1 = new RegularPolygon();
        RegularPolygon rp2 = new RegularPolygon(6, 4);
        RegularPolygon rp3 = new RegularPolygon(10, 4, 5.4, 7.8);
        
        System.out.println("Area=" + rp1.getArea());
        System.out.println("Perimeter=" + rp1.getPerimeter());
        System.out.println();
        System.out.println("Area=" + rp2.getArea());
        System.out.println("Perimeter=" + rp2.getPerimeter());
        System.out.println();
        System.out.println("Area=" + rp3.getArea());
        System.out.println("Perimeter=" + rp3.getPerimeter());
        System.out.println();
    }
}
