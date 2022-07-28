package entity;

import entity.Category;
import entity.State;
import entity.SubPlaces;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-06-17T12:47:06", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Places.class)
public class Places_ { 

    public static volatile SingularAttribute<Places, State> stateID;
    public static volatile SingularAttribute<Places, Integer> placeID;
    public static volatile CollectionAttribute<Places, SubPlaces> subPlacesCollection;
    public static volatile SingularAttribute<Places, String> description;
    public static volatile SingularAttribute<Places, String> placeName;
    public static volatile SingularAttribute<Places, Category> categoryID;

}