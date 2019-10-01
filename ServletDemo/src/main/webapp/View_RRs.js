window.onload = function () {



    let ul = document.getElementById('RRs');

    let url = 'http://localhost:8082/ServletDemo/get_RRs';

    getRRlist();

    function getRRlist() {
        fetch(url, { method: "GET", headers: { "Accept": "application/json" } })
            //define behavior for when response returns
            .then((response) => {
                //return unwrapped promise object for the next chained operation
                let data = response.json();
                return data;

            })
            // utilize unwrapped promise as a JS object
            .then((data) => {

                for (var i = 0; i < data.length; i++) {
                    //var holder = "";
                    console.log(data[i]);
                    var row = document.createElement("div");
                    var reimb_id_cell = document.createElement("div");
                    reimb_id_cell.innerText = data[i].reimb_id;
                    row.appendChild(reimb_id_cell);


                    var row = document.createElement("div");
                    var openDate_cell = document.createElement("div");
                    openDate_cell.innerText = data[i].openDate;
                    row.appendChild(openDate_cell);

                    // holder = holder + data[i].openDate
                    // holder = holder + data[i].description;
                    // holder = holder + data[i].dollar_amt;
                    // holder = holder + data[i].status;
                    // holder = holder + data[i].approvedDate;

                    document.getElementById("RRs").appendChild(row);

                }

            })

            //what if there's a problem?
            .catch((error) => {
                alert('oh no :(');
                console.log(error);
            });

    }
};