package com.neartome.location.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class State {
    @Id
    Long stateId;
    String stateName;
    String description;
}
