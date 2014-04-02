package models

import scala.collection.mutable
/**
 * Created by FORTIZ on 3/4/14.
 */
case class Category(category_id: Long
                    ,label: String
                    ,description: String
                    ,subCategories: Array[Category]
                    ,parentCategory : Category){

    object Categories {

    }
}
