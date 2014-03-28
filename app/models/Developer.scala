package models

/**
 * Created by FORTIZ on 3/3/14.
 */
case class Developer(user_id: Long
                    ,firstName: String
                    ,lastName: String
                    ,login: String
                    ,password: String
                    ,mail: String
                    ,enabled: Boolean
                    ,manager: Long
                    ,stream_id: Long)extends  User{

}
