package com.example.freshvibes.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.List;

@Embeddable
public class FoodInfo implements Serializable {

    private List<String> likeFood;
    private List<String> dislikeFood;

}
