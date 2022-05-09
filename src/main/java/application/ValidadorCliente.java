package application;

import model.Cliente;

public class ValidadorCliente {

    private ValidadorCliente() {

    }

    public static boolean verificarClienteRegular(String input) {

        return input.contains(Cliente.REGULAR.getDescricao());
    }

}
