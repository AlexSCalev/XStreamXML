package dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("Valute")
public class Valute {
    @XStreamAlias("ID")
    @XStreamAsAttribute
    private String id;
    @XStreamAlias("NumCode")
    private String NumCud;
    @XStreamAlias("CharCode")
    private String CharCard;
    @XStreamAlias("Nominal")
    private String Nominal;
    @XStreamAlias("Name")
    private String Name;

    public Valute(String id, String numCud, String charCard, String nominal, String name, String value) {
        this.id = id;
        NumCud = numCud;
        CharCard = charCard;
        Nominal = nominal;
        Name = name;
        this.value = value;
    }

    @XStreamAlias("Value")
    private String value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumCud() {
        return NumCud;
    }

    public void setNumCud(String numCud) {
        NumCud = numCud;
    }

    public String getCharCard() {
        return CharCard;
    }

    public void setCharCard(String charCard) {
        CharCard = charCard;
    }

    public String getNominal() {
        return Nominal;
    }

    public void setNominal(String nominal) {
        Nominal = nominal;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "Valute{" +
                "id='" + id + '\'' +
                ", NumCud='" + NumCud + '\'' +
                ", CharCard='" + CharCard + '\'' +
                ", Nominal='" + Nominal + '\'' +
                ", Name='" + Name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }


}
