public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        IDandPasswords idandPasswords = new IDandPasswords();

        LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());
    }
}