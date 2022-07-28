package entity;

import entity.Category;
import entity.City;
import entity.Places;
import entity.State;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-06-17T12:47:06", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(SubPlaces.class)
public class SubPlaces_ { 

    public static volatile SingularAttribute<SubPlaces, String> subPlaceName;
    public static volatile SingularAttribute<SubPlaces, State> stateID;
    public static volatile SingularAttribute<SubPlaces, Places> placeID;
    public static volatile SingularAttribute<SubPlaces, Integer> subPlaceID;
    public static volatile SingularAttribute<SubPlaces, String> description;
    public static volatile SingularAttribute<SubPlaces, City> cityID;
    public static volatile SingularAttribute<SubPlaces, Category> categoryID;

}