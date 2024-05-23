package LIST.somanumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numbers;

    public SomaNumeros(){
        this.numbers = new ArrayList<>();
    }
    public void  adicionarNumero(int numero){
        numbers.add(numero);
    }

    public int caucularSoma(){
        int soma = 0;
        for(int n : numbers){
            soma += n;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maxNumber = Collections.max(numbers);
        return maxNumber;
    }

    public int encontrarMenorNumero(){
        int minNumber = Collections.min(numbers);
        return minNumber;
    }
    public void exibirNumeros(){
        System.out.println(numbers);
    }


    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(40);
        somaNumeros.adicionarNumero(25);
        somaNumeros.adicionarNumero(15);

        int soma = somaNumeros.caucularSoma();



        int maxNumber = somaNumeros.encontrarMaiorNumero();

        int minNumber = somaNumeros.encontrarMenorNumero();

        System.out.println(maxNumber);

        System.out.println(minNumber);
    }


}


