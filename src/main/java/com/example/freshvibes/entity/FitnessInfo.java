package com.example.freshvibes.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FitnessInfo implements Serializable {

    public List<String> sportTrains;
    public String freequency;

}
