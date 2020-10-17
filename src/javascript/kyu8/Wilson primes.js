const factorial = number => {
  if (number < 0) return -1
  if (number === 0) return 1

  return number * factorial(number - 1)
}

const amIWilson = p => Number.isInteger((factorial(p - 1) + 1) / (p * p))