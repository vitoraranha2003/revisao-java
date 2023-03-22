package Ex2;

public class Media {
    public static void main(String[] args) {
        Double media1 = (8+9+7)/3.0;
        Double media2 = (4+5+6)/3.0;
        Double soma_medias = media1+media2;
        Double media_das_medias = soma_medias/2;

        System.out.printf("A media dos numeros 8, 9 e 7 e: %.2f",media1);
        System.out.println();
        System.out.printf("A media dos numeros 4, 5 e 6 e: %.2f",media2);
        System.out.println();
        System.out.printf("A soma das duas medias anteriores e: %.2f",soma_medias);
        System.out.println();
        System.out.printf("A media das medias e: %.2f",media_das_medias);

    }
}
