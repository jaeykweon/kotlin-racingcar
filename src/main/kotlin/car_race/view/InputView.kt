package car_race.view

import car_race.logic.GameRound
import car_race.logic.car.CarNames
import car_race.logic.car.Cars

object InputView {

    fun inputGameRound(): GameRound {
        println("시도할 횟수는 몇 회인가요?")
        val input = readlnOrNull() ?: throw IllegalArgumentException("null 입력은 허용하지 않습니다.")
        return GameRound.from(input)
    }

    fun inputCars(): Cars {
        println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
        val input = readlnOrNull() ?: throw IllegalArgumentException("null 입력은 허용하지 않습니다.")
        val carNames = CarNames(input)
        return Cars(carNames)
    }
}
