package Exercise36;

public class Circle {

    private double radius;

    public Circle(double radius) {
        if(radius>0){
            this.radius = radius;
        } else{
            this.radius = 0.0;
        }
    }

    public double getArea(){
        return (radius * radius) * Math.PI; //don't need () for pi
    }

    public double getRadius() {
        return radius;
    }
}
