## 1. Dynamic Programming(동적계획법 - dp)
> 1950년 미국의 수학자인 리처드 벨맨이 최적화 문제(Optimization Problem)를 해결하기 위해 고안되 었다.<br/>

복잡한 문제를 간단한 여러 개의 문제로 나누어 푸는 방법을 말한다.<br/>
이것은 **부분 문제 반복**과 **최적 부분 구조**의 문제가 있을 때 DP를 사용하여 해결 할수 있다<br/>

## Divide and Conquer(분할정복) 과 차이점
- 분할 정복은 큰 문제를 해결하기 어려워 단지 작은 문제로 나누어 푸는 방법
- 작은 부분 문제들이 반복되는 것(답이 바뀌지 않음)
- 즉 작은 문제가 중복이 일어나는지 안일어나는지 차이이다

## 조건 1. 부분 반복 문제(Overlapping Subproblem)
> 모든 문제를 부분 문제로 쪼갤 수 있고, 재귀 함수를 통해 해결한다. 아래는 피보나치 수열 예제 이다.
```
fib(1) = 1; fib(2) = 1;
fib(n) = fib(n-1) + fib(n-2);

// 메소드로 표현한 피보나치 수열
    int fib(int n) {
        if (n <= 2)
            return 1;
        else
            return fib(n-1) + fib(n-2);
    }
//fib(7) = fib(6) - fib(5)
//fin(6) = fib(5) - fib(4) 와 같이 반복적인 연산을 부분 반복 문제라고 한다.
```

## 조건 2. 최적 부분 구조(Optimal substructure)
> 문제의 최적 해결 방법이 부분 문제의 최적 해결 방법으로 구성 된 문제 구조를 의미한다.
```
//예시
fib(7)에서 구한 fib(4)
fib(6)에서 구한 fib(4)
fib(5)에서 구한 fib(4)
fib(4)에서 구한 fib(4)
이 fib(4)는 항상 같은 값이기 때문에 계속 연산해주는 의미가 없다.
그래서 이 같은 값을 연산해주는 부분을 줄여야 한다.
```

## 조건 2.1 메모이제이션(Memoization)
> 위 최적 부분 구조의 같은 값을 계속 연산해주는 방법에 대한 해결 방법으로 DP의 개념이다.<br>

메모이제이션이란 동일 계산이 반복되는 것을 처음 계산한 값에서 메모리에 저장하여 동일한 계산의 반복 수행을
제거하여 <br/> 프로그램 실행속도를 빠르게하는 기술이며 DP의 핵심이 되는 기술이다.

## 구현방법 1. Top-Down
큰 문제에서 부분 문제로 쪼개가며, **재귀 호출**을 이용하여 푸는 방법

```
int memo[101];

memo[1] = 1;
memo[2] = 1;

// 메소드로 표현한 피보나치 수열
int fib(int n)
  {
    if (memo[n] != 0) 
      return memo[n];
    
    memo[n] = fib(n-1) + fib(n-2);
    
    return memo[n];
  }

```

## 구현방법 2. Bottom-Up
부분 문제에서부터 문제를 풀어가며 점차 큰 문제를 풀어가는 방법, **for문**을 이요하여 푸는 방법

```
// 최대 범위 N보다 1 크게 사용.
// memo[0] 초기값 상태 0으로 비워둘것임.
//메모이제이션
int memo[101];

//기저상태
memo[1] = 1;
memo[2] = 1;

// 메소드로 표현한 피보나치 수열
int fib(int n)
  {
    
    for(int i = 3; i <=n; i++){
      memo[i] = memo[i-1] + memo[i-2]; // f(n) = f(i-1) + f(i-2) 점화식을 구함
    }
    return memo[n];
  }

```

## DP 선행 작업
1. 기저상태 파악할 것(가장 작은 문제의 상태)
2. 메모이제이션(반복되는 계산을 저장할 배열)
3. 점화식 구하기
4. Top - Bottom(재귀) / Bottom - Top(for) 

참고
- https://velog.io/@gillog/%EB%8F%99%EC%A0%81-%EA%B3%84%ED%9A%8D%EB%B2%95Dynamic-Programming#%E2%99%82%EF%B8%8F-%EC%B0%B8%EA%B3%A0%EC%82%AC%EC%9D%B4%ED%8A%B8-%E2%99%82%EF%B8%8F
- https://hongjw1938.tistory.com/47