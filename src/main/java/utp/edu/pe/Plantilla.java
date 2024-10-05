package utp.edu.pe;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Plantilla {
    boolean salir = false;
    Scanner sc = new Scanner(System.in);
    public void mostrarMenu(List<Producto> lp) {
        while (!salir) {
            String menu = """
                    ===== EL MERCADITO =====
                    1. LISTAR PRODUCTOS
                    2. COMPAR
                    3. IMPRIMIR PDF
                    4. SALIR
                    ========================
                    Elija una opción:\t""";
            System.out.println(menu);
            int valor = sc.nextInt();
            switch (valor) {
                case 1:
                    System.out.printf("%-10s | %-25s | %-35s | %-7s | %-10s%n",
                            "Código", "Nombre", "Descripción", "Precio", "Categoría");
                    System.out.println("-------------------------------------------------------------------------------------------------------");
                    lp.forEach(System.out::println);
                    System.out.print("\n");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    salir = true;
                    System.out.print("Saliendo...........");
            }
        }
    }
}
