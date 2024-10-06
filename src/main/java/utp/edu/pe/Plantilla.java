package utp.edu.pe;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Plantilla {
    boolean salir = false;
    Scanner sc = new Scanner(System.in);
    List <Producto> carrito = new LinkedList<>();
    public void mostrarMenu(List<Producto> productos) {
        while (!salir) {
            String menu = """
                    ===== EL MERCADITO =====
                    1. LISTAR PRODUCTOS
                    2. COMPAR
                    3. IMPRIMIR PDF
                    4. SALIR
                    ========================
                    Elija una opción: \t""";
            System.out.print(menu);
            int valor = sc.nextInt();
            switch (valor) {
                case 1:
                    listar(productos);
                    break;
                case 2:
                    buscar(productos);
                case 3:
                    break;
                case 4:
                    salir = true;
                    System.out.print("Saliendo...........");
            }
        }
    }

    public void listar (List<Producto> productos) {
        System.out.printf("%-10s | %-25s | %-35s | %-7s | %-10s%n",
                "Código", "Nombre", "Descripción", "Precio", "Categoría");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        productos.forEach(System.out::println);
        System.out.print("\n");
    }

    public void buscar (List<Producto> productos){
        listar(productos);
        System.out.print("INGRESE EL CODIGO DEL PRODUCTO: ");
        Iterator<Producto> it = productos.iterator();
        sc.nextLine();
        String codigo = sc.nextLine();
        while(it.hasNext()){
            Producto p = it.next();
            if (p.getCodigo().equals(codigo)){
                carrito.add(p);
            }
        }
        System.out.println("LISTA DE COMPRAS:");
        listar(carrito);
    }
}
