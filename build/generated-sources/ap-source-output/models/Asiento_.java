package models;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.DetalleAsiento;
import models.Usuario;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-04T14:16:24", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Asiento.class)
public class Asiento_ { 

    public static volatile SingularAttribute<Asiento, String> descripcion;
    public static volatile SingularAttribute<Asiento, Date> fecha;
    public static volatile SingularAttribute<Asiento, BigDecimal> totalHaber;
    public static volatile CollectionAttribute<Asiento, DetalleAsiento> detalleAsientoCollection;
    public static volatile SingularAttribute<Asiento, BigDecimal> totalDebe;
    public static volatile SingularAttribute<Asiento, Integer> id;
    public static volatile SingularAttribute<Asiento, Usuario> idUsuarioFk;

}