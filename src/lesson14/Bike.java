package lesson14;

public class Bike implements Comparable<Bike> {

    private String model;
    private int price;
    private String color;
    private int wheelSize;

    public Bike(String model, int price, String color, int wheelSize) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.wheelSize = wheelSize;
    }

    public void show() {
        System.out.println("color: " + this.color + "model: " + this.model + " price: " + this.price + " wheels: " + this.wheelSize);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }


    // public int compareTo(Bike bike) {
    //        return this.model.compareTo(bike.model);
    //    }


   /* public int compareTo(Bike bike) {
        if ( this.price < bike.getPrice()) {
            return -1;
            return this.color.compareTo(bike.color);
*/

   /* public int compareTo(Bike bike) {
        if (this.model.compareTo(bike.getModel()) < 0) {
            return -1;

        }else {
            return 1;
        }
    }*/

   /* public int compareTo(Bike bike) {
        if (this.color .equals( bike.getColor())) {
            return this.price- bike.getPrice();

        } else {
            return this.color.compareTo(bike.getColor());
        }

    }*/

  /*  public int compareTo(Bike bike) {
        if (this.price<(bike.getPrice())) {
            return -1;
        } else if (this.price==bike.getPrice()) {
            // if the coolness is the same, we want to compare price!
            return this.color.compareTo(bike.getColor());
        } else return 1;
    }*/

   /* public int compareTo(Bike bike) {
        if (this.price==bike.getPrice()) {
            return this.color.compareTo(bike.getColor());
        }else {
            return -1;
        }
    }*/

  /*  public int compareTo(Bike bike) {
        if (this.color.equals(bike.getColor())) {
            return this.price-bike.getPrice();
        }else {
            return this.color.compareTo(bike.getColor());
        }
    }*/

  public int compareTo(Bike bike) {
      if (this.color.equals(bike.getColor())) {
          return this.price-bike.getPrice();
      }else {
          return -1;
      }
  }


}