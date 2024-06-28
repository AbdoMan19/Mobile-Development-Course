import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CustomerInterface extends UserInterface {
    public CustomerInterface(DataBase dataBase) {
        super(dataBase);
    }

    @Override
    public void Menu() {
        HashMap<Burger,Integer>mp=getSandwichesToOrder();
        Order order=new Order(mp);
        System.out.println("Do you like to add any additions?");
        System.out.println("1- yes");
        System.out.println("2- No");
        int answer=sc.nextInt();
        if (answer==1){
            getAdditionsToOrder(order);
        }
        printOrderBrief(order);

        System.out.println("1-confirm");
        System.out.println("2-Back to Menu");
        answer=sc.nextInt();
        if (answer==1)order.printOrder();
        else if(answer==2)Menu();

        System.out.println("1-Back to Menu");
        System.out.println("2-exit");
        answer=sc.nextInt();
        if (answer==1){
            Menu();
        }


    }
    public HashMap<Burger,Integer> getSandwichesToOrder(){
        ViewBurgerMenu();
        System.out.println("Please select option: ");
        int answer=sc.nextInt();
        HashMap<Burger,Integer>mp=new HashMap<>();
        mp.put(dataBase.getBurgerList().get(answer-1),1);
        return mp;
    }
    public void getAdditionsToOrder(Order order){
        while (true){
            ViewAdditionMenu();
            System.out.println("Please select options, Select 0 for exit");
            int answer=sc.nextInt();
            if(answer==0)break;
            order.addAddition(dataBase.getAdditionList().get(answer-1));

        }
    }
    public void printOrderBrief(Order order){
        System.out.println("Your Order is: ");
        for (Burger burger : order.getBurgerList().keySet()){
            System.out.println(burger.name);
        }
        for (Addition addition : order.getAdditionList().keySet()){
            System.out.print(addition.name+"+");
        }
        System.out.println();
    }


}
