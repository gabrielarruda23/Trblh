import java.util.Scanner;

class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void delete(int value) {
        if (head == null) {
            System.out.println("A lista está vazia.");
            return;
        }

        // Se o nó a ser excluído é o primeiro nó
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node currentNode = head;
        Node prevNode = null;

        // Percorrer a lista para encontrar o nó a ser excluído
        while (currentNode != null && currentNode.data != value) {
            prevNode = currentNode;
            currentNode = currentNode.next;
        }

        // Se o nó não for encontrado
        if (currentNode == null) {
            System.out.println("Elemento não encontrado.");
            return;
        }

        // Desconectar o nó da lista
        prevNode.next = currentNode.next;
    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
}

public class Excluir {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        // Inserir elementos na lista
        while (true) {
            System.out.print("Digite um número para adicionar à lista (ou '0' para parar): ");
            int element = scanner.nextInt();

            if (element == 0) {
                break;
            }

            list.append(element);
            list.printList();
        }

        // Excluir elementos da lista
        while (true) {
            System.out.print("Digite um número para excluir da lista (ou '0' para parar): ");
            int valueToDelete = scanner.nextInt();

            if (valueToDelete == 0) {
                break;
            }

            list.delete(valueToDelete);
            list.printList();
        }

        scanner.close();
    }
}
