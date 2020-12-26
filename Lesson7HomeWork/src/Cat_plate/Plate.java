package Cat_plate;

public class Plate {


    private int food;

    public Plate(int food){
        this.food=food;

    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }


   public boolean decreaseFood(Cat cat){
        if(food>=cat.getAppetite()){
        food-=cat.getAppetite();

            System.out.println(cat.getName()+" поел");
        }
        else{
            System.out.println("В тарелке недостаточно еды");

        }
return (food >= cat.getAppetite());
   }



public void addFood(int food){
        this.food=food;
}




    public void plate_info(){

        System.out.println("plate: "+food);




    }
}
