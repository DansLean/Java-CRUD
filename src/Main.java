import java.util.ArrayList;
import java.util.Scanner;
import java.util.Objects;
public class Main {
    public static void main (String[] args) {
        ArrayList<Agenda> agenda = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int escolha;
        String Nome;
        String Telefone;
        String Email;
        boolean rodando = true;
        int posicao = 0;

        while (rodando) {
            System.out.println("Agenda");
            System.out.println("1 - Inserir na agenda");
            System.out.println("2 - Consultar agenda");
            System.out.println("3 - Excluir da agenda");
            System.out.println("4 - Listar agenda");
            System.out.println("5 - Sair");
            System.out.print("> ");

            escolha = sc.nextInt();
            sc = new Scanner(System.in);

            switch (escolha) {
                case 1:
                    System.out.print("Insira o nome do novo contato:\n> ");
                    Nome = sc.next();
                    sc = new Scanner(System.in);

                    System.out.print("Insira o telefone do novo contato:\n> ");
                    Telefone = sc.next();
                    sc = new Scanner(System.in);

                    System.out.print("Insira o email do novo contato:\n> ");
                    Email = sc.next();
                    sc = new Scanner(System.in);

                    agenda.add(new Agenda(Nome, Telefone, Email));
                    break;
                case 2:
                    boolean vai = false;
                    System.out.print("Digite o nome do contato que deseja consultar:\n> ");
                    Nome = sc.next();
                    sc = new Scanner(System.in);

                    for (Agenda Agenda : agenda) {
                        if (Objects.equals(Nome, Agenda.Nome)) {
                            Agenda.showAgenda();
                            vai = true;
                            break;
                        }
                    }
                    if (!vai) {
                    System.out.println("Contato não cadastrado");
                }
                    break;
                case 3:
                    vai = false;
                    System.out.print("Digite o nome do contato que deseja excluir:\n> ");
                    Nome = sc.next();

                    for (Agenda Agenda : agenda) {
                        if (Objects.equals(Nome, Agenda.Nome)) {
                            agenda.remove(posicao);
                            vai = true;
                            break;
                        }
                        posicao++;
                    }
                    if (!vai) {
                        System.out.println("Contato não cadastrado");
                    }
                    break;
                case 4:
                    for (Agenda Agenda : agenda) {
                            Agenda.showAgenda();
                        }
                    break;
                case 5:
                    rodando = false;
                    break;
                default:
                    System.out.println("Número Inválido");
            }
        }
    }
}
