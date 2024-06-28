import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Order {
    public Order(HashMap<Burger,Integer> burgerList) {
        BurgerList = burgerList;
    }

    public HashMap<Burger,Integer> getBurgerList() {
        return BurgerList;
    }

    public void setBurgerList(HashMap<Burger,Integer> burgerList) {
        BurgerList = burgerList;
    }

    public HashMap<Addition,Integer> getAdditionList() {
        return AdditionList;
    }

    public void setAdditionList(HashMap<Addition,Integer> additionList) {
        AdditionList = additionList;
    }
    public void addBurger(Burger burger){
        BurgerList.put(burger, BurgerList.get(burger) +1);
    }
    public void addAddition(Addition addition){
        AdditionList.put(addition,1);
    }
    public void printOrder(){
        int totalPrice=0;
        System.out.println("Receipt: ");
        for (Map.Entry<Burger,Integer>entry : BurgerList.entrySet()){
            System.out.println(entry.getValue() + " " + entry.getKey().name + " " + entry.getValue()*entry.getKey().price);
            totalPrice+=entry.getValue()*entry.getKey().price;
        }
        for (Map.Entry<Addition,Integer>entry : AdditionList.entrySet()){
            System.out.println(entry.getValue() + " " + entry.getKey().name + " " + entry.getValue()*entry.getKey().price);
            totalPrice+=entry.getValue()*entry.getKey().price;
        }
        System.out.println("Total : " + totalPrice);
    }


    HashMap<Burger,Integer> BurgerList=new HashMap<>();
    HashMap<Addition,Integer> AdditionList=new HashMap<>();

}
