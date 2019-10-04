window.onload = function () {



    let ul = document.getElementById('RRs');

    let url = 'http://localhost:8082/ServletDemo/getStaff_RRs'; //can be anything we make up

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
                    row.className = "row";
                    var reimb_id_cell = document.createElement("div");
                    reimb_id_cell.className = "cell";
                    reimb_id_cell.innerText = data[i].reimb_id;
                    row.appendChild(reimb_id_cell);

                    var openDate_cell = document.createElement("div");
                    openDate_cell.className = "cell";
                    openDate_cell.innerText = data[i].openDate;
                    row.appendChild(openDate_cell);

                    var description_cell = document.createElement("div");
                    description_cell.className = "cell";
                    description_cell.innerText = data[i].description;
                    row.appendChild(description_cell);

                    var dollar_amt_cell = document.createElement("div");
                    dollar_amt_cell.className = "cell";
                    dollar_amt_cell.innerText = data[i].dollar_amt;
                    row.appendChild(dollar_amt_cell);

                    var approvedDate_cell = document.createElement("div");
                    approvedDate_cell.className = "cell";
                    approvedDate_cell.innerText = data[i].approvedDate;
                    row.appendChild(approvedDate_cell);

                    var status_cell = document.createElement("div");
                    status_cell.className = "cell";
                    status_cell.innerText = data[i].status;
                    row.appendChild(status_cell);

                    var approve_cell = document.createElement("div");
                    approve_cell.className = "cell";
                    var qs = "reimb_id=" + data[i].reimb_id + "&status=1";
                    approve_cell.innerHTML = "<a href='approve_RRs?" + qs + "'>APPROVE</a>";
                    row.appendChild(approve_cell);

                    var deny_cell = document.createElement("div");
                    deny_cell.className = "cell";
                    qs = "reimb_id=" + data[i].reimb_id + "&status=2";
                    deny_cell.innerHTML = "<a href='approve_RRs?" + qs + "'>DENY</a>";
                    row.appendChild(deny_cell);

                    //is this how to append a field at the end for approval?

                    // var status_cell = document.createElement("div");
                    // status_cell.className = "cell";
                    // status_cell.innerText = data[i].status;
                    // row.appendChild(status_cell);


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