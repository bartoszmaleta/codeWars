/*  SQl  */

SELECT

OCTET_LENGTH(CAST(number1 AS varchar))
AS octnum1,

OCTET_LENGTH(CAST(number2 AS varchar))
AS octnum2,

OCTET_LENGTH(CAST(number3 AS varchar))
AS octnum3,

OCTET_LENGTH(CAST(number4 AS varchar))
AS octnum4,

OCTET_LENGTH(CAST(number5 AS varchar))
AS octnum5


FROM numbers
