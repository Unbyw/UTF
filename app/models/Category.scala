package models

import scala.collection.mutable
/**
 * Created by FORTIZ on 3/4/14.
 */
case class Category(id: Long,
                    label: String,
                    childrenCategories : Seq[Category],
                    parentCategory : Category){

    object Categories {
      Long id;
      String label;
      Seq[Category] childrenCategory;
      Category parentCategory;

      Categories()

    }
}
