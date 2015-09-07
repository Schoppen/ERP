package com.schoppen.schoppenerp.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MATERIAL")
public class Materiales extends Productos{

}