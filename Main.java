import javax.xml.transform.Source;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void questao01(){
        try{
            System.out.println(" ========= DIVISÃO POR ZERO =========");
            Integer num1, num2;
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um valor: ");
            num1 = sc.nextInt();

            System.out.println("Digite outro valor: ");
            num2 = sc.nextInt();

            Integer divisao = num1/num2;
            System.out.println("A divisao de " + num1 + " com " + num2 + " é: " + divisao);
        } catch (ArithmeticException e) {
            System.out.println("ERRO!! Não é possivel fazer divisão por zero!");
        }
    }

    public static void questao02(){
        try{
            System.out.println(" ========= CONVERSÃO DE STRING POR NUMEROS =========");
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um valor numerico: ");
            Integer valor = sc.nextInt();
            System.out.println("O valor digitado foi: " + valor);
        }catch (InputMismatchException e){
            System.out.println("ERRO!! Valor não numerico");
        }catch (NumberFormatException e){
            System.out.println("ERRO!! Valor inválido (Nao numérico)");
        }
    }

    public static void questao03(){
        try{
            System.out.println(" ========= RAIZ QUADRADA DE UM NÚMERO =========");
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite um valor para calcular a raiza: ");
            Integer valor = sc.nextInt();

            if (valor < 0) throw new IllegalAccessException();
            Integer raiz = (int) Math.sqrt(valor);
            System.out.println("A raiz de " + valor + " é: " + raiz);
        }catch (IllegalAccessException e){
            System.out.println("ERRO! Valor negativo");
        }
    }

    public static void questao04(){
        try{
            System.out.println(" ========= SOMA DE DOIS NÚMEROS =========");
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o primeiro valor: ");
            Integer num1 = sc.nextInt();
            System.out.print("Digite o segundo valor: ");
            Integer num2 = sc.nextInt();
            Integer soma = num1 + num1;
            System.out.println("A soma dos valores é: " + soma);

        }catch (InputMismatchException e){
            System.out.println("ERRO! Valor inválido (Não numérico)");
        }
    }

    public static void questao05(){
        try{
            System.out.println(" ========= ACESSO A ÍNDICE INVÁLIDO EM UM ARRAY =========");
            Scanner sc = new Scanner(System.in);
            Integer arrayFixo[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            System.out.print("Digite uma posição: ");
            Integer posicao = sc.nextInt();

            System.out.println("O numero da posição " + posicao + " é: " + arrayFixo[posicao]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ERRO! Posição inválida");
        }
    }

    //Exception da questao 6
    static public class DadosInvalidosException extends Exception{
        public DadosInvalidosException(){}
    }

    public static void questao06(){
        try {
            System.out.println(" ========= CADASTRO DE USUÁRIO COM VALIDAÇÃO =========");
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite seu nome: ");
            String nome = sc.nextLine();
            System.out.println("Digite sua idade: ");
            Integer idade = sc.nextInt();
            if (idade < 0 || nome.isEmpty()){
                throw new DadosInvalidosException();
            }

        } catch (DadosInvalidosException e) {
            System.out.println("Erro!! Idade ou nome inválido");
        }
    }

    public static void questao07(){
        try{
            System.out.println(" ========= CALCULADORA DE MÉDIA E NOTAS =========");
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o primeiro numero: ");
            Integer num1 = sc.nextInt();
            System.out.println("Digite o segundo numero: ");
            Integer num2 = sc.nextInt();
            System.out.println("Digite o terceiro numero: ");
            Integer num3 = sc.nextInt();

            Double media = (double)(num1+num2+num3)/3;
            System.out.println("A media dos valores digitados: " + media);

        } catch (InputMismatchException e) {
            System.out.println("Valor inválido!! (valor não numerico)");
        }
    }

    //exception da 8
    static public class IdadeInvalidaException extends Exception{
        public IdadeInvalidaException(){}
    }
    public static void questao08() {
        try {
            System.out.println(" ========= VERIFICAÇÃO DE IDADE PARA MAIORIDADE =========");
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite sua idade: ");
            Integer idade = sc.nextInt();
            if (idade < 0){
                throw new IdadeInvalidaException();
            }

            if(idade >= 18){
                System.out.println("Voce é maior de idade");
            }else {
                System.out.println("Voce não é maior de idade");
            }

        } catch (IdadeInvalidaException e) {
            System.out.println("A idade informada é inválida");
        }
    }

    //exception da questao 9
    static public class TemperaturaInvalidaException extends Exception{
        public TemperaturaInvalidaException(){}
    }
    public static void questao09() {
        try {
            System.out.println(" ========= CONVERSÃO DE TEMPERATURA COM VERIFICAÇÃO DE INTERVALO =========");
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite a temperatura(Em celsius): ");
            Double celsius = sc.nextDouble();

            if (celsius < -273.15){
                throw new TemperaturaInvalidaException();
            }else{
                Double Fahrenheit = (celsius*9/5)+32;
                System.out.println("A temperatura em Fahrenheit é: " + Fahrenheit);
            }
        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO! Valor inválido! (Zero absoluto)");
        }catch (InputMismatchException e){
            System.out.println("ERRO! Digite um valor numérico");
        }
    }

    public static int Calculafatorial(int num){
            if (num==0) return 1;
            return num*Calculafatorial(num-1);
        }

    //exception da questao 10
    static public class NumeroNegativoException extends Exception{
        public NumeroNegativoException(){}
    }
    //exception da questao 10
    static public class LimiteFatorialExcedidoException extends Exception{
        public LimiteFatorialExcedidoException(){}
    }

    public static void questao10() {
        try {
            System.out.println(" ========= CALCULADORA DE FATORIAL COM EXCEÇÃO PARA LIMITE DE RECURSÃO =========");
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um valor para calculo do fatorial: ");
            Integer valor = sc.nextInt();
            if (valor == 0){
                throw new NumeroNegativoException();
            }else if (valor > 20){
                throw new LimiteFatorialExcedidoException();
            } else{
                Integer fatorial = Calculafatorial(valor);
                System.out.println("O fatorial de "+valor+ " e: " + fatorial);
            }
        }catch (NumeroNegativoException e){
            System.out.println("ERRO! Foi digitado um valor negativo ou muito grande");
        }catch (LimiteFatorialExcedidoException e){
            System.out.println("ERRO! O valor digitedo é muito grande");
        }
    }

    public static void main(String[] args) {
        int sair = 1;
        Scanner sc = new Scanner(System.in);
        while (sair == 1) {
            System.out.println("\n\n----- LISTA TRY CATCH ----- \nEscolha um dos exercicios abaixo \n1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10" + "\nDigite 0 (zero) para sair! :\n");
            int escolha = sc.nextInt();
            switch (escolha){
                case 0:
                    System.out.println("Saindo...");
                    sair = 0;
                    break;
                case 1: questao01();
                    break;
                case 2:  questao02();
                    break;
                case 3:  questao03();
                    break;
                case 4:  questao04();
                    break;
                case 5:  questao05();
                    break;
                case 6: questao06();
                    break;
                case 7: questao07();
                    break;
                case 8: questao08();
                    break;
                case 9: questao09();
                    break;
                case 10: questao10();
                    break;
                default:
                    System.out.println("Opção inválida!!");
                    break;
            }
        }
    }

}