public final class MainMaquinaB {
    public static void main(String[] args) {
        Gato gato = new Gato("Michi");
        System.out.println("El gato se llama Hercules? " + gato.respondeA("Hercules"));
        gato.maullar();
        System.out.println("El gato se llama " + gato.getNombre());
    }
}