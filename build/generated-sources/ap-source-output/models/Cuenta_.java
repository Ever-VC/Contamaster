package models;

import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Empresa;
import models.Mayor;
import models.Movimiento;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-08T07:01:46", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Cuenta.class)
public class Cuenta_ { 

    public static volatile SingularAttribute<Cuenta, String> codigo;
    public static volatile SingularAttribute<Cuenta, String> tipo;
    public static volatile SingularAttribute<Cuenta, Empresa> idEmpresaFk;
    public static volatile CollectionAttribute<Cuenta, Movimiento> movimientoCollection;
    public static volatile SingularAttribute<Cuenta, Integer> id;
    public static volatile SingularAttribute<Cuenta, BigDecimal> saldo;
    public static volatile SingularAttribute<Cuenta, String> nombre;
    public static volatile CollectionAttribute<Cuenta, Mayor> mayorCollection;

}