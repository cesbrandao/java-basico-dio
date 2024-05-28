package edu.carlosbrandao.exception.criarexception;

public class FormatarCep {
    public static void main(String[] args) {
        
        /*
        * exemplo apenas para ilustrar a criação de uma Exception,
        * o método de estruturar cep não está implementado.
        */
        try {
            String cepFormatado = estruturarCep("23765064");

            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            System.out.println("Formato de cep inválido.");
            //e.printStackTrace();
        }
    }

    static String estruturarCep (String cep) throws CepInvalidoException {
        
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }
        
        return "23.765-064";
    }
}
