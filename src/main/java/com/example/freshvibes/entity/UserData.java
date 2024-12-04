package com.example.freshvibes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserData {
    @Id
    public String login;
    public LocalDate dateBirth;
    public int height;
    public int weight;
    public String sportActivity;
    public String target;
    public String
}
