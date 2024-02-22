public class Cylinder {
    static final double PI = 3.141592;
    public static void main(String[] args) {
        
        if (args.length < 2) {
            System.out.println("Not enough arguments.");
            System.exit(1);
        } 
        else if (args.length > 2) {
            System.out.println("Too many arguments.");
            System.exit(1);
        }
    
        double radius = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);

        if (radius < 0) {
            System.out.println("Radius cannot be negative.");
            System.exit(1);
        }
        
        if (height <0) {
            System.out.println("Height cannot be negative");
            System.exit(1);
        }

        double Volume = PI * Math.pow(radius, 2) * height;

        System.out.printf("The volume of the cylinder is %.2f%n", Volume);
    }
}
