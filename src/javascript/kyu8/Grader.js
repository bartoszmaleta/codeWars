function grader(score) {
    if (score > 1 || score < 0.6) {
      return 'F';
      } else if (score >= 0.9) {
        return 'A';
      } else if (score >= 0.8) {
        return 'B';
      } else if (score >= 0.7) {
        return 'C';
      } else {
        return 'D';
      };

};


// ANTOHER SOLUTIONs

grader = s => s > 1 || s < 0.6 ? 'F' : s < 0.7 ? 'D' : s < 0.8 ? 'C' : s < 0.9 ? 'B' : 'A';