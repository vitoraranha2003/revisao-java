package Ex5;

public class Main {
    public static void main(String[] args) {
        Pessoa samuel = new Pessoa(1320,3960);
        Integer quantidade = samuel.salario_usuario/samuel.salario_min;
        System.out.printf("A quantidade de salarios minimos que essa pessoa ganha e: %d",quantidade);
    }
}
