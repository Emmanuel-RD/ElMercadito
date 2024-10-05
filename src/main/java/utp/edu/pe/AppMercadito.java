package utp.edu.pe;
import java.util.LinkedList;
import java.util.List;

public class AppMercadito {
    public static void main(String[] args) {
        Plantilla plantilla = new Plantilla();
        List <Producto> productos = new LinkedList<>();
        productos.add(new Producto("P001", "ESPAGUETI", "PASTA LARGA DE CALIDAD", 15, Categoria.PASTAS));
        productos.add(new Producto("P002", "MACARRONES", "PASTA EN FORMA DE TUBO", 12, Categoria.PASTAS));
        productos.add(new Producto("P003", "TORTELLINI", "PASTA RELLENA", 25, Categoria.PASTAS));
        productos.add(new Producto("G001", "GALLETAS DE CHOCOLATE", "DELICIOSAS GALLETAS", 10, Categoria.GALLETAS));
        productos.add(new Producto("G002", "GALLETAS DE AVENA", "SALUDABLES Y NUTRITIVAS", 8, Categoria.GALLETAS));
        productos.add(new Producto("G003", "GALLETAS SALADAS", "PERFECTAS PARA PICAR", 7, Categoria.GALLETAS));
        productos.add(new Producto("C001", "CORN FLAKES", "CEREAL CRUJIENTE DE MAÍZ", 12, Categoria.CEREALES));
        productos.add(new Producto("C002", "AVENA INSTANTÁNEA", "RÁPIDO Y NUTRITIVO", 10, Categoria.CEREALES));
        productos.add(new Producto("C003", "MUESLI", "MEZCLA DE CEREALES Y FRUTAS", 15, Categoria.CEREALES));
        productos.add(new Producto("L001", "LECHE ENTERA", "LA MEJOR LECHE", 22, Categoria.LACTEOS));
        productos.add(new Producto("L002", "YOGUR NATURAL", "YOGUR CREMOSO Y DELICIOSO", 18, Categoria.LACTEOS));
        productos.add(new Producto("L003", "QUESO FRESCO", "QUESO SUAVE Y FRESCO", 30, Categoria.LACTEOS));
        productos.add(new Producto("M001", "POLLO FRESCO", "CARNE DE POLLO DE CALIDAD", 20, Categoria.CARNES));
        productos.add(new Producto("M002", "CARNE DE RES", "CARNE DE RES DE PRIMERA", 35, Categoria.CARNES));
        productos.add(new Producto("M003", "CERDO", "CARNE DE CERDO FRESCA", 28, Categoria.CARNES));
        productos.add(new Producto("M004", "PESCADO FRESCO", "PESCADO DEL DÍA", 25, Categoria.CARNES));
        productos.add(new Producto("G004", "GALLETAS DE VAINILLA", "GALLETAS SUAVES Y DELICIOSAS", 9, Categoria.GALLETAS));
        productos.add(new Producto("C004", "CEREAL INTEGRAL", "CEREAL SALUDABLE Y NUTRITIVO", 14, Categoria.CEREALES));
        productos.add(new Producto("L004", "LECHE DESCREMADA", "LECHE BAJA EN GRASA", 20, Categoria.LACTEOS));
        productos.add(new Producto("P004", "FIDEOS", "FIDEOS FINOS PARA SOPAS", 13, Categoria.PASTAS));
        productos.add(new Producto("M005", "SALCHICHAS", "SALCHICHAS DE POLLO", 15, Categoria.CARNES));
        plantilla.mostrarMenu(productos);
    }
}
