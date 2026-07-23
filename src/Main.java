package Tarea02.src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CuentaBancaria cuenta1 = new CuentaBancaria("Josue Garcia", "001-A", 500.0);

        System.out.print("¿Cuánto desea depositar a Josue? Q");
        double deposito = sc.nextDouble();

        cuenta1.depositar(deposito);

        System.out.print("¿Cuánto desea retirar de Josue? Q");
        double retiro = sc.nextDouble();

        if (cuenta1.retirar(retiro)) {
            System.out.println("Retiro exitoso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }

        System.out.println("Titular: " + cuenta1.getTitular());
        System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
        System.out.println("Saldo final: Q" + cuenta1.consultarSaldo());

        sc.close();
    }
}
