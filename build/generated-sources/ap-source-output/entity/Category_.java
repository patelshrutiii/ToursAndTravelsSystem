package entity;

import entity.Packages;
import entity.Places;
import entity.SubPlaces;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-06-17T12:47:06", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SingularAttribute<Category, String> image;
    public static volatile CollectionAttribute<Category, Packages> packagesCollection;
    public static volatile CollectionAttribute<Category, SubPlaces> subPlacesCollection;
    public static volatile SingularAttribute<Category, String> description;
    public static volatile CollectionAttribute<Category, Places> placesCollection;
    public static volatile SingularAttribute<Category, String> categoryName;
    public static volatile SingularAttribute<Category, Integer> categoryID;

}