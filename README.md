# JAVA2
# 202330231 채승헌

## 2주차
# Github 용어

---

### Repository
- 파일을 저장하는 공간
- 프로젝트 관리

### Branch 
- 독립적인 작업 공간

---

## 처음 설정
### git init 
- git 초기화
- 현재 폴더를 Git 프로젝트로 만들기

### git add 특정 파일
- 특정 파일을 Git이 추적하도록 추가(스테이징)

### git add .
- 현재 폴더의 모든 파일을 Git에 추가

### 둘의 차이
- git add 특정 파일 **(특정 파일에만 추가)**
- git add . **(모든 파일에 추가)**

---

## 첫 커밋 만들기
### git commit -m "first commit"
- 현재 상태를 첫 저장

---

## Main branch 설정
### git branch -M main
- 기본 브랜치를 main 으로 변경

---

## 이름, 이메일 설정
### git config --global user.name "이름"
- 처음 git을 사용할 때 이름 설정
- 만약 프로젝트마다 다른 이름으로 하고싶다면 --global 빼기

### git config --global user.email "이메일"
- 처음 git을 사용할 때 이메일 설정
- 만약 프로젝트마다 다른 이메일로 하고싶다면 --global 빼기

---

## Github 저장소 연결
### git remote add origin 깃주소
- 원격 저장소 연결

## Github로 업로드
### git push -u origin main(브랜치 이름)

---

## 코드 수정 후 업로드 정리

```bash
git add .
git commit -m "수정 이유"
git push
```

- 직접 수정 이유를 적고 커밋 버튼을 누르고 업로드도 가능

---

## Github 깔끔하게 하는 법
### # 글씨
- '#' 개수가 많아질 수록 글씨 크기가 작아짐

### * 글씨 *
- 기울어진 글씨

### ** 글씨 **
- 글씨 굵게 만들기

### '*** 글씨 ***
- 글씨 굵고 기울게 만들기

### - 내용
- 작은 원 리스트

### ---  
- 구분선
- 내용 구분할 때 씀

###  ` 
- 코드처럼 보이게 강조

### ```
- 여러 줄 코드
- 예시
```bash
git add .
git commit -m "수정 이유"
git push
```