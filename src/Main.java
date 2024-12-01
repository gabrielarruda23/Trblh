// Classe Node
class Node {
    int data;      // Valor armazenado no nó
    Node next;     // Ponteiro para o próximo nó

    // Construtor para inicializar o nó com um valor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Classe LinkedList
class LinkedList1 {
    Node head;   // Cabeça da lista

    // Construtor para inicializar a lista
    public LinkedList1() {
        head = null;
    }

    // Método para adicionar um novo nó ao final da lista
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;  // Se a lista estiver vazia, o novo nó será o primeiro
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;  // Percorre até o último nó
        }
        lastNode.next = newNode;  // Conecta o novo nó ao final
    }

    // Método para imprimir todos os elementos da lista
    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
}

// Testando o algoritmo
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(10);
        list.append(20);
        list.append(30);
        list.printList();  // Imprime: 10 -> 20 -> 30 -> null
    }
}
