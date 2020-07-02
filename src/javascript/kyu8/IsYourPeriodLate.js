function periodIsLate(last, today, cycleLength)
{
    return (today - last) / 86400000 > cycleLength;
}

function periodIsLate(last, today, cycleLength)
{
    let daysSinceLastPeriod = (today.getTime() - last.getTime()) / 86 400 000;

    if (daysSinceLastPeriod > cycleLength) {
        return true;
    }
    return false;
}