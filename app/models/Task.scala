package models

import java.util.Date

/**
 * Created by FORTIZ on 3/3/14.
 */
trait Task {var id: Long
            var title: String
            var description: String
            var budget: Double
            var creationDate: Date
}
