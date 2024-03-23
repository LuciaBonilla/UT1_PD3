public final class MainMaquinaA {
    /**
     * Prueba básica de la clase {@link Perro}
     * @param args
     */
    public static void main(String[] args) {
        Perro perro = new Perro("Hercules");
        System.out.println("El perro se llama Hercules " + perro.respondeA("Hercules"));
        perro.ladrar();
        System.out.println("El perro se llama " + perro.getNombre());
    }
}