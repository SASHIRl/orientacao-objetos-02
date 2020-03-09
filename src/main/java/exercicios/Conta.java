package exercicios;

public class Conta {
    private Integer numero = 01;
    private Double saldo = 00.00;
    private Double limite = 00.0;

    public Double getSaldo() {
        return saldo;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public Double getLimite() {
        return limite;
    }
    public void depositar(Double valor) {
        if (valor <= 0) {
            System.out.println("Não é possível depositar o valor");
        } else saldo = saldo + valor;
    }

    public void sacar(Double valor) {
        if (valor > limite) {
            System.out.println("Limite atingido, não é possível sacar");
        } else saldo = saldo - valor;
    }

    public void transferir(Conta conta, Double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
        } else if (valor > limite) {
            System.out.println("Limite atingido!");
        } else {
            saldo = saldo - valor;
            conta.saldo = conta.saldo + valor;
        }
    }
}
