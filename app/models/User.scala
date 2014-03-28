package model

/**
 * Created by FORTIZ on 2/21/14.
 */
trait User {id: Long;
            firstName: String
            lastName: String
            nickname: String
            password: String
            mail: String
            enabled: Boolean
            manager: Manager
}


