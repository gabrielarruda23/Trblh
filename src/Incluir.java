import java.util.Scanner;
public class Incluir {
    public static void main(String[] args) {
            LinkedList list = new LinkedList();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Digite um número para adicionar à lista (ou '0' para parar): ");
                int element = scanner.nextInt();

                if (element == 0) {
                    break;
                }

                list.append(element);
                list.printList();
            }

            scanner.close();
        }
    }


