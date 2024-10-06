package utp.edu.pe;

import java.util.*;

public class Plantilla {
    boolean salir = false;
    Scanner sc = new Scanner(System.in);
    List <Producto> carrito = new LinkedList<>();
    public void mostrarMenu(List<Producto> productos) {
        while (!salir) {
            try {
                String menu = """
                    \n===== EL MERCADITO =====
                    1. LISTAR PRODUCTOS
                    2. COMPRAR
                    3. IMPRIMIR PDF
                    4. SALIR
                    ========================
                    Elija una opción: \t""";
                System.out.print(menu);

                int valor = sc.nextInt();
                sc.nextLine();

                switch (valor) {
                    case 1:
                        listar(productos);
                        break;
                    case 2:
                        buscar(productos);
                        break;
                    case 3:
                        System.out.println("SIN FUNCIONALIDAD");
                        break;
                    case 4:
                        salir = true;
                        System.out.println("Saliendo...........");
                        break;
                    default:
                        System.out.println("OPCION NO VALIDA!!!!");
                }
            } catch (InputMismatchException e) {
                System.out.println("OCURRIO UN ERROR: " + e.getMessage());
                sc.nextLine();
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
        boolean comprando = true;
        while (comprando){
            System.out.print("INGRESE EL CODIGO DEL PRODUCTO (X PARA SALIR): ");
            String codigo = sc.next();
            if (codigo.equals("X")){
                comprando = false;
            }else{
                boolean productoEncontrado = false;
                Iterator<Producto> it = productos.iterator();
                sc.nextLine();
                while(it.hasNext()){
                    Producto p = it.next();
                    if (p.getCodigo().equals(codigo)){
                        carrito.add(p);
                        productoEncontrado = true;
                        break;
                    }
                }
                if (productoEncontrado){
                    System.out.println("SE AÑADIDO CORRECTAMENTE");
                }else{
                    System.out.println("NO SE ENCONTRADO");
                }
            }
        }
        System.out.println("LISTA DE COMPRAS:");
        listar(carrito);
    }
}

