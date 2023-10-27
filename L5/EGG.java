class EGG {
    void EGG() {
        System.out.println("Each egg has an albumen and a yolk");
    }

    void print() {
        System.out.println("The egg is a nutritional product");
    }
}

class ostrich_egg extends egg {
    void EGG() {
        System.out.println("The albumen and yolk of an OSTRICH egg are the largest");
    }
}

public class EGGS {
    public static void main(String[] args) {
        egg henegg = new egg();
        ostrich_egg ostrichegg = new ostrich_egg();

        henegg.EGG();
        henegg.print();

        ostrichegg.EGG();
        ostrichegg.print();
    }
}
