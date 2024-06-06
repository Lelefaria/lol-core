package core;

import java.util.ArrayList;

public class Store {
    private String nome;
    private ArrayList<Item> itens;

    //construtor
    public Store(String nome) {
        this.nome = nome;
        this.itens = new ArrayList<>();
    }

    //metodo
    public void adicionarItem(Item item) {
        itens.add(item);
    }

    //metodo
    public void listarItens() {
        System.out.println("Itens na loja ");
        for (Item item : itens) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Store minhaLoja = new Store("Loja de Itens do LoL");
        Item item1 = new Item("Espada Longa", 350.0);
        Item item2 = new Item("Poção de Vida", 50.0);

        minhaLoja.adicionarItem(item1);
        minhaLoja.adicionarItem(item2);

        minhaLoja.listarItens();
    }
}