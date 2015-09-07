package com.schoppen.schoppenerp.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("REFRESCO")
public class Refrescos extends Bebidas{

}
