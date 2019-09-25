window.onload = function () {
    document.getElementById("getidinfo").onclick = getUserInfoWithFetch;
    console.log("I'm here!");

};
let url = "http://localhost:8082/ServletDemo/session";



function getUserInfoWithFetch() {
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
            document.getElementById("id").innerText = data.id;

            document.getElementById("firstname").innerText = data.firstname;
            document.getElementById("lastname").innerText = data.lastname;
            //

        })
        .catch((error) => {
            alert('oh no :(');
            console.log(error);
        })
}

