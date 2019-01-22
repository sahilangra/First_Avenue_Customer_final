package thebetadeveloper.app.first_avenue_customer;

public class FoodMenu {
    String food_id;
    String food_name;
    int food_price;
    public FoodMenu(){}
    public FoodMenu(String id,String name,int price)
    {
        food_id=id;
        food_name=name;
        food_price=price;
    }

    public String getFood_id() {
        return food_id;
    }

    public void setFood_id(String food_id) {
        this.food_id = food_id;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public int getFood_price() {
        return food_price;
    }

    public void setFood_price(int food_price) {
        this.food_price = food_price;
    }
}
