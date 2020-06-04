-- i choose you! --
SELECT
pokemon.pokemon_name,

pokemon.str * multipliers.multiplier
AS modifiedStrength,
multipliers.element

FROM pokemon
INNER JOIN multipliers
ON pokemon.element_id = multipliers.id

WHERE
pokemon.str * multipliers.multiplier >= 40

ORDER BY modifiedStrength DESC



-----------------------------------
SELECT
p.pokemon_name,

p.str * m.multiplier
AS modifiedStrength,
m.element

FROM pokemon p
INNER JOIN multipliers m
ON p.element_id = m.id

WHERE
p.str * m.multiplier >= 40

ORDER BY modifiedStrength DESC
