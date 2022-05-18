# STEP3 : 자동차 경주

### 요구사항
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우이다.


### TODO-LIST
- [x] 회차당 자동차들의 상태를 Record라는 객체를 통해 기록한다. Record는 자동차 수 크기의 List 프로퍼티를 가지고 있다.
- [x] 자동차 전진 여부를 결정하는 역할을 Dice 라는 객체를 통해 기록한다.
- [x] 각 게임은 Record, Dice 를 인자로 받아 하나의 instance가 된다. 
- [x] UI를 담당하는 로직을 InputView / ResultView와 같은 클래스로 분리하여 구현한다.