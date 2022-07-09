import java.util.Random;

public class Pet {
    private int age=generateDefaultAge();
    private  ColorEnam colorEnam;
    private Shelter shelter;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ColorEnam getColorEnam() {
        return colorEnam;
    }

    public void setColorEnam(ColorEnam colorEnam) {
        this.colorEnam = colorEnam;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge(){
        Random random=new Random();
        return random.nextInt(10)+1;
    }
    public String getInfo() {
        return "Age: " + age +
                "\nColor: " + colorEnam +
                "\nShelter name: " + shelter.getName() +
                "\nShelter address: " + shelter.getAddress();

    }
    }

