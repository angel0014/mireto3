package mintic.cicloiii.reto3;

import javax.persistence.CascadeType;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="catergory")
public class Categoria implements Serializable{
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    
    @Column(length=4)
    private Integer id;

    @Column(length=45)
    private String name;

    @Column(length=250)
    private String description;


@OneToMany(cascade={CascadeType.PERSIST}, mappedBy ="category")
@JsonIgnoreProperties("category")
private List<Costume> costumes;


public Integer getId() {
    return id;
}


public void setId(Integer id) {
    this.id = id;
}


public String getName() {
    return name;
}


public void setName(String name) {
    this.name = name;
}


public String getDescription() {
    return description;
}


public void setDescription(String description) {
    this.description = description;
}


public List<Costume> getCostumes() {
    return costumes;
}


public void setCustomes(List<Costume> costumes) {
    this.costumes = costumes;
}


    
}
