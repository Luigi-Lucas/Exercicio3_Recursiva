package View;

import Controller.OperacoesController;

public class Principal {

    public static void main(String[] args) {

        OperacoesController Op = new OperacoesController();

        int A = 2478;

        System.out.println(Op.digitos(A));
    }
}
