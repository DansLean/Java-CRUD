public class Agenda {
    String Nome;
    String Telefone;
    String Email;
    Agenda(String Nome, String Telefone, String Email) {
        this.Nome = Nome;
        this.Telefone = Telefone;
        this.Email = Email;
    }
    public void showAgenda() {
        System.out.println("Nome: " + Nome);
        System.out.println("Telefone: " + Telefone);
        System.out.println("Email: " + Email);
        System.out.println();
    }
}
