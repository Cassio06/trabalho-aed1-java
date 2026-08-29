package fila;

import java.util.Scanner;

public class Clinica {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Paciente[] pacientes = new Paciente[15];

        System.out.println("Escreva o nome do paciente horario de atendimento e tipo de atendimento(Estilo: Julia(09:10-Exame)");

        for (int i = 0; i < pacientes.length; i++) {
            System.out.println("Paciente " + (i + 1) + " de " + pacientes.length);

            System.out.print("Nome: ");
            String nome = input.nextLine();

            System.out.print("Horário de chegada: ");
            String horarioChegada = input.nextLine();

            System.out.print("Tipo de atendimento: ");
            String tipoAtendimento = input.nextLine();

            pacientes[i] = new Paciente(nome, horarioChegada, tipoAtendimento);
        }

        Fila<Paciente> filaAtendimento = new Fila<>();

        try {
            for (Paciente paciente : pacientes) {
                filaAtendimento.enqueue(paciente);
            }

            System.out.println("\nOrdem de atendimento:");
            while (!filaAtendimento.isEmpty()) {
                System.out.println(filaAtendimento.dequeue());
            }
        } catch (UnsupportedOperationException excecao) {
            System.out.println(excecao.getMessage());
        }

        input.close();
    }
}
