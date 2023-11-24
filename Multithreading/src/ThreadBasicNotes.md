```java

class Task1 extends Thread {

  public void run() { // SIGNATURE 정확히 적어야해용
    System.out.println("\nTask1 Started");
    for (int i = 101; i <= 199; i++) {
      System.out.print(i + " ");
    }
    System.out.print("\nTask1 Done");
  }
}

class Task2 implements Runnable {

  @Override
  public void run() {
    System.out.println("\nTask2 Started");
    for (int i = 201; i <= 299; i++) {
      System.out.print(i + " ");
    }
    System.out.print("\nTask2 Done");
  }
}

public class ThreadBasicsRunner {

  public static void main(String[] args) {
    // Task1
    System.out.println("\nTask1 Kicked Up");
    Task1 task1 = new Task1();
    task1.start(); // task1.run(); // run 이라고 적으면 안되고 start 를 실행해야해요.

    // Task2
    /**
     * runnable 인터페이스를 구현했다면 Thread라는 클래스를 또 만들어야합니다.
     * task2 는 메인 프로그램의 실행이 완료된 후에도 실행되고 있죠?
     */
    System.out.println("\nTask2 Kicked Up");
    Task2 task2 = new Task2();
    Thread task2Thread = new Thread(task2);
    task2Thread.start();

    // Task3
    System.out.println("\nTask3 Kicked Up");
    for (int i = 301; i <= 399; i++) {
      System.out.print(i + " ");
    }
    System.out.print("\nTask3 Done");

    System.out.print("\nMain Done");
  }
}


```


## 스레드의 필요성
Task1과 Task2, 그리고 Task3가 존재합니다
보편적으로 다수의 시나리오에서는 Task1과 Task2, 그리고 Task3가 각각 서로에 대해 독립적으로 작용하지만 몇몇 task는 외부의 실행에 의해 의존적으로 실행되기도 합니다.
여기서는 아마 I/O나 이와 비슷한 것들에 달려있겠죠. 
그러므로 이 task의 실행 단계에서 사용자의 CPU는 충분히 활용되지 못할 것입니다.
하지만 그런데도 CPU는 실행할 task가 단 한 가지만 존재하죠. 그럼 어떤 일이 벌어질까요? 아마 계속 기다리고 대기하는 상황이 이어질 것입니다.
'Threads', 즉 스레드는 이렇게 유사성을 가진 모든 수행문을 동시에 실행하도록 해줍니다 이 thread를 실행하는 코드를 하나 작성하고, 또 다른 thread로 이 코드를 실행하고, 또 다른 thread로 이 코드들을 실행합니다. 그러므로 유사한 구조를 가진 이 세 가지 task가 모두 실행되는 것이죠, 이로써 CPU의 효율성이 향상되는데, 이유는 외부 서비스나 데이터 저장소로부터 데이터 입력을 기다리며 지속해서 다른 task에 대한 정보를 얻을 수 있기 때문입니다.

## 스레드를 생성하는 법 2가지
1. `extends Thread` (스레드라고 불리는 클래스를 확장하는 것)
2. `implements Runnable`(Runnable 이라는 인터페이스를 구현하는 것)

## 스레드의 장점
 세가지 작업을 스레드를 사용해 병렬로 처리하면서,
 1. 우리 CPU 는 남는 리소스 없이 최고 효율을 내며
 2. 세가지 task를 처리 중간중간 대기 시간에도 계속 다른 일을 처리하며 놀거나 비는 시간없이 지속해서 코드를 진행할 수 있어요

 > **Kicked up** 은 작업이 시작되기 직전 스레드가 시작준비가 되었음을 나타냅니다.
 > **Stared up** 은 작업이 실제로 실행중임을 말합니다.

## 스레드의 상태

```
Task1 Kicked Up

Task2 Kicked Up

Task1 Started

Task3 Kicked Up

Task2 Started
301 302 303 304 305 306 307 308 309 310 101 201 202 102 103 104 105 106 107 108 109 110 311 111 112 113 114 115 116 117 118 203 119 312 313 314 315 316 317 318 319 320 321 322 323 324 120 204 121 122 123 124 125 126 127 128 325 129 130 131 132 133 134 135 136 137 138 139 140 141 142 143 144 145 146 147 148 205 149 206 326 327 328 329 330 331 332 333 334 335 336 337 338 339 340 341 342 343 344 345 346 207 150 151 152 208 347 348 209 210 153 154 155 156 157 158 159 160 161 162 163 164 165 166 211 349 350 351 352 353 354 355 212 167 213 356 214 215 168 169 170 171 172 173 174 175 216 217 357 218 219 220 221 222 223 224 225 226 227 228 229 230 231 232 233 234 235 236 237 238 239 240 241 242 243 176 358 359 360 361 362 363 244 245 246 247 248 177 178 179 180 181 182 183 184 185 186 187 188 189 190 191 192 193 194 195 196 249 364 365 250 197 251 252 253 254 255 256 257 258 366 259 260 261 262 263 264 265 266 267 268 269 270 271 272 273 274 275 276 277 278 198 199 
Task1 Done279 367 368 369 370 280 371 281 282 283 372 284 285 286 287 288 289 290 291 292 293 294 295 373 296 374 297 375 298 299 
Task2 Done376 377 378 379 380 381 382 383 384 385 386 387 388 389 390 391 392 393 394 395 396 397 398 399 
Task3 Done
Main Done#   
```

|                    |                                                                                                 |
| ------------------ | ----------------------------------------------------------------------------------------------- |
| `NEW`              | 스레드 인스턴스가 생성되고 실행할 준비가 되었지만 아직 사용자가 요구하기 전일때. 즉 코드 실행전 |
| `RUNNABLE`         | 스레드가 실행될 준비가 되어있으나 다른 스레드가 실행되고 있을때                                 |
| `RUNNING`          | 스레드의 Task가 실행되고 있는 특정 지점의 상태. 코드를 실행하려고 계속 엿보고 있음              |
| `BLOCKED/ WAITING` | 외부 요인에 의해 실행이 정지된 채 기다리고 있음                                                 |
| `TERMINATED/ DEAD` | Task가 완료되어 Done 된 이후                                                                    |

RUNNABLE
1) Task3(메인 메소드)가 실행되고 있을 때 Task1, Task2 는 Runnable하고 있습니다. 

BLOCKED 
1) 외부서비스의 응답을 기다리고 있거나 DB가 느릴때 사용자는 차단됩니다.
2) 다른 스레드의 진행여부에 의존하고 있을 때 (예를 들어 Task가 Task1의 완료 여부에 의존하고 있는 경우)

## 스레드에 우선순위를 부여하기

 task1.setPriority(1);

 스레드에 우선순위를 부여하는건 추천(request)해주는 겁니다.
 반영여부가 보장되는 건 아니에요.


 `MIN_PRIORITY`  = 1;
 `NORM_PRIORITY` = 5; //default
 `MAX_PRIORITY` = 10;

## 스레드 간 소통

Task3 는 Task1, Task2 실행이 완료되어야만 실행하고 싶어요.

`task1.join();`


```java
    // task1이 끝나기를 기다려주기
task1.join(); // 1) 얘가 끝나야
task2Thread.join();

// Task3
System.out.println("\nTask3 Kicked Up"); // 2) 얘가 실행가능
```

해당 줄이 완료되어야만, 다음 라인의 코드가 실행시작 됩니다.