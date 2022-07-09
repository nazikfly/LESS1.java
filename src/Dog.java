import java.util.Arrays;

public final class Dog extends Pet {
    private String name;
    private String breed;
    private String[] commands;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public Dog(String name, String breed, String[] commands) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }

    public Dog(String name, String breed,
               String[] commands, Shelter shelter,
               ColorEnam colorEnum) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setColorEnam(colorEnum);
        super.setShelter(shelter);

    }

    public Dog(String name, String breed,
               Shelter shelter,
               ColorEnam colorEnum) {
        this.name = name;
        this.breed = breed;
        super.setColorEnam(colorEnum);
        super.setShelter(shelter);

    }

    void makeVoice(){
        System.out.println("Gav,Gav");
    }

    void makeVoice(String voice){
        System.out.println(voice);
    }

    @Override
    public String getInfo() {
        if (commands!=null){
        return super.getInfo()+
                "\nName: " + name +
                "\nBreed: " + breed +
                "\nCommands: " + Arrays.toString(commands);
    }else {
        return super.getInfo() +
                "\nName: " + name +
                "\nBreed: " + breed;
    }
}

}
