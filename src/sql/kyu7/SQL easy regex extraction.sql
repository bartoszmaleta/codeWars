ALTER TABLE greetings DROP COLUMN id;
ALTER TABLE greetings ADD COLUMN user_id varchar(12);
UPDATE greetings SET user_id = substring(greetings.greeting, '#([0-9]+)');
SELECT * FROM greetings;


--ANOTHER SOLUTION

select
  name,
  greeting,
  substring(greeting, '#(\d+)') as user_id
from greetings;