public class Dog{
    public int weightInPounds;
    public Dog(int w){
        weightInPounds = w;
    }

    public static Dog maxDog(Dog d1, Dog d2) {
    if (d1.weightInPounds > d2.weightInPounds) {
        return d1;
    }else{
        return d2;      
    }
    }
    public static void main(String[] args){
        Dog d = new Dog(5);
        Dog d2 = new Dog(100);
        Dog heavier =Dog.maxDog(d, d2);
        System.out.println(heavier.weightInPounds);
    }
}