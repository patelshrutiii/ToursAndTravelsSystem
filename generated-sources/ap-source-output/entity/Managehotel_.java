package entity;

import entity.City;
import entity.Packages;
import entity.State;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-06-17T12:47:06", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Managehotel.class)
public class Managehotel_ { 

    public static volatile SingularAttribute<Managehotel, String> image3;
    public static volatile CollectionAttribute<Managehotel, Packages> packagesCollection;
    public static volatile SingularAttribute<Managehotel, Integer> costPerRoom;
    public static volatile SingularAttribute<Managehotel, State> stateID;
    public static volatile SingularAttribute<Managehotel, String> description;
    public static volatile SingularAttribute<Managehotel, Integer> hotelID;
    public static volatile SingularAttribute<Managehotel, City> cityID;
    public static volatile SingularAttribute<Managehotel, String> image1;
    public static volatile SingularAttribute<Managehotel, String> hotelName;
    public static volatile SingularAttribute<Managehotel, String> image2;

}