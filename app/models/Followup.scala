package model

import java.util.Date

/**
 * Created by FORTIZ on 3/3/14.
 */
case class Followup(id: Long,
                    idUser: Long,
                    idTask: Long,
                    day: Date,
                    time: Double
                    //todo comments
                    ) {

}
