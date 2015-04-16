package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

/**
 * Created by Punpikorn on 4/16/15 AD.
 */
@Entity
public class RatingCriteriaList extends Model {
    @Id
    public int ID;
    public ArrayList<Integer> criteriaList;

    public RatingCriteriaList() {

    }

    public RatingCriteriaList(ArrayList<Integer> t) {
        this.criteriaList = t;
    }

    public ArrayList<Integer> getCriteriaList() {
        return this.criteriaList;
    }

    public static Finder<Integer, RatingCriteriaList> find = new Finder<Integer,RatingCriteriaList>(
        Integer.class, RatingCriteriaList.class
    );

    public static void create() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //5 criteria
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        RatingCriteriaList rcl = new RatingCriteriaList(list);
        rcl.save();
    }

    public static RatingCriteriaList getDummyList() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        return new RatingCriteriaList(list);
    }
}
