package ar.edu.davinci.dvds20202cg1.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Entity
@PrimaryKeyJoinColumn(name = "vta_id")
@DiscriminatorValue("EFECTIVO")
@Table(name="ventas_efectivo")


@Data
@SuperBuilder
public class VentaEfectivo extends Venta {

    @Override
    public Double conRecargo(Double importeBase) {
        return importeBase;
    }

}