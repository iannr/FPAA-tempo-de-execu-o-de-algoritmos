package FPAA;

import java.util.ArrayList;
import java.util.Random;

public class TesteArrayList {
    public static void main(String[] args) {
        int P = 2500000; //  5000000 e 10000000 
        int N = 20000; // 40000
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Random rand = new Random();
        
        long startTime = System.nanoTime();
        for (int i = 1; i <= P; i++) {
            pessoas.add(new Pessoa(i));
        }
        long endTime = System.nanoTime();
        System.out.println("Tempo de inserção (ArrayList): " + (endTime - startTime) / 1e9 + " segundos");
        
        startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            Pessoa p = pessoas.get(rand.nextInt(P));
        }
        endTime = System.nanoTime();
        System.out.println("Tempo de busca (ArrayList): " + (endTime - startTime) / 1e9 + " segundos");
    }
}