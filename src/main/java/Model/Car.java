package Model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private int numberOfDoors;
    private int horsePower;
    private String type;

    public String getType() {return type;}
    public void setType(String type) {this.type = type;}

    @OneToOne
    private Category category;

    @OneToMany(mappedBy = "Car")
    private Set<FuelType> fuelTypes;

    @ManyToMany(mappedBy = "Car")
    private Set<Category> categories;

    public String getDescription(){return description;}

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }



}
