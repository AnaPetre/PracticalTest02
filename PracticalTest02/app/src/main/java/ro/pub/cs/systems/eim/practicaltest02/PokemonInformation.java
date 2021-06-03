package ro.pub.cs.systems.eim.practicaltest02;

public class PokemonInformation {

    private String name;
    private String type;
    private String ability;

    public PokemonInformation() {
        this.name = null;
        this.type = null;
        this.ability = null;
    }

    public PokemonInformation(String name, String type, String ability) {
        this.name = name;
        this.type = type;
        this.ability = ability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    @Override
    public String toString() {
        return "PokemonInformation{" +
                "Name ='" + name + '\'' +
                ", Type ='" + type + '\'' +
                ", Ability ='" + ability + '\'' +
                '}';
    }

}