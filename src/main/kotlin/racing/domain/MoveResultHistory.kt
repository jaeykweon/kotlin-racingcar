package racing.domain

class MoveResultHistory(val history: List<MoveResults>) {
    fun getWinnerNames(): Names {
        return history[history.size - 1].getMaxPositionCarNames()
    }
}