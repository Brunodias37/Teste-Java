package javaapplication1;
import java.util.Scanner;
import java.util.*;

public class JavaApplication1 {
    public static int Conta = 0;
    public static List<Account> ListadeContas = new ArrayList<Account>();
    public static Scanner input = new Scanner(System.in);
    public static int x = 1;
    //-----------------------------------------------------------------------
    public static void main(String[] args) {

        Menu();

//        if (num1 > num2) {
//            System.out.printf("%d > %d%n", num1, num2);
//        }
//        if (num1 < num2) {
//            System.out.printf("%d < %d%n", num1, num2);
//        }
//        if (num1 == num2) {
//            System.out.printf("%d = %d%n", num1, num2);
//        }
//        if (num1 != num2) {
//            System.out.printf("%d != %d%n", num1, num2);
//        }
    }
    
    public static void Menu() {
        do {
            System.out.println("-----Menu------");
            System.out.println("[1]-Registrar Conta");
            System.out.println("[2]-Procurar Conta");
            System.out.println("[3]-Deletar Conta");
            System.out.println("[4]-Sair");
            var Menu = input.nextInt();

            if (Menu == 1) {
                Cadastro();
            }
            if (Menu == 2) {
                System.out.print("-ID:");
                var id = input.nextInt();
                Procura(id);
            }
            if (Menu == 3) {
                System.out.print("-ID:");
                var id = input.nextInt();
                Remover(id);
            }
            if (Menu == 4) {
                x = 2;
            }
        } while (x == 1);
    }
    
    public static void Cadastro() {

        System.out.print("Entre com o Nome: ");
        var Nome = input.next();

        var a = new Account();
        a.setName(Nome);
        a.setIdAccount(Conta + 1);

        ListadeContas.add(a);

    }
    
    public static Account Procura(int id) {
        var procura = ListadeContas.get(id);
        System.out.println(procura.getName());
        return procura;
    }
    
    public static void Remover(int id) {
        ListadeContas.remove(id);
    }
    
   
}
