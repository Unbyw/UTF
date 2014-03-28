package model

import java.util.Date

/**
 * Created by FORTIZ on 3/3/14.
 */
trait Task {id: Long
            title: String
            description: String
            budget: Double
            creationDate: Date
}
