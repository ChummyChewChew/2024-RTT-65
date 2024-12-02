document.addEventListener("DOMContentLoaded", function() {
    let coinForm = document.getElementById("coinForm");
    let flipCounterInput = document.getElementById("flipCount");
    let resultTable = document.getElementById("resultTable")
    let sound = document.getElementById("coinsound");
    let FLIP = document.getElementById("COIN");//Getting all my inputs from dom

    function flipCoin() {
        return Math.random() < 0.5 ? "Heads" : "Tails"//using ternary operator for if else lables below .5 as heads
        //and above as tails

    }

    coinForm.addEventListener("submit", (event) => {//Using a event listeners to kickstart
        //code instead of a function being called on event
        event.preventDefault();//stops page from refreshing on submit
        let flipCount = parseInt(flipCounterInput.value);//getting the num from flipcounter
        resultTable.innerHTML = "";//clearing table
        sound.play();
        FLIP.style.display = "flex";//playing sound and gif

        setTimeout(function () {
            FLIP.style.display = "none";//makes gif invisible after 2 seconds


            for (let i = 1; i <= flipCount; i++) {//Making a new row and cells for each flip coin method and populating them
                let newRow = resultTable.insertRow();
                let cell1 = newRow.insertCell(0);
                let cell2 = newRow.insertCell(1);

                cell1.textContent = i;
                cell2.textContent = flipCoin();
            }
        }, 2000);//two seconds
    })
})
