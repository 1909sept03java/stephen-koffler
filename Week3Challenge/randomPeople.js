window.onload = function () {
document.getElementById("people").addEventListener("click", getPeopleWithFetch); 

/*  function createNode(element) {
    return document.createElement(element); // Create the type of element you pass in the parameters
  }

  function append(parent, el) {
    return parent.appendChild(el); // Append the second parameter(element) to the first one
  }*/
    let ul = document.getElementById('people'); // Get the list where we will place our people
    let state = {people: ''};
   let url = 'https://randomuser.me/api/?results=25'; // Get 25 random users

   function getPeopleWithFetch() {
    fetch(url, {method:"GET", headers:{"Accept":"application/json"}})
        //define behavior for when response returns
        .then((response) => {
            //return unwrapped promise object for the next chained operation
            let data = response.json();
            return data;

          })
          // utilize unwrapped promise as a JS object
          .then((data) => {
              console.log(data);
              state.people = data.people;
              updateContent();
          })

          //what if there's a problem?
        .catch((error) => {
          alert('oh no :(');
          console.log(error);
      });

}