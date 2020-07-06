class Ship {
    constructor(draft,crew) {
        this.draft = draft;
        this.crew = crew;
    }

    isWorthIt() {
        let crewUnits = 1.5 * this.crew;
        console.log(crewUnits);
        return (this.draft - crewUnits) > 20;
    }
}

function Ship2(draft,crew) {
    this.draft = draft;
    this.crew = crew;
    this.isWorthIt = function(){return this.draft-(this.crew*1.5)>20}
}