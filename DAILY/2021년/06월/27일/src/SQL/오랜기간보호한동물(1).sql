-- 코드를 입력하세요
SELECT ins.name, ins.datetime
from animal_ins ins left join animal_outs outs
on ins.animal_id = outs.animal_id
where ins.animal_id is not null and outs.animal_id is null
order by ins.datetime
limit 3;