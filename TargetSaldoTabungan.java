/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class TargetSaldoTabungan {

    public static void main(String[] args) {
        double saldoAwal = 3500000; // Initial balance
        double bungaBulan = 0.08;   // Monthly interest rate (8%)
        double saldoTarget = 6000000; // Target balance

        int bulan = 0;
        double saldo = saldoAwal;

        // Loop until the target balance is reached
        while (saldo < saldoTarget) {
            bulan++;
            saldo += saldo * bungaBulan;  // Increase saldo by monthly interest
            System.out.printf("Saldo di bulan ke-%d Rp. %,.0f%n", bulan, saldo);
        }
    }
}

