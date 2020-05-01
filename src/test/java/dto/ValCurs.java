package dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("ValCurs")
public class ValCurs {
    @XStreamAlias("Date")
    @XStreamAsAttribute
    private String date;
    @XStreamAlias("name")
    @XStreamAsAttribute
    private String name;
    @XStreamImplicit(itemFieldName = "Valute")
    List<Valute> lister;

    public ValCurs(String date, String name, List<Valute> lister) {
        this.date = date;
        this.name = name;
        this.lister = lister;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Valute> getLister() {
        return lister;
    }

    public void setLister(List<Valute> lister) {
        this.lister = lister;
    }

    @Override
    public String toString() {
        return "ValCurs{" +
                "date='" + date + '\'' +
                ", name='" + name + '\'' +
                ", lister=" + lister +
                '}';
    }

}
