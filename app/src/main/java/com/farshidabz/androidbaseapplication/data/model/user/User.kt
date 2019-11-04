package com.farshidabz.androidbaseapplication.data.model.user

import com.farshidabz.androidbaseapplication.data.model.BaseModel
import java.util.*

class User : BaseModel() {
    var id: String = ""

    var mobileNumber: String = ""
    var fullName: String = ""
    var firstName: String = ""
    var lastName: String = ""
    var gender: String? = ""
    var birthday: Date? = null
    var rating: Double = 0.0
    var rateCount: Int = 0
    var age: Int = 0
    var about: String = ""

    fun getAge(): String {
        birthday?.let { date ->

            val bornCalendar = Calendar.getInstance()
            bornCalendar.timeInMillis = date.time
            val todayCalendar = Calendar.getInstance()
            todayCalendar.timeInMillis = System.currentTimeMillis()

            var age = todayCalendar.get(Calendar.YEAR) - bornCalendar.get(Calendar.YEAR)

            if (todayCalendar.get(Calendar.DAY_OF_YEAR) < bornCalendar.get(Calendar.DAY_OF_YEAR)) {
                age--
            }
            return age.toString()
        }
        return ""
    }
}
