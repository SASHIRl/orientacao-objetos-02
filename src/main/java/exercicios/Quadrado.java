package exercicios;

public class Quadrado {
    private Double lado;

    public Quadrado (Double lado) {
        this.lado = lado;
    }
    public void setLado (Double lado) {
        this.lado = lado;
    }
    public Double getCalcularArea() {
        return lado * lado;
    }
    public Double getCalcularPerimetro() {
        return 4 * lado;
    }
    public Double getLado() {
        return lado;
    }
}