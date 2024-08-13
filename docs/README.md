## 📚 구현할 기능 목록

---

### 📌 컴퓨터 수 생성
- [x] 1에서 9까지 서로 다른 임의의 수 3개를 선택한다.
- [x] Random 값 추출은 `camp.nextstep.edu.missionutils.Randoms`의 `pickNumberInRange()`를 활용한다.
    - 사용 예시
      ```java
      List<Integer> computer = new ArrayList<>();
      while (computer.size() < 3) {
          int randomNumber = Randoms.pickNumberInRange(1, 9);
          if (!computer.contains(randomNumber)) {
              computer.add(randomNumber);
          }
      }
      ```

<br>

### 🚫 예외 처리
- [x] 생성된 수가 3자리 수를 초과할 경우 ```NumberSizeException```
- [x] 생성된 수가 중복된 수일 경우 ```NumberDuplicateException```
- [x] 1~9 범위가 아닌 수일 경우 ```NumberRangeException```

---

### 📌 사용자 수 입력
- [x] 1에서 9까지 서로 다른 임의의 수 3개를 선택한다.
- [x] 사용자가 입력하는 값은 `camp.nextstep.edu.missionutils.Console`의 `readLine()`을 활용한다.

<br>

### 🚫 예외 처리
- [x] 입력한 수가 3자리 수를 초과할 경우 ```NumberSizeException```
- [x] 입력한 수가 중복된 수일 경우 ```NumberDuplicateException```
- [x] 1~9 범위가 아닌 수일 경우 ```NumberRangeException```
- [x] 입력값이 숫자가 아닐 경우 ```NumberFormatException```

---

### 📌 게임 진행
### 입력
- [ ] 서로 다른 3자리의 수
    - ```숫자를 입력해주세요 : 123```

### 출력
- 입력한 수에 대한 결과를 볼, 스트라이크 개수로 표시
    - ```1볼 1스트라이크```

- [ ] 하나도 없는 경우
    - ```낫싱```

- [ ] 3개의 숫자를 모두 맞힐 경우
    ```
    3스트라이크
    3개의 숫자를 모두 맞히셨습니다! 게임 종료
    ```

- [ ] 게임 시작 문구 출력
  ```
  숫자 야구 게임을 시작합니다.
  ``` 

### ✅ 검증
- **볼**: 같은 수가 다른 자리에 있을 경우
- **스트라이크**: 같은 수가 같은 자리에 있을 경우
- **낫싱**: 같은 수가 없을 경우

---

### 📌 게임 재시작
- [ ] 게임이 끝난 경우 재시작/종료를 구분하는 1과 2 중 하나의 수
    ```
    3개의 숫자를 모두 맞히셨습니다! 게임 종료
    게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.
    1
    ```

### 🚫 예외 처리
- [ ] 입력값이 1 or 2가 아닐 경우 ```IllegalArgumentException```