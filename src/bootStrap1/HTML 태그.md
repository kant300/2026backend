## 📘 HTML 태그 정리

### 📄 1. 문서 구조 및 레이아웃 관련 태그

| 태그          | 영단어        | 뜻 (설명)                 |
| ----------- | ---------- | ---------------------- |
| `<html>`    | HTML       | HTML 문서의 루트 요소         |
| `<head>`    | Head       | 문서의 메타데이터 영역           |
| `<title>`   | Title      | 문서 제목 (브라우저 탭에 표시됨)    |
| `<body>`    | Body       | 실제 페이지의 본문 콘텐츠 영역      |
| `<header>`  | Header     | 머리말(헤더) 영역             |
| `<footer>`  | Footer     | 바닥글(푸터) 영역             |
| `<main>`    | Main       | 문서의 핵심 콘텐츠             |
| `<section>` | Section    | 문서 내 주제별 구역            |
| `<article>` | Article    | 독립된 콘텐츠 블록 (기사, 블로그 등) |
| `<aside>`   | Aside      | 보조 콘텐츠 (광고, 관련 링크 등)   |
| `<nav>`     | Navigation | 내비게이션(메뉴) 영역           |
| `<div>`     | Division   | 구역을 나누는 일반적인 블록 요소     |
| `<span>`    | Span       | 인라인 요소로 텍스트의 일부를 감쌈    |

### 📝 2. 텍스트 및 문단 관련 태그

| 태그             | 영단어               | 뜻 (설명)               |
| -------------- | ----------------- | -------------------- |
| `<h1>`\~`<h6>` | Heading           | 제목 태그 (`<h1>`이 가장 큼) |
| `<p>`          | Paragraph         | 문단(단락)               |
| `<br>`         | Line Break        | 줄바꿈                  |
| `<hr>`         | Horizontal Rule   | 수평선                  |
| `<strong>`     | Strong            | 텍스트 강조 (굵게)          |
| `<em>`         | Emphasis          | 강조 (기울임)             |
| `<small>`      | Small             | 작은 텍스트로 표시           |
| `<mark>`       | Mark              | 강조 표시 (형광펜처럼 표시)     |
| `<abbr>`       | Abbreviation      | 약어의 전체 뜻 표시          |
| `<cite>`       | Citation          | 인용문 출처               |
| `<blockquote>` | Block Quote       | 긴 인용문                |
| `<q>`          | Quote             | 짧은 인라인 인용문           |
| `<code>`       | Code              | 코드 조각                |
| `<pre>`        | Preformatted Text | 서식 유지 텍스트            |
| `<kbd>`        | Keyboard          | 키보드 입력               |
| `<samp>`       | Sample Output     | 프로그램 출력 예시           |
| `<var>`        | Variable          | 변수명 강조               |
| `<sup>`        | Superscript       | 위 첨자 (ex: 제곱)        |
| `<sub>`        | Subscript         | 아래 첨자 (ex: 화학식)      |
| `<ins>`        | Insert            | 삽입된 텍스트 (밑줄)         |
| `<del>`        | Delete            | 삭제된 텍스트 (취소선)        |


### 🔗 3. 링크 및 미디어 관련 태그

| 태그         | 영단어          | 뜻 (설명)               |
| ---------- | ------------ | -------------------- |
| `<a>`      | Anchor       | 하이퍼링크 생성             |
| `<img>`    | Image        | 이미지 삽입               |
| `<video>`  | Video        | 비디오 삽입               |
| `<audio>`  | Audio        | 오디오 삽입               |
| `<source>` | Source       | 비디오/오디오 소스 정의        |
| `<track>`  | Track        | 자막 및 설명 트랙           |
| `<iframe>` | Inline Frame | 다른 문서를 현재 문서에 삽입     |
| `<map>`    | Map          | 이미지 맵 정의             |
| `<area>`   | Area         | 이미지 맵의 영역 정의         |
| `<object>` | Object       | 멀티미디어 객체 삽입          |
| `<embed>`  | Embed        | 외부 콘텐츠 삽입 (예: 플래시 등) |


### 🧾 4. 목록 및 표 관련 태그

| 태그           | 영단어                | 뜻 (설명)           |
| ------------ | ------------------ | ---------------- |
| `<ul>`       | Unordered List     | 순서 없는 목록 (점 목록)  |
| `<ol>`       | Ordered List       | 순서 있는 목록 (번호 목록) |
| `<li>`       | List Item          | 목록 항목            |
| `<dl>`       | Description List   | 설명 목록            |
| `<dt>`       | Definition Term    | 설명 항목 제목         |
| `<dd>`       | Definition Details | 설명 항목 내용         |
| `<table>`    | Table              | 표 생성             |
| `<tr>`       | Table Row          | 표의 행             |
| `<td>`       | Table Data         | 표의 셀 (데이터)       |
| `<th>`       | Table Header       | 표의 제목 셀          |
| `<thead>`    | Table Head         | 표의 머리글 그룹        |
| `<tbody>`    | Table Body         | 표의 본문 그룹         |
| `<tfoot>`    | Table Foot         | 표의 바닥글 그룹        |
| `<caption>`  | Caption            | 표의 제목            |
| `<col>`      | Column             | 표의 열 정의          |
| `<colgroup>` | Column Group       | 열 그룹 정의          |

### ** 🧑‍💻 5. 폼(Form) 관련 태그 **

| 태그           | 영단어          | 뜻 (설명)           |
| ------------ | ------------ | ---------------- |
| `<form>`     | Form         | 사용자 입력 폼 정의      |
| `<input>`    | Input        | 사용자 입력 필드        |
| `<label>`    | Label        | 입력 필드 라벨         |
| `<textarea>` | Textarea     | 여러 줄 텍스트 입력 필드   |
| `<button>`   | Button       | 버튼 생성            |
| `<select>`   | Select       | 드롭다운 목록          |
| `<option>`   | Option       | 드롭다운 항목          |
| `<optgroup>` | Option Group | 옵션 그룹화           |
| `<fieldset>` | Fieldset     | 관련 필드를 그룹화       |
| `<legend>`   | Legend       | `<fieldset>`의 제목 |
| `<datalist>` | Data List    | 자동 완성 입력 옵션 리스트  |
| `<output>`   | Output       | 계산 결과나 출력값 표시    |

### ⚙️ 6. 스크립트 및 스타일 관련 태그

| 태그           | 영단어       | 뜻 (설명)                   |
| ------------ | --------- | ------------------------ |
| `<style>`    | Style     | CSS 스타일 정의               |
| `<link>`     | Link      | 외부 CSS 파일 등 연결           |
| `<script>`   | Script    | 자바스크립트 코드 포함             |
| `<noscript>` | No Script | 스크립트 미지원 환경에서 보여질 내용     |
| `<meta>`     | Meta      | 문서의 메타데이터 정의 (문자셋, 설명 등) |
| `<base>`     | Base      | 기본 URL 설정                |

### 🎨 7. 그래픽 관련 태그

| 태그         | 영단어                      | 뜻 (설명)                    |
| ---------- | ------------------------ | ------------------------- |
| `<canvas>` | Canvas                   | 스크립트 기반 그래픽 (2D/3D) 그림 공간 |
| `<svg>`    | Scalable Vector Graphics | 벡터 이미지 정의                 |
| `<path>`   | Path                     | SVG의 경로 정의                |
| `<circle>` | Circle                   | SVG 원 그리기                 |
| `<rect>`   | Rectangle                | SVG 사각형 그리기               |

### ** 📥 8.   `<input>` 태그의 type 속성 정리 **

| 타입 (`type`)      | 의미 (영단어)                       | 설명                       |
| ---------------- | ------------------------------ |--------------------------|
| `text`           | Text                           | 일반적인 한 줄 텍스트 입력          |
| `password`       | Password                       | 비밀번호 입력 (문자가 ●로 표시됨)     |
| `email`          | Email                          | 이메일 형식(@) 입력 (유효성 검사 포함) |
| `number`         | Number                         | 숫자 입력 (스핀 버튼 포함 가능)      |
| `tel`            | Telephone                      | 전화번호 입력 (형식 검사는 없음)      |
| `url`            | URL (Uniform Resource Locator) | 웹 주소 입력 (유효성 검사 포함)      |
| `search`         | Search                         | 검색창 스타일 입력               |
| `date`           | Date                           | 날짜 선택 (달력 위젯)            |
| `time`           | Time                           | 시간 선택 위젯                 |
| `datetime-local` | DateTime Local                 | 날짜 + 시간 (지역 시간 기준)       |
| `month`          | Month                          | 연도 + 월 선택                |
| `week`           | Week                           | 연도 + 주 선택                |
| `checkbox`       | Checkbox                       | 체크박스 (다중 선택 가능)          |
| `radio`          | Radio                          | 라디오 버튼 (그룹 중 하나 선택)      |
| `range`          | Range (Slider)                 | 슬라이더 형태의 범위 입력           |
| `file`           | File Upload                    | 파일 업로드 입력                |
| `hidden`         | Hidden                         | 사용자에게 보이지 않는 값 전달용       |
| `submit`         | Submit                         | 폼 전송 버튼                  |
| `reset`          | Reset                          | 폼 초기화 버튼                 |
| `button`         | Button                         | 일반 버튼 (자바스크립트 등과 함께 사용)  |
| `color`          | Color Picker                   | 색상 선택기 표시 (팔레트 제공)       |
| `image`          | Image Button                   | 이미지를 버튼처럼 사용하여 폼 전송      |
