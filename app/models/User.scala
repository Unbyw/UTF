package models

/**
 * Created by FORTIZ on 2/21/14.
 */
trait User {var user_id: Long
            var firstName: String
            var lastName: String
            var login: String
            var password: String
            var mail: String
            var enabled: Boolean
            var manager: Long
            var stream_id: Long
}


