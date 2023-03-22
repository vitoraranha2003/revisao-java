package Ex1;

public class Main {
    public static void main(String[] args) {
        Pessoa Vitor = new Pessoa(3,2,15);
        Integer tempo_vida = Vitor.idade_anos*365+ Vitor.idade_meses*30+ Vitor.idade_dias;
        System.out.printf("Tempo vivido em dias (no total): %d",tempo_vida);
    }

}
