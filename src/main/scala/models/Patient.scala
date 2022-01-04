package models


/*
object Sex extends Enumeration {
    type Sex = Value
    val Male = Value("Male")
    val Female = Value("Female")
}

object ChestPainType extends Enumeration {
    type ChestPainType = Value
    val TA = Value("TA")
    val ATA = Value("ATA")
    val NAP = Value("NAP")
    val ASY = Value("ASY")
}



object RestingECG extends Enumeration {
    type RestingECG = Value
    val Normal = Value("Normal")
    val ST = Value("ST")
    val LVH = Value("LVH")
}

object STSlope extends Enumeration {
    type STSlope = Value
    val Up = Value("Up")
    val Flat = Value("Flat")
    val Down = Value("Down")
}*/

class Patient {

    private var age: Int = 0
    private var sex: Gender = Gender.Male
    private var chest_pain_type: ChestPainType = ChestPainType.TA
    private var resting_BP: Int = 0
    private var cholesterol: Int = 0
    private var fasting_BS: Boolean = false
    private var resting_ECG: RestingECG = RestingECG.Normal
    private var max_HR: Int = 0
    private var exercise_angina: Boolean = false
    private var old_peak: Int = 0
    private var st_slope: STSlope = STSlope.Up
    private var heart_disease: Boolean = false


    def Age: Int = age
    def Sex: Gender = sex // FIXME: change name or type
    def Chest_Pain_Type: ChestPainType = chest_pain_type
    def Resting_BP: Int = resting_BP
    def Cholesterol: Int = cholesterol
    def Fasting_BS: Boolean = fasting_BS
    def Resting_ECG: RestingECG = resting_ECG
    def Max_HR: Int = max_HR
    def Exercise_Angina: Boolean = exercise_angina
    def Old_Peak: Int = old_peak
    def ST_Slope: STSlope = st_slope
    def Heart_Disease: Boolean = heart_disease



    def toArray(): Array[String] = null
}
