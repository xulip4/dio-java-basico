package edu.raphael.semana1;
public class MinhaClasse {
    
    public static void main (String [] args) {

        String primeiroNome = "Raphael", segundoNome = "Gidrão";

        String nomeCompleto = informaNomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String informaNomeCompleto (String primeiroNome, String segundoNome) {

            return "Seu nome completo é " + primeiroNome.concat(" ").concat(segundoNome).concat(".");
    }
}
