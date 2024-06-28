public class Main {
    public static void main(String[] args) {
        DataBase dataBase=new DataBase();
        dataBase.Init();
        BurgerMasr burgerMasr=new BurgerMasr(dataBase);
        burgerMasr.Login();
    }
}
