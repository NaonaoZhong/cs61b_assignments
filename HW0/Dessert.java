public class Dessert {
    public int flavor;
    public int price;
    public static int numDesserts=0;
    public Dessert(int flavor,int price){
        this.flavor = flavor;
        this.price = price;
        Dessert.numDesserts++;
    }
    public void printDessert(){
        System.out.print(flavor+" "+price+" "+numDesserts);
        System.out.println();
    }
    public static void main(String[] args) {
        Dessert cookie = new Dessert(1,2);
        cookie.printDessert();
        Dessert icecream = new Dessert(3,4);
        icecream.printDessert();
        System.out.println("I love dessert!");
    }
}
