package org.example.springpractice.Menu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Menu
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idx;
    private String name;
    private Integer price;
    private Integer calorie;

    public Integer getIdx()
    {
        return idx;
    }
    
    public void setIdx(Integer idx)
    {
        this.idx = idx;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public Integer getPrice()
    {
        return price;
    }
    
    public void setPrice(Integer price)
    {
        this.price = price;
    }
    
    public Integer getCalorie()
    {
        return calorie;
    }
    
    public void setCalorie(Integer calorie)
    {
        this.calorie = calorie;
    }
}
