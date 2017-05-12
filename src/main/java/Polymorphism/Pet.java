package Polymorphism;

/**
 * Created by vilenalivinsky on 5/12/17.
 */
public class Pet {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private String type;

    public Pet(String name, String type){

        this.name = name;
        this.type = type;
    }


}
