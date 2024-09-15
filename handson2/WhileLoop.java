package handson2;

public class WhileLoop {
    public class void main (String[] args) {
        int i = 1;
        System.out.println("Bilangan genap dari 1 sampai 20 : ");
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }
}
