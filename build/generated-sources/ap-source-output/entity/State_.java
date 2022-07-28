package entity;

import entity.City;
import entity.Managehotel;
import entity.Packages;
import entity.Places;
import entity.SubPlaces;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-06-17T12:47:06", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(State.class)
public class State_ { 

    public static volatile CollectionAttribute<State, Packages> packagesCollection;
    public static volatile SingularAttribute<State, String> stateName;
    public static volatile SingularAttribute<State, Integer> stateID;
    public static volatile CollectionAttribute<State, Managehotel> managehotelCollection;
    public static volatile CollectionAttribute<State, City> cityCollection;
    public static volatile CollectionAttribute<State, SubPlaces> subPlacesCollection;
    public static volatile CollectionAttribute<State, Places> placesCollection;

}