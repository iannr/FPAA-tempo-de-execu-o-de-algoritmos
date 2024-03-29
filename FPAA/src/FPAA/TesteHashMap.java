package FPAA;

import java.util.HashMap;
import java.util.Random;

public class TesteHashMap {
    public static void main(String[] args) {
        int P = 2500000; // 5000000 e 10000000 
        int N = 20000; // 40000
        HashMap<Integer, Pessoa> pessoas = new HashMap<>();
        Random rand = new Random();
        
        long startTime = System.nanoTime();
        for (int i = 1; i <= P; i++) {
            pessoas.put(i, new Pessoa(i));
        }
        long endTime = System.nanoTime();
        System.out.println("Tempo de inserção (HashMap): " + (endTime - startTime) / 1e9 + " segundos");
        
        startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            Pessoa p = pessoas.get(rand.nextInt(P) + 1);
        }
        endTime = System.nanoTime();
        System.out.println("Tempo de busca (HashMap): " + (endTime - startTime) / 1e9 + " segundos");
    }
}