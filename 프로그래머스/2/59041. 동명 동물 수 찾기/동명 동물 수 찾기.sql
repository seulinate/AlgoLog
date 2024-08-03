select
    name,
    count(name) as count
from ANIMAL_INS 
group by name
having count(name) >=2 --2번 이상 이름이 사용된 경우 
order by name;