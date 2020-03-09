package exercicios;

public class Circulo {
    private Double raio;

    public Circulo (Double raio) {
        this.raio = raio;
    }
    public void setRaio (Double raio) {
        this.raio = raio;
    }
    public Double CalcularArea() {
        return 3.14 * raio * raio;
    }
    public Double CalcularPerimetro() {
        return raio * (2 * 3.14);
    }
    public Double getRaio() {
        return raio;
    }
}