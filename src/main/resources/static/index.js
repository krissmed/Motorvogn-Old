let utTabell = document.getElementById("utTabell");
let antallrader = 0;
let personnummer;
let navn;
let adresse;
let kjennetegn;
let bilmerke;
let biltype;



function registrer() {
    //feilhandering();
    personnummer = $("#personnummer").val();
    navn = $("#navn").val();
    adresse = $("#adresse").val();
    kjennetegn = $("#kjennetegn").val();
    bilmerke = $("#bilmerke").val();
    biltype = $("#biltype").val();
    let motorvogn = {
        personnummer: personnummer,
        navn: navn,
        adresse: adresse,
        kjennetegn: kjennetegn,
        bilmerke: bilmerke,
        biltype: biltype
    };
    const url = "/motorvogn";
    $.post(url, motorvogn, function(data){
        console.log(data)
        for (i = 1; i < antallrader + 1;) {
            utTabell.deleteRow(i);
            antallrader--;
        }
        for (i in data) {
            let nyrad = utTabell.insertRow(1);
            antallrader++;
            console.log("Antall rader: " + antallrader);
            let nycelle0 = nyrad.insertCell(0)
            nycelle0.innerHTML = data[i].personnummer;

            let nycelle1 = nyrad.insertCell(1);
            nycelle1.innerHTML = data[i].navn;

            let nycelle2 = nyrad.insertCell(2);
            nycelle2.innerHTML = data[i].adresse;

            let nycelle3 = nyrad.insertCell(3);
            nycelle3.innerHTML = data[i].kjennetegn;

            let nycelle4 = nyrad.insertCell(4);
            nycelle4.innerHTML = data[i].bilmerke;

            let nycelle5 = nyrad.insertCell(5);
            nycelle5.innerHTML = data[i].biltype;
        }
    });
}