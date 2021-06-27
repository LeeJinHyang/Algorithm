-- 코드를 입력하세요
SELECT outs.animal_id, outs.name
from animal_ins ins right join animal_outs outs
on ins.animal_id = outs.animal_id
where ins.animal_id is null and outs.animal_id is not null
order by animal_id;