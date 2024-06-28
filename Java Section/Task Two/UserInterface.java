import java.util.Scanner;

public abstract class UserInterface {
    DataBase dataBase;

    public UserInterface(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    Scanner sc=new Scanner(System.in);
    public void ViewBurgerMenu(){
        System.out.println("Menu:");
        for (int i=1;i<=dataBase.getBurgerList().size();i++) {
            System.out.println(i + "- " + dataBase.getBurgerList().get(i-1).name);
        }
        System.out.println();
    }
    public void ViewAdditionMenu(){
        System.out.println("Addition:");
        for (int i=1;i<=dataBase.getAdditionList().size();i++) {
            System.out.println(i + "- " + dataBase.getAdditionList().get(i-1).name);
        }
        System.out.println();
    }
    public abstract void Menu();



}
