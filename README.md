# store_manager
서로 다른 매장의 상품 정보 갱신   
Java11, Springboot, gradle, JPA, Lombok, Querydsl, mysql 사용   
StoreItem을 상속하는 Store01, Store02를 사용하여 store_item 테이블에 검색 / 삽입 / 갱신을 한다.   
DB이름 및 계정 정보는 application.yaml에 정의   
사용 예 : http://localhost:8080/api/v1/updatestoredata?productName=productA   
삽입/갱신 후 전체 상품 정보를 json 형태로 출력   
