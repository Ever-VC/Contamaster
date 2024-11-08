package models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Asiento;
import models.Movimiento;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-08T07:01:46", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(DetalleAsiento.class)
public class DetalleAsiento_ { 

    public static volatile SingularAttribute<DetalleAsiento, Movimiento> idMovimientoFk;
    public static volatile SingularAttribute<DetalleAsiento, Asiento> idAsientoFk;
    public static volatile SingularAttribute<DetalleAsiento, Integer> id;

}