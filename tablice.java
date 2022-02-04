public class tablice {
    public static void main(String[] args) {
        int y = 5;
        zmien(y);
        System.out.println(y);
    }
    public static int zmien(int x){
        x += 5;
        System.out.println("Metoda: " + x);
        return x;
    }
}
