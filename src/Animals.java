class Animal {
    int limbs;
    int weight;

    void breathe() {
        System.out.println("Animal breathes");
    }
}

class Mammal extends Animal {
    boolean hasWarmBlood;

    void giveMilk() {
        System.out.println("Mammal gives milk");
    }
}

class Reptile extends Animal {
    boolean hasColdBlood;

    void layEggs() {
        System.out.println("Reptile lays eggs");
    }
}

class Bird extends Animal {
    boolean canFly;

    void shitOnPeople() {
        System.out.println("YUCK!");
    }
}

class Fish extends Animal{
    boolean hasGills;

    void swim(){
        System.out.println(" Fish swimm");
    }
}

class Tiger extends Mammal {
    boolean isCarnivore;

    void roar() {
        System.out.println("ROAAAAARRRR!");
    }
}

class Snake extends Reptile {
    int length;
    boolean isVenomous;

    void slither() {
        System.out.println("Snake moves");
    }
}

class Penguin extends Bird {
    boolean livesInColdPlace;

    void run() {
        System.out.println("Penguin runs as it can't fly");
    }
}

class Shark extends Fish{
    boolean hasNotSwimBladder;

    void danger() {
        System.out.println("Shark is dangerous ");
    }
}

class CarnivorousShark extends Shark{
    int length;
    boolean haveSharpTeeth;

    void eatingMeatAndPeople() {
        System.out.println("Carnivorous Sharks eating meat and People  ");
    }
}

class PlanktivoreShark extends Shark{
    int length;
    boolean theirTeethAreTiny;

    void preferEatingPlankton() {
        System.out.println("Planktivore Sharks prefer plankton to meat ");
    }
}

public class Animals {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.hasWarmBlood = true;
        t.limbs = 4;
        t.weight = 100;
        t.isCarnivore = true;

        t.roar();
        t.breathe();
        t.giveMilk();

        Snake s = new Snake();
        s.hasColdBlood = true;
        s.isVenomous = true;
        s.length = 20;

        s.breathe();
        s.slither();
        s.layEggs();

        Penguin p = new Penguin();
        p.canFly = true;
        p.limbs =4;
        p.livesInColdPlace = true;

        p.breathe();
        p.run();
        p.shitOnPeople();

        Shark sh = new Shark();
        sh.hasGills = true;
        sh.hasNotSwimBladder = true;

        sh.breathe();
        sh.danger();
        sh.swim();

        CarnivorousShark c = new CarnivorousShark();
        c.length = 15;
        c.haveSharpTeeth = true;
        c.hasGills = true;
        c.hasNotSwimBladder = true;

        c.breathe();
        c.swim();
        c.danger();
        c.eatingMeatAndPeople();

        PlanktivoreShark pl = new PlanktivoreShark();
        pl.length =18;
        pl.theirTeethAreTiny = true;
        pl.hasGills = true;
        pl.hasNotSwimBladder = true;

        pl.breathe();
        pl.swim();
        pl.preferEatingPlankton();

    }
}


