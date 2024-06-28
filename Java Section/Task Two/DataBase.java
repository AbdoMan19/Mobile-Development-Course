import java.util.ArrayList;

public class DataBase {
    public ArrayList<Burger> getBurgerList() {
        return BurgerList;
    }

    public void setBurgerList(ArrayList<Burger> burgerList) {
        BurgerList = burgerList;
    }

    public ArrayList<Addition> getAdditionList() {
        return AdditionList;
    }

    public void setAdditionList(ArrayList<Addition> additionList) {
        AdditionList = additionList;
    }

    ArrayList<Burger>BurgerList=new ArrayList<>();
    ArrayList<Addition>AdditionList=new ArrayList<>();
    public void addBurger(Burger burger){
        BurgerList.add(burger);
    }
    public void addAddition(Addition addition){
        AdditionList.add(addition);
    }

    public void Init(){
        Burger cheeseBurger=new Burger("Cheese Burger",50);
        Burger elwa74=new Burger("elwqa74 Burger",50);
        Burger burgerElsa3ada=new Burger("burger Elsa3ada",50);
        BurgerList.add(cheeseBurger);
        BurgerList.add(elwa74);
        BurgerList.add(burgerElsa3ada);

        Addition cheese=new Addition("cheese",20);
        Addition katchup=new Addition("katchup",12);
        AdditionList.add(cheese);
        AdditionList.add(katchup);
    }
}
