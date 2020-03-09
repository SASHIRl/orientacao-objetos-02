package exercicios;

public class Retangulo {
    public Double base;
    public Double altura;

    public Retangulo (Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }
    public void setBase ( Double base) {
        this.base = base;
    }
    public void setAltura ( Double altura) {
        this.altura = altura;
    }
    public Double getCalcularArea() {
        return base * altura;
    }
    public Double getCalcularPerimetro() { return 2 * (base + altura); }
    public Double getBase() {
        return base;
    }
    public Double getAltura() {
        return altura;
    }
}