# Kiosk Project

## 프로젝트 소개
이 프로젝트는 **키오스크 시스템**을 구현한 프로젝트입니다. 사용자는 다양한 카테고리에서 메뉴를 선택하고, 각 메뉴 항목에 대한 정보를 확인할 수 있습니다. 카테고리는 **버거**, **음료**, **디저트**로 구분되어 있으며, 사용자는 각 카테고리에서 제공하는 메뉴 항목을 확인하고 선택할 수 있습니다.

이 프로젝트는 **Java** 언어를 사용하여 작성되었으며, 객체 지향 설계를 통해 **캡슐화**와 **모듈화**된 구조로 개발되었습니다.

## 주요 기능
- **메뉴 카테고리 선택**: 사용자는 카테고리(버거, 음료, 디저트)를 선택하여 각 메뉴 항목을 볼 수 있습니다.
- **메뉴 항목 정보**: 각 메뉴 항목에 대한 이름, 가격, 설명을 제공합니다.
- **뒤로가기**: 메뉴 항목을 확인한 후, 이전 카테고리로 돌아갈 수 있습니다.
- **프로그램 종료**: 사용자는 언제든지 프로그램을 종료할 수 있습니다.

## 기술 스택
- **Java 8 이상**
- **객체 지향 설계** (OOP)
- **Java Collections Framework** (List, ArrayList 등)
- **Scanner 클래스**를 사용한 사용자 입력 처리

## 프로젝트 구조
- `Kiosk`: 키오스크 시스템을 실행하는 메인 클래스입니다. 메뉴 카테고리 선택과 메뉴 항목 선택을 처리합니다.
- `Menu`: 각 메뉴 카테고리(버거, 음료, 디저트 등)의 정보를 관리하는 클래스입니다.
- `MenuItem`: 각 메뉴 항목(버거, 음료 등)의 이름, 가격, 설명 등의 정보를 관리하는 클래스입니다.
