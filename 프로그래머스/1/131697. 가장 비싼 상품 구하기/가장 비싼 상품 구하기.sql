-- 코드를 입력하세요
SELECT
    price as max_price
from product
order by price desc
fetch first row only;