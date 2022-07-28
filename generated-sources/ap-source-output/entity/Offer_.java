package entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-06-17T12:47:06", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Offer.class)
public class Offer_ { 

    public static volatile SingularAttribute<Offer, String> offerName;
    public static volatile SingularAttribute<Offer, Boolean> isSpecial;
    public static volatile SingularAttribute<Offer, Integer> price;
    public static volatile SingularAttribute<Offer, Integer> offerID;
    public static volatile SingularAttribute<Offer, String> description;

}