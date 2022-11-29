package carrace.logic

class GameRound(
    val value: Long
) {

    companion object {
        private const val INVALID_TYPE_MESSAGE = "게임 횟수는 양의 정수여야 합니다."

        fun from(input: String): GameRound {
            validate(input)

            return GameRound(input.toLong())
        }

        private fun validate(input: String) {
            val inputNumber = try {
                input.toLong()
            } catch (e: NumberFormatException) {
                throw IllegalArgumentException(
                    INVALID_TYPE_MESSAGE,
                    e
                )
            }
            check(inputNumber > 0) { throw IllegalArgumentException(INVALID_TYPE_MESSAGE) }
        }
    }
}
