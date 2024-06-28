import java.util.Scanner;

public class BurgerMasr {
    public BurgerMasr(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    DataBase dataBase;
    Scanner sc=new Scanner(System.in);
    public void Login(){
        while(true){
            System.out.println("Login as: ");
            System.out.println("1-User");
            System.out.println("2-Admin");
            System.out.println("3-exit");
            int answer= sc.nextInt();
            UserInterface user=null;
            if(answer==1) {
                user = new CustomerInterface(dataBase);
            } else if (answer==2){
                user = new AdminInterface(dataBase);
            } else if (answer==3) {
                break;
            }
            if(user!=null)user.Menu();
        }

    }
}
