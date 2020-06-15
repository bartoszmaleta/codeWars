CREATE FUNCTION agecalculator(date TIMESTAMP)
  RETURNS INTEGER AS
$$
BEGIN
  RETURN (
    SELECT EXTRACT(
      YEAR FROM age(date)
      )
    )::INT;
END;
$$ LANGUAGE plpgsql;


-- ANOTHER OPTION

CREATE FUNCTION agecalculator(age DATE) RETURNS INTEGER AS $$
BEGIN
    return date_part('year', AGE(age));
END
$$ LANGUAGE plpgsql;