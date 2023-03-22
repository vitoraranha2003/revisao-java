package Ex4;

public class Loja {
    public static void main(String[] args) {
        Produto1 pneu = new Produto1(30,10.0,10);
        Produto2 mola = new Produto2(63,15.0,2);
        IPI valor_ipi = new IPI(18.0);

        Double total_produto1 = pneu.valor*pneu.quantidade;
        Double total_produto2 = mola.valor*mola.quantidade;
        Double estoque = total_produto1+total_produto2; //130

        Double valor_final = (valor_ipi.ipi/100+1)*estoque;
        System.out.printf("O valor final e: %.2f",valor_final);
    }
}
