-- 코드를 입력하세요
SELECT hour(datetime) as hour, count(datetime) as count
from animal_outs
group by hour(datetime)
having hour between 9 and 19
order by hour(datetime);