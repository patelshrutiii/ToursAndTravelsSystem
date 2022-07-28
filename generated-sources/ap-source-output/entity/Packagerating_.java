package entity;

import entity.Packages;
import entity.User;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-06-17T12:47:06", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Packagerating.class)
public class Packagerating_ { 

    public static volatile SingularAttribute<Packagerating, Packages> packageID;
    public static volatile SingularAttribute<Packagerating, String> description;
    public static volatile SingularAttribute<Packagerating, User> userID;
    public static volatile SingularAttribute<Packagerating, Integer> ratingStar;
    public static volatile SingularAttribute<Packagerating, Integer> packageRatingID;

}