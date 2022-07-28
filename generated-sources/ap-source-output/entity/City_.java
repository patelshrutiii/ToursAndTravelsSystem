package entity;

import entity.Busdetails;
import entity.Managehotel;
import entity.State;
import entity.SubPlaces;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-06-17T12:47:06", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(City.class)
public class City_ { 

    public static volatile CollectionAttribute<City, Busdetails> busdetailsCollection1;
    public static volatile SingularAttribute<City, String> cityName;
    public static volatile SingularAttribute<City, State> stateID;
    public static volatile CollectionAttribute<City, Managehotel> managehotelCollection;
    public static volatile CollectionAttribute<City, SubPlaces> subPlacesCollection;
    public static volatile SingularAttribute<City, Integer> cityID;
    public static volatile CollectionAttribute<City, Busdetails> busdetailsCollection;

}