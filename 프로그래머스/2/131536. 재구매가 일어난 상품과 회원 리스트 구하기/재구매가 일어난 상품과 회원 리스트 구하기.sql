-- 코드를 입력하세요
SELECT
    USER_ID,PRODUCT_ID
from ONLINE_SALE
group by USER_ID,PRODUCT_ID
having count(*)>=2  #재구매한 회원이니까 위에서 만든 그룹에 대한 조건임 
order by USER_ID, PRODUCT_ID desc;