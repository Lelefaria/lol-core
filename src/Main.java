import core.Champion;
import core.Inventory;
import core.Item;
import core.Store;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        var arrayIntory = new ArrayList<Inventory>();
        var arrayStore = new ArrayList<Store>();
        var arrayChampiorn = new ArrayList<Champion>();
        var arrayItem = new ArrayList<Item>();
        var opcaoMenu = 0;

        Scanner scanner = new Scanner(System.in);

        while (opcaoMenu != 1) {

            System.out.println(
                    "╔════════════════════════════════════════╗\n"
                            + "║      Bem-vindo a League of Legends     ║\n"
                            + "╚════════════════════════════════════════╝\n"
                            + "┌────────────────────────────────────────┐\n"
                            + "│            1. Normal Game              │\n"
                            + "└────────────────────────────────────────┘\n"
                            + "Escolha uma opção :");
            opcaoMenu = Integer.parseInt(scanner.nextLine());

        }


        if (opcaoMenu == 1) {
            System.out.println(
                    "╔════════════════════════════════════════╗\n"
                            + "║         Selecione seu Campeão          ║\n"
                            + "╚════════════════════════════════════════╝\n"
                            + "┌────────────────────────────────────────┐\n"
                            + "│  1. Ahri                               │\n"
                            + "│  2. Akali                              │\n"
                            + "│  3. Ashe                               │\n"
                            + "│  4. Darius                             │\n"
                            + "│  5. Ezreal                             │\n"
                            + "│  6. Garen                              │\n"
                            + "│  7. Jinx                               │\n"
                            + "│  8. Lux                                │\n"
                            + "│  9. Morgana                            │\n"
                            + "│ 10. Yasuo                              │\n"
                            + "└────────────────────────────────────────┘\n"
            );


            int opcaoChampions = Integer.parseInt(scanner.nextLine());

            if (opcaoChampions == 1) {
                System.out.println("Campeao selcionado Ahri: ");
                System.out.println(
                        "╔════════════════════════════════════════╗\n"
                                + "║           Atributos de Ahri            ║\n"
                                + "╚════════════════════════════════════════╝\n"
                                + "┌────────────────────────────────────────┐\n"
                                + "│  Dano Mágico Inicial: 53               │\n"
                                + "│  Armadura: 21                          │\n"
                                + "│  Vida: 526                             │\n"
                                + "│  Velocidade de Movimento: 330          │\n"
                                + "│  Resistência Mágica: 30                │\n"
                                + "└────────────────────────────────────────┘");


            } else if (opcaoChampions == 2) {
                System.out.println("Campeao selecionado Akali: ");
                System.out.println(
                        "╔════════════════════════════════════════╗\n"
                                + "║            Atributos de Akali          ║\n"
                                + "╚════════════════════════════════════════╝\n"
                                + "┌────────────────────────────────────────┐\n"
                                + "│  Dano Mágico Inicial: 58               │\n"
                                + "│  Armadura: 23                          │\n"
                                + "│  Vida: 575                             │\n"
                                + "│  Velocidade de Movimento: 345          │\n"
                                + "│  Resistência Mágica: 32                │\n"
                                + "└────────────────────────────────────────┘");
            } else if (opcaoChampions == 3) {
                System.out.println("Campeao selecionado Akali: ");
                System.out.println(
                        "╔════════════════════════════════════════╗\n"
                                + "║            Atributos de Ashe           ║\n"
                                + "╚════════════════════════════════════════╝\n"
                                + "┌────────────────────────────────────────┐\n"
                                + "│  Dano de Ataque Inicial: 61            │\n"
                                + "│  Armadura: 26                          │\n"
                                + "│  Vida: 570                             │\n"
                                + "│  Velocidade de Movimento: 325          │\n"
                                + "│  Resistência Mágica: 30                │\n"
                                + "└────────────────────────────────────────┘");
            } else if (opcaoChampions == 4) {
                System.out.println("Campeao selecionado Darius:");
                System.out.println(
                        "╔════════════════════════════════════════╗\n"
                                + "║            Atributos de Darius         ║\n"
                                + "╚════════════════════════════════════════╝\n"
                                + "┌────────────────────────────────────────┐\n"
                                + "│  Dano de Ataque Inicial: 64            │\n"
                                + "│  Armadura: 39                          │\n"
                                + "│  Vida: 582                             │\n"
                                + "│  Velocidade de Movimento: 340          │\n"
                                + "│  Resistência Mágica: 32                │\n"
                                + "└────────────────────────────────────────┘");
            } else if (opcaoChampions == 5) {
                System.out.println("Campeao selecionado Ezreal:");
                System.out.println(
                        "╔════════════════════════════════════════╗\n"
                                + "║            Atributos de Ezreal         ║\n"
                                + "╚════════════════════════════════════════╝\n"
                                + "┌────────────────────────────────────────┐\n"
                                + "│  Dano de Ataque Inicial: 60            │\n"
                                + "│  Armadura: 22                          │\n"
                                + "│  Vida: 530                             │\n"
                                + "│  Velocidade de Movimento: 325          │\n"
                                + "│  Resistência Mágica: 30                │\n"
                                + "└────────────────────────────────────────┘");
            } else if (opcaoChampions == 6) {
                System.out.println("Campeao selecionado Garen:");
                System.out.println(
                        "╔════════════════════════════════════════╗\n"
                                + "║            Atributos de Garen          ║\n"
                                + "╚════════════════════════════════════════╝\n"
                                + "┌────────────────────────────────────────┐\n"
                                + "│  Dano de Ataque Inicial: 57            │\n"
                                + "│  Armadura: 36                          │\n"
                                + "│  Vida: 620                             │\n"
                                + "│  Velocidade de Movimento: 340          │\n"
                                + "│  Resistência Mágica: 32                │\n"
                                + "└────────────────────────────────────────┘");
            } else if (opcaoChampions == 7) {
                System.out.println("Campeao selecionado Jinx:");
                System.out.println(
                        "╔════════════════════════════════════════╗\n"
                                + "║            Atributos de Jinx           ║\n"
                                + "╚════════════════════════════════════════╝\n"
                                + "┌────────────────────────────────────────┐\n"
                                + "│  Dano de Ataque Inicial: 57            │\n"
                                + "│  Armadura: 22                          │\n"
                                + "│  Vida: 610                             │\n"
                                + "│  Velocidade de Movimento: 325          │\n"
                                + "│  Resistência Mágica: 30                │\n"
                                + "└────────────────────────────────────────┘");
            } else if (opcaoChampions == 8) {
                System.out.println("Campeao selecionado Lux:");
                System.out.println(
                        "╔════════════════════════════════════════╗\n"
                                + "║            Atributos de Lux            ║\n"
                                + "╚════════════════════════════════════════╝\n"
                                + "┌────────────────────────────────────────┐\n"
                                + "│  Poder de Habilidade Inicial: 54       │\n"
                                + "│  Armadura: 18                          │\n"
                                + "│  Vida: 490                             │\n"
                                + "│  Velocidade de Movimento: 330          │\n"
                                + "│  Resistência Mágica: 30                │\n"
                                + "└────────────────────────────────────────┘");
            } else if (opcaoChampions == 9) {
                System.out.println("Campeao selecionado Morgana:");
                System.out.println(
                        "╔════════════════════════════════════════╗\n"
                                + "║            Atributos de Morgana        ║\n"
                                + "╚════════════════════════════════════════╝\n"
                                + "┌────────────────────────────────────────┐\n"
                                + "│  Poder de Habilidade Inicial: 55       │\n"
                                + "│  Armadura: 25                          │\n"
                                + "│  Vida: 560                             │\n"
                                + "│  Velocidade de Movimento: 335          │\n"
                                + "│  Resistência Mágica: 30                │\n"
                                + "└────────────────────────────────────────┘");
            } else if (opcaoChampions == 10) {
                System.out.println("Campeao selecionado Yasuo:");
                System.out.println(
                        "╔════════════════════════════════════════╗\n"
                                + "║            Atributos de Yasuo          ║\n"
                                + "╚════════════════════════════════════════╝\n"
                                + "┌────────────────────────────────────────┐\n"
                                + "│  Dano de Ataque Inicial: 60            │\n"
                                + "│  Armadura: 30                          │\n"
                                + "│  Vida: 490                             │\n"
                                + "│  Velocidade de Movimento: 345          │\n"
                                + "│  Resistência Mágica: 30                │\n"
                                + "└────────────────────────────────────────┘");
            } else {
                System.out.println("Opcao Informada Inexistente");
            }


        }
        System.out.println("╠════════════════════════════════════════╣\n"
                + "║ 1. Iniciar Partida                     ║\n"
                + "║ 2. Deixar Partida                      ║\n"
                + "╚════════════════════════════════════════╝\n");
        int iniciarOuDeixar = Integer.parseInt(scanner.nextLine());

        if (iniciarOuDeixar == 1) {
            System.out.println("PARTIDA INICIADA");
        }
    }
}
