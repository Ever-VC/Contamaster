package models;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Cuenta;
import models.DetalleAsiento;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-10-05T11:44:40", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Movimiento.class)
public class Movimiento_ { 

    public static volatile SingularAttribute<Movimiento, String> descripcion;
    public static volatile SingularAttribute<Movimiento, Date> fecha;
    public static volatile SingularAttribute<Movimiento, BigDecimal> haber;
    public static volatile CollectionAttribute<Movimiento, DetalleAsiento> detalleAsientoCollection;
    public static volatile SingularAttribute<Movimiento, Cuenta> idCuentaFk;
    public static volatile SingularAttribute<Movimiento, BigDecimal> debe;
    public static volatile SingularAttribute<Movimiento, Integer> id;

}