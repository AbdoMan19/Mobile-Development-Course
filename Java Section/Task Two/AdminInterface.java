import java.util.Locale;

public class AdminInterface extends UserInterface {

    public AdminInterface(DataBase dataBase) {
        super(dataBase);
    }

    @Override
    public void Menu() {
        while (true){
            System.out.println("1- View Menu");
            System.out.println("2- View Additions");
            System.out.println("3- Add New Item to Menu");
            System.out.println("4- Add New Addition");
            System.out.println("5- exit");



            int answer=sc.nextInt();
            if(answer==1) ViewBurgerMenu();
            else if(answer==2)ViewAdditionMenu();
            else if(answer==3)AddSandwichToMenu();
            else if (answer==4)AddAdditionToMenu();
            else if(answer==5)break;
        }

    }
    public void AddSandwichToMenu(){
        System.out.println("New Sandwich: ");
        System.out.println("Enter name: ");
        String name=sc.next();
        System.out.println("Enter Price: ");
        int price=sc.nextInt();
        System.out.println("Confirm:Y/N ");
        String confirm=sc.next().toLowerCase();
        if(confirm.equals("y")) {
            Burger burger = new Burger(name, price);
            dataBase.addBurger(burger);
        }

    }
    public void AddAdditionToMenu(){
        System.out.println("New Addition: ");
        System.out.println("Enter name: ");
        String name=sc.next();
        System.out.println("Enter Price: ");
        int price=sc.nextInt();
        System.out.println("Confirm:Y/N ");
        String confirm=sc.next().toLowerCase();
        if(confirm.equals("y")) {
            Addition addition = new Addition(name, price);
            dataBase.addAddition(addition);
        }

    }
}
