package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by momomomomo on 4/8/2015.
 */
@Entity
public class RatingCriteria extends Model {
    @Id
    public int ID;
    public String criteriaName;

    public static Finder<Integer, RatingCriteria> find = new Finder<Integer,RatingCriteria>(
        Integer.class, RatingCriteria.class
    );

    public static void create(int id, String name) {
        RatingCriteria rc = new RatingCriteria();
        rc.ID = id;
        rc.criteriaName = name;
        rc.save();
    }
}
