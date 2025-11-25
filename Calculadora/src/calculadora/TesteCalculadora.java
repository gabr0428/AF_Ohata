package calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        /**
        *  Chama a função calcular, e insere as variaveis a , b , operador.
        * isso dentro de um SOUT para já exibir o resultado no console
        * 
        */

        System.out.println(calc.calcular( 2, 3, "+"));
        System.out.println(calc.calcular( 10, 4, "-"));
        System.out.println(calc.calcular( 3, 5, "*"));
        System.out.println(calc.calcular( 8, 2, "/"));
        
         /**
        *  Tratamento de exceções (try/catch)
        * Aqui tentamos executar operações que podem gerar erro,
        * como dividir por zero ou usar um operador inválido.
        * Quando o erro é detectado dentro do método calcular,
        * é lançada uma IllegalArgumentException.
        * O bloco catch captura o erro e exibe a mensagem da exceção.
        */

        try {
            System.out.println(calc.calcular(8, 0, "/")); // Tentativa de divisão por zero → gera exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());// Exibe mensagem da exceção
        }
        try {
            System.out.println(calc.calcular( 5, 5, "x"));  // Operador inválido → gera exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());// Exibe mensagem da exceção
        }
    }
}

