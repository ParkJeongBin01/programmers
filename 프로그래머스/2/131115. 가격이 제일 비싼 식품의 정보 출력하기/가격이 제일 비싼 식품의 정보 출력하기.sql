-- 코드를 입력하세요
# 방법 1. 최고 가격 상품 한 행만 가져오고 싶을 때
# SELECT *
# FROM FOOD_PRODUCT
# ORDER BY PRICE DESC
# LIMIT 1;

# 방법 2. 최고 가격이 같은 상품을 모두 가져오고 싶을 때
SELECT *
FROM FOOD_PRODUCT
WHERE PRICE = (
                SELECT MAX(PRICE)
                FROM FOOD_PRODUCT
                );