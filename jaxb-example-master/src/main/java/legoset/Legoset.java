package legoset;

import java.net.URL;
import java.time.Year;
import java.util.*;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data

public class Legoset {

    private String name;
    private String theme;
    private String subtheme;
    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;
    private int pieces;

    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private Set<String> tags;

    @XmlElementWrapper(name = "minifigs")
    @XmlElement(name = "minifig")
    private List<Minifig> minifigs;

    private Weight weight;

    @XmlElement
    private URL url;

    @XmlAttribute
    private String number;

}
