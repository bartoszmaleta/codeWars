function shark(pontoonDistance, sharkDistance, youSpeed, sharkSpeed, dolphin){
    if (dolphin) {
        sharkSpeed = sharkSpeed / 2;
    }
    let timePonton = pontoonDistance / youSpeed;
    let timeShark = sharkDistance / sharkSpeed;
    if (timePonton > timeShark) {
        return 'Shark Bait!'
    } else {
        return 'Alive!';
    }
}

// SECOND SOLUTION
function shark(pontoonDistance, sharkDistance, youSpeed, sharkSpeed, dolphin){
  if(dolphin){
    sharkSpeed /= 2;
  }
  return (pontoonDistance / youSpeed) > (sharkDistance / sharkSpeed) ? 'Shark Bait!' : 'Alive!';
}