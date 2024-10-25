
enum class DayPart{
    MORNING,
    AFTERNOON,
    EVENING
}

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: DayPart,
    val durationInMinutes: Int,
)


fun main() {





}