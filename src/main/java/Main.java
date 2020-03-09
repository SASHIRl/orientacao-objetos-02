import exercicios.Circulo;
import exercicios.Quadrado;
import exercicios.Retangulo;
import exercicios.Correntista;

public class Main {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(10.0);
        q1.setLado(10.0);

        System.out.println(q1.getCalcularArea());
        System.out.println(q1.getCalcularPerimetro());
        System.out.println(" ");

        Circulo c1 = new Circulo(6.00);
        c1.setRaio(6.0);

        System.out.println(c1.CalcularArea());
        System.out.println(c1.CalcularPerimetro());
        System.out.println(" ");

        Retangulo r1 = new Retangulo(10.0, 20.0);
        r1.setBase(10.0);
        r1.setAltura(20.0);

        System.out.println(r1.getCalcularArea());
        System.out.println(r1.getCalcularPerimetro());
        System.out.println(" ");

        Correntista co1 = new Correntista("SP3032175", "Diego Marques da Costa", "die@gmail.com", 40028922);
        System.out.println(co1.getCodigo());
        System.out.println(co1.getNome());
        System.out.println(co1.getEmail());
        System.out.println(co1.getTelefone());
    }
}