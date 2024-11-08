package models;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Cuenta;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-08T11:28:31", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Mayor.class)
public class Mayor_ { 

    public static volatile SingularAttribute<Mayor, Date> fechaInicio;
    public static volatile SingularAttribute<Mayor, BigDecimal> totalHaber;
    public static volatile SingularAttribute<Mayor, BigDecimal> saldoAnterior;
    public static volatile SingularAttribute<Mayor, BigDecimal> totalDebe;
    public static volatile SingularAttribute<Mayor, Cuenta> idCuentaFk;
    public static volatile SingularAttribute<Mayor, Integer> id;
    public static volatile SingularAttribute<Mayor, BigDecimal> saldo;
    public static volatile SingularAttribute<Mayor, Date> fechaFin;

}