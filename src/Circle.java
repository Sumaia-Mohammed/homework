public class Circle extends Shape{

double radius ;

Circle ( double radius){
    this.radius= radius;

}

public double calculateArea(){
    return Math.PI * radius * radius;
}

}
