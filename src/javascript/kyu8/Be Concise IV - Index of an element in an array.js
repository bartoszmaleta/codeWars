function find(a, e) {
  let i = a.indexOf(e);
  return i > -1 ? i : 'Not found';
}

// SECOND SOLUTION
const find = (a, e) => (e = a.indexOf(e)) < 0 ? 'Not found' : e;
