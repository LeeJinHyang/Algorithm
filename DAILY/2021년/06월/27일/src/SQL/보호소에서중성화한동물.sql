-- 코드를 입력하세요
SELECT ins.animal_id, ins.animal_type, ins.name
from animal_ins ins inner join animal_outs outs
on ins.animal_id = outs.animal_id
where ins.SEX_UPON_INTAKE like "Intact %"
and (outs.SEX_UPON_OUTCOME like "spayed %" or outs.SEX_UPON_OUTCOME like "neutered %")
order by ins.animal_id;