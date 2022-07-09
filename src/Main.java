public class Main {
    public static void main(String[] args) {


        String[] commands = {"Sidet", "Bejat"};
        Shelter shelter = new Shelter("Romashka", "Chyi1");
        Dog dog = new Dog("Rex", "Ovcharka", commands,
                shelter, ColorEnam.BROWN);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("Гув гув, гув гув");

        Shelter shelter1 = new Shelter("Puma", "Ayni1");
        Dog dog1 = new Dog("Chappy", "Takca",
                shelter1, ColorEnam.WHITE);
        System.out.println(dog1.getInfo());
        dog1.makeVoice();
        dog1.makeVoice("Гув гув, гув гув");


        Shelter shelter2 = new Shelter("RED", "MG1");
        Dog dog2 = new Dog("Bolto", "Spaniel", shelter2, ColorEnam.GREY);

        System.out.println(dog2.getInfo());
        dog2.makeVoice();
        dog2.makeVoice("Гув гaв, гув гaв");
    }
}