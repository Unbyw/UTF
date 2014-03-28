package models

import java.util.Date

/**
 * Created by FORTIZ on 3/3/14.
 */
case class Followup(followup_id: Long,
                    user_id: Long,
                    task_id: Long,
                    day: Date,
                    time: Double
                    //todo comments
                    ) {

}
