package models

/**
 * Created by FORTIZ on 2/21/14.
 */
trait User {var id: Long
            var firstName: String
            var lastName: String
            var nickname: String
            var password: String
            var mail: String
            var enabled: Boolean
            var manager: Manager
}


