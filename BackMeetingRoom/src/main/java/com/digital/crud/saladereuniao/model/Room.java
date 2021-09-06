package com.digital.crud.saladereuniao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="meetingroom")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="name", nullable=false)
    private String name;
    @Column(name="date", nullable=false)
    private String data;
    @Column(name="startHour", nullable=false)
    private String startHour;
    @Column(name="finishHour", nullable=false)
    private String finishHour;

    @Override
    public String toString(){
        return "Room [id= "+id+", name= "+name+", start hour= "+startHour+", end hour= "+finishHour+" ]";
    }
}
