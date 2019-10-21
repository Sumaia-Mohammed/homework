public class Rectangle extends Shape {
    double width ;
    double length ;

    Rectangle ( double width, double length){
        this.width= width;
        this.length= length;

    }

    public double calculateArea(){
        return  width * length;
    }

}
