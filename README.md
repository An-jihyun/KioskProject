Java Console Kiosk
카테고리 구조와 캡슐화 원칙을 적용하여 Java 객체지향 설계 방식으로 구현

## 주요 기능

### Lv1~3: 기본 흐름 및 메뉴 선택
- 햄버거 메뉴 리스트 출력
- 번호 입력으로 메뉴 선택
- 0 입력 시 종료

### Lv4: 카테고리별 메뉴 분리
- `List<Menu>` 기반 다중 카테고리 메뉴 구성
- 상위 메뉴 선택 → 해당 카테고리의 항목 출력
- 0 입력 시 뒤로가기 기능

### Lv5: 캡슐화 적용
- 모든 클래스의 필드 `private` 선언
- `getter/setter` 메서드로 데이터 접근 제어
- 설계 안정성 향상

---

## 클래스 구조
Main.java → 실행 진입점
Kiosk.java → 전체 흐름 제어 (메뉴 선택, 뒤로가기 등)
Menu.java → 카테고리 메뉴 객체 (이름 + 항목 목록)
MenuItem.java → 실제 항목 객체 (이름, 가격, 설명)

---

## 실행 예시

[ MAIN MENU ]

Burgers

Drinks

Desserts

종료 | 종료

-> 1

---
[ BURGERS MENU ]

ShackBurger | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거

SmokeShack | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거

Cheeseburger | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거

뒤로가기

-> 2

선택한 메뉴: SmokeShack | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거


