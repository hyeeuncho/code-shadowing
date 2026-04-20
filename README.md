# TIL - Spring MVC Layer Separation

## 레이어를 분리한 이유

Controller는 HTTP 요청/응답 처리만 담당하고, 비즈니스 로직은 Service에서 담당해야 하기 때문이다.

기존 코드는 Controller가 Repository를 직접 주입받아 상품 조회 → 주문 생성까지 처리하고 있었고, `@Transactional`도 Controller에 붙어 있었다.

이렇게 되면 비즈니스 로직이 바뀔 때 Controller까지 함께 수정해야 하고, 트랜잭션 경계가 HTTP 레이어까지 열리는 문제가 생긴다.

## 분리 후 각 레이어 역할

| 레이어 | 역할 |
|---|---|
| Controller | HTTP 요청/응답, `@Valid` 검증 |
| Service | 비즈니스 로직, `@Transactional` |
| Repository | DB 접근 (CRUD) |
