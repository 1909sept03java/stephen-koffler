window.onload = function () {

    console.log("I'm here!");

    let url = "http://localhost:8082/ServletDemo/session";
    console.log("I'm here!");
    fetch(url, { method: "GET", headers: { "Accept": "application/json" } })

        //        //define behavior for when response returns
        .then((response) => {
            //        //return unwrapped promise object for the next chained operation
            let data = response.json();

            console.log(data);
            return data;

        })

        .then((data) => {
            console.log(data);
            //            //var userinfo = data.results;
            if (data.isManager == 1) {
                document.getElementById("mgrstatus").innerText = "Manager's HomePage";
                var li = document.createElement("li");
                li.innerHTML = <a href='Review_Staff_RRs'>Review, Approve, or Deny Expense Reports of your Staff    </a>
                document.getElementById("viewstatus").append(li);
            }
            else
                document.getElementById("mgrstatus").innerText = "Employee's HomePage";

            document.getElementById("id").innerText = data.id;

            document.getElementById("firstname").innerText = data.firstname;
            document.getElementById("lastname").innerText = data.lastname;
            //

        })
        .catch((error) => {
            alert('oh no :(');
            console.log(error);
        })

};
