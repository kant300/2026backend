## 📄 CSS 주요 속성 정리표

| 주제               | 명령 (속성)                          | 내용 (설명)                                      | 예시                                  |
| ---------------- | -------------------------------- | -------------------------------------------- | ----------------------------------- |
| **박스 모델**        | `width`, `height`                | 요소의 너비와 높이 지정                                | `width: 100px; height: 50px;`       |
|                  | `margin`                         | 요소 바깥 여백 설정                                  | `margin: 10px 5px;`                 |
|                  | `padding`                        | 요소 안쪽 여백 설정                                  | `padding: 20px;`                    |
|                  | `border`                         | 테두리 스타일, 두께, 색상 지정                           | `border: 1px solid black;`          |
| **텍스트**          | `color`                          | 글자 색상 지정                                     | `color: #333;`                      |
|                  | `font-size`                      | 글자 크기 지정                                     | `font-size: 16px;`                  |
|                  | `font-weight`                    | 글자 굵기 지정 (normal, bold 등)                    | `font-weight: bold;`                |
|                  | `text-align`                     | 텍스트 정렬 (left, center, right)                 | `text-align: center;`               |
|                  | `line-height`                    | 줄 높이 지정                                      | `line-height: 1.5;`                 |
| **배경**           | `background-color`               | 배경 색상 지정                                     | `background-color: #f0f0f0;`        |
|                  | `background-image`               | 배경 이미지 지정                                    | `background-image: url('img.jpg');` |
|                  | `background-size`                | 배경 이미지 크기 조절                                 | `background-size: cover;`           |
| **레이아웃**         | `display`                        | 요소 표시 방식 설정 (block, inline, flex 등)          | `display: flex;`                    |
|                  | `position`                       | 위치 지정 방식 (static, relative, absolute, fixed) | `position: absolute;`               |
|                  | `top`, `left`, `right`, `bottom` | 위치 오프셋 지정                                    | `top: 10px; left: 20px;`            |
|                  | `float`                          | 요소를 좌우로 띄우기                                  | `float: right;`                     |
|                  | `clear`                          | float 해제                                     | `clear: both;`                      |
| **플렉스박스**        | `flex-direction`                 | 축 방향 설정 (row, column)                        | `flex-direction: row;`              |
|                  | `justify-content`                | 주 축 정렬 (flex-start, center, space-between)   | `justify-content: center;`          |
|                  | `align-items`                    | 교차 축 정렬                                      | `align-items: flex-start;`          |
|                  | `flex-wrap`                      | 줄 바꿈 설정 (nowrap, wrap)                       | `flex-wrap: wrap;`                  |
| **테두리 & 그림자**    | `border-radius`                  | 둥근 모서리 설정                                    | `border-radius: 10px;`              |
|                  | `box-shadow`                     | 박스 그림자 설정                                    | `box-shadow: 2px 2px 5px gray;`     |
| **트랜지션 & 애니메이션** | `transition`                     | 속성 변화 애니메이션 효과 지정                            | `transition: all 0.3s ease;`        |
|                  | `animation`                      | 키프레임 기반 애니메이션 적용                             | `animation: slidein 2s forwards;`   |
| **기타**           | `opacity`                        | 투명도 조절 (0\~1)                                | `opacity: 0.5;`                     |
|                  | `z-index`                        | 쌓임 순서 지정 (positioned 요소에 적용)                 | `z-index: 10;`                      |

```
/* 박스 모델 */
.box {
  width: 200px;
  height: 100px;
  margin: 20px auto;
  padding: 15px;
  border: 2px solid #333;
}

/* 텍스트 스타일 */
.text {
  color: #0055cc;
  font-size: 18px;
  font-weight: bold;
  text-align: center;
  line-height: 1.4;
}

/* 배경 설정 */
.background {
  background-color: #f9f9f9;
  background-image: url('background.jpg');
  background-size: cover;
}

/* 레이아웃 */
.layout {
  display: flex;
  position: relative;
  top: 10px;
  left: 20px;
}

/* 플렉스박스 */
.flex-container {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
  flex-wrap: wrap;
}

/* 테두리와 그림자 */
.card {
  border-radius: 12px;
  box-shadow: 0 4px 6px rgba(0,0,0,0.1);
  padding: 20px;
  background-color: white;
}

/* 트랜지션과 애니메이션 */
.button {
  transition: background-color 0.3s ease;
  background-color: #007bff;
  color: white;
  padding: 10px 15px;
  border: none;
  border-radius: 6px;
  cursor: pointer;
}
.button:hover {
  background-color: #0056b3;
}

/* 기타 */
.overlay {
  opacity: 0.8;
  position: fixed;
  z-index: 1000;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background-color: black;
}
```