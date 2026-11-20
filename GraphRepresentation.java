/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphmap;

/**
 *
 * @author MAHESWARI KANNAN
 */
import java.util.*;
public class GraphRepresentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int e = sc.nextInt();

        int[][] matrix = new int[v][v];

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            matrix[a][b] = 1;
            matrix[b][a] = 1;

            list.get(a).add(b);
            list.get(b).add(a);
        }

        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Adjacency List:");
        for (int i = 0; i < v; i++) {
            System.out.print(i + " -> ");
            for (int node : list.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
}

    

