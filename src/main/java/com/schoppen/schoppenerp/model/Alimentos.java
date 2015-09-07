package com.schoppen.schoppenerp.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ALIMENTO")
public class Alimentos extends Productos{

}
