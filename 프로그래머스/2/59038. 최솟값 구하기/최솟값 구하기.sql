SELECT
    datetime as 시간
from animal_ins
order by datetime 
fetch first row only;