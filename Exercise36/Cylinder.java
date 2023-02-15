package Exercise36;

public class Cylinder extends Circle{

    private double height;

    public Cylinder(double radius, double height) {
        super(radius); //calls super constructor to populate parent fields
        if(height>0){
            this.height = height;
        } else{
            this.height = 0.0;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return (getArea() * height);
    }
}
