package Ex6;

public class Main {
    public static void main(String[] args) {
        Num valor = new Num(39);
        System.out.printf("Numero: %d",valor.numero);
        System.out.println();
        System.out.printf("Antecessor: %d",valor.numero-1);
        System.out.println();
        System.out.printf("Sucessor: %d",valor.numero+1);
    }
}
