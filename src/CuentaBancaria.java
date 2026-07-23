package Tarea02.src;

public class CuentaBancaria {
    private String titular;
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo = saldo + monto;
            System.out.println("Depósito de Q" + monto + " realizado con éxito en la cuenta de " + titular);
        } else {
            System.out.println("El monto a depositar debe ser mayor a 0.");
        }
    }

    public boolean retirar(double monto) {
        if (monto <= 0) {
            return false;
        }

        if (monto <= saldo) {
            saldo -= monto;
            return true;
        }

        return false;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void mostrarInfo() {
        System.out.println("Titular: " + titular + " | No. Cuenta: " + numeroCuenta + " | Saldo: Q" + saldo);
    }
}
