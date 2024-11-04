package models;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Usuario;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-04T14:16:24", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(SessionLog.class)
public class SessionLog_ { 

    public static volatile SingularAttribute<SessionLog, Integer> id;
    public static volatile SingularAttribute<SessionLog, Date> loginTimestamp;
    public static volatile SingularAttribute<SessionLog, Usuario> idUsuarioFk;
    public static volatile SingularAttribute<SessionLog, Date> logoutTimestamp;

}