import { Component, OnInit } from '@angular/core';
import { Router, Route } from '@angular/router';
import { HttpClient, HttpHeaders } from '@angular/common/http';
@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  constructor(private router: Router, private http: HttpClient) { }

  display(book) {

    var tbl = document.createElement('table');
    tbl.style.width = '100%';
    var tbdy = document.createElement('tbody');

    length = book.length;
    for (var i = 0; i < length + 1; i++) {
      var tr = tbl.insertRow();
      for (var j = 0; j < 7; j++) {
        var td = tr.insertCell();

        if (i == 0 && j == 0)
          td.appendChild(document.createTextNode('Internal ID'));
        else if (i == 0 && j == 1)
          td.appendChild(document.createTextNode('Title'));
        else if (i == 0 && j == 2)
          td.appendChild(document.createTextNode('Author'));
        else if (i == 0 && j == 3)
          td.appendChild(document.createTextNode('ISBN 13'));
        else if (i == 0 && j == 4)
          td.appendChild(document.createTextNode('Publisher'));
        else if (i == 0 && j == 5)
          td.appendChild(document.createTextNode('Page'));
        else if (i == 0 && j == 6)
          td.appendChild(document.createTextNode('Status'));
        else if (i != 0 && j == 0)
          td.appendChild(document.createTextNode(book[i - 1].id));
        else if (i != 0 && j == 1)
          td.appendChild(document.createTextNode(book[i - 1].name));
        else if (i != 0 && j == 2)
          td.appendChild(document.createTextNode(book[i - 1].author));
        else if (i != 0 && j == 3)
          td.appendChild(document.createTextNode(book[i - 1].isbn13));
        else if (i != 0 && j == 4)
          td.appendChild(document.createTextNode(book[i - 1].publisher));
        else if (i != 0 && j == 5)
          td.appendChild(document.createTextNode(book[i - 1].page));
        else if (i != 0 && j == 6) {
          if (book[i - 1].userid === 0)
            td.appendChild(document.createTextNode("In"));
          else
            td.appendChild(document.createTextNode("Out"));
        }
        //    td.style.border = '1px solid black';
        document.getElementById("bottom").innerHTML = "";
        document.getElementById("bottom").appendChild(tbl);
      }
    }



  }

  mydisplay(book) {

    var tbl = document.createElement('table');
    tbl.style.width = '100%';
    var tbdy = document.createElement('tbody');

    length = book.length;
    for (var i = 0; i < length + 1; i++) {
      var tr = tbl.insertRow();
      for (var j = 0; j < 7; j++) {
        var td = tr.insertCell();

        if (i == 0 && j == 0)
          td.appendChild(document.createTextNode('Internal ID'));
        else if (i == 0 && j == 1)
          td.appendChild(document.createTextNode('Title'));
        else if (i == 0 && j == 2)
          td.appendChild(document.createTextNode('Author'));
        else if (i == 0 && j == 3)
          td.appendChild(document.createTextNode('ISBN 13'));
        else if (i == 0 && j == 4)
          td.appendChild(document.createTextNode('Publisher'));
        else if (i == 0 && j == 5)
          td.appendChild(document.createTextNode('Page'));
        else if (i == 0 && j == 6)
          td.appendChild(document.createTextNode('Return Date'));
        else if (i != 0 && j == 0)
          td.appendChild(document.createTextNode(book[i - 1].id));
        else if (i != 0 && j == 1)
          td.appendChild(document.createTextNode(book[i - 1].name));
        else if (i != 0 && j == 2)
          td.appendChild(document.createTextNode(book[i - 1].author));
        else if (i != 0 && j == 3)
          td.appendChild(document.createTextNode(book[i - 1].isbn13));
        else if (i != 0 && j == 4)
          td.appendChild(document.createTextNode(book[i - 1].publisher));
        else if (i != 0 && j == 5)
          td.appendChild(document.createTextNode(book[i - 1].page));
        else if (i != 0 && j == 6) {
          var d = new Date(book[i - 1].returndate);
          td.appendChild(document.createTextNode(d.toDateString()));
        }
        //    td.style.border = '1px solid black';
        document.getElementById("view").innerHTML = "";
        document.getElementById("view").appendChild(tbl);
      }
    }



  }

  ngOnInit() {

    var DATA = JSON.parse(sessionStorage.getItem('user'));
    var view = document.getElementById("view");
    var bottom = document.getElementById("bottom");
    console.log(DATA);
    document.getElementById("h").append("Welcome " + DATA.firstname);
    if (DATA.superuser === 1)
      document.getElementById("librarian").style.display = "block";
    else
      document.getElementById("librarian").style.display = "none";

    document.getElementById("pro").addEventListener("click", () => {
      view.innerHTML = "";
      view.innerHTML += ("Your Profile <br> Name: " + DATA.firstname + " " + DATA.lastname + "<br>Email: " + DATA.email +
        "<br>Username: " + DATA.username + "<br>Library Id: " + DATA.id + "<br>Borrow Count: " + DATA.bookborrowed

      );

    })

    document.getElementById("change").addEventListener("click", () => {
      view.innerHTML = "Changing Profile<br>First Name: ";
      bottom.hidden=true;
      var i1 = document.createElement("input"); //input element, text
      i1.setAttribute('type', "text");
      i1.setAttribute('value', DATA.firstname);
      i1.setAttribute("id", "newfirst");
      var s1 = document.createElement("input"); //input element, Submit button

      view.append(i1);


      view.innerHTML += ("<br>Last Name: ")
      var i2 = document.createElement("input"); //input element, text
      i2.setAttribute('type', "text");
      i2.setAttribute('value', DATA.lastname);
      i2.setAttribute("id", "newlast");
      var s2 = document.createElement("input"); //input element, Submit button

      view.append(i2);

      view.innerHTML += ("<br>E-Mail:      ")
      var i3 = document.createElement("input"); //input element, text
      i3.setAttribute('type', "text");
      i3.setAttribute('value', DATA.email);
      i3.setAttribute("id", "newemail");

      view.append(i3);
      view.innerHTML += "<br>";
      var s3 = document.createElement("input"); //input element, Submit button
      s3.setAttribute("id", "update");
      s3.setAttribute('type', "button");
      s3.setAttribute('value', "Submit");
      view.append(s3);

      document.getElementById("update").addEventListener('click', () => {
        let fn = <HTMLInputElement>document.getElementById("newfirst");
        let ln = <HTMLInputElement>document.getElementById("newlast");
        let em = <HTMLInputElement>document.getElementById("newemail");
        DATA.firstname = fn.value;
        DATA.lastname = ln.value;
        DATA.email = em.value;
        //console.log(<JSON>DATA);

        var url = 'http://localhost:8082/LibraryWebSystem/libr/update';
        var http = new XMLHttpRequest();
        http.open('PUT', url, true);
        // alert("here");
        http.setRequestHeader('Content-type', 'application/json');
        http.onreadystatechange = () => {
          if (http.readyState == 4 && http.status == 200) {
            alert('Update Success')
            this.router.navigateByUrl("/profile");
          }
        }
        http.send(JSON.stringify(DATA));
        document.getElementById("h").innerHTML = ("Welcome " + DATA.firstname);

      })


    })

    document.getElementById("search").addEventListener("click", () => {
      view.innerHTML = "";
     // bottom.innerHTML = "";
     bottom.hidden=false;
      view.innerHTML = "Search Book by Following Criteria<br>Search by Title: <br>";

      //Search by Name Button Creator
      var i1 = document.createElement("input"); //input element, text
      i1.setAttribute('type', "text");
      i1.setAttribute('name', "title");
      i1.setAttribute("id", "id_title");
      var s1 = document.createElement("input"); //input element, Submit button
      s1.setAttribute("id", "search_title");
      s1.setAttribute('type', "button");
      s1.setAttribute('value', "Submit");
      view.append(i1);
      view.append(s1);
      view.innerHTML += ("<br>Search by Author:<br>")
      //Search by ID Button Creator
      var i2 = document.createElement("input"); //input element, text
      i2.setAttribute('type', "text");
      i2.setAttribute('name', "author");
      i2.setAttribute("id", "id_author");
      var s2 = document.createElement("input"); //input element, Submit button
      s2.setAttribute("id", "search_author");
      s2.setAttribute('type', "button");
      s2.setAttribute('value', "Submit");
      view.append(i2);
      view.append(s2);
      view.innerHTML += "<br>Search by Tag: <br>"
      //Search by ISBN Button Creator
      var i3 = document.createElement("input"); //input element, text
      i3.setAttribute('type', "text");
      i3.setAttribute('name', "tag");
      i3.setAttribute("id", "id_tag");
      var s3 = document.createElement("input"); //input element, Submit button
      s3.setAttribute("id", "search_tag");
      s3.setAttribute('type', "button");
      s3.setAttribute('value', "Submit");
      view.append(i3);
      view.append(s3);
      var url = 'http://localhost:8082/LibraryWebSystem/libr/search';
      var http = new XMLHttpRequest();


      document.getElementById("search_title").addEventListener("click", () => {
        var inputbox = <HTMLInputElement>document.getElementById("id_title");

        if (inputbox.value !== "") {
          var body = {
            "method": "title",
            "key": inputbox.value
          }
          var httpOptions = {
            headers: new HttpHeaders({
              'Content-type': 'application/json'
            })
          };
          this.http.post(url, body, httpOptions).subscribe(res => {
            console.log(res);
            var book = JSON.parse(JSON.stringify(res));
            console.log(book);
            this.display(book)
          })
        }

      })

      document.getElementById("search_author").addEventListener("click", () => {
        var inputbox = <HTMLInputElement>document.getElementById("id_author");
        if (inputbox.value !== "") {
          var body = {
            "method": "author",
            "key": inputbox.value
          }
          var httpOptions = {
            headers: new HttpHeaders({
              'Content-type': 'application/json'
            })
          };
          this.http.post(url, body, httpOptions).subscribe(res => {
            console.log(res);
            var book = JSON.parse(JSON.stringify(res));
            console.log(book);
            this.display(book)
          })

        }
      })

      document.getElementById("search_tag").addEventListener("click", () => {
        var inputbox = <HTMLInputElement>document.getElementById("id_tag");
        if (inputbox.value !== "") {
          var body = {
            "method": "tag",
            "key": inputbox.value
          }
          var httpOptions = {
            headers: new HttpHeaders({
              'Content-type': 'application/json'
            })
          };

          this.http.post(url, body, httpOptions).subscribe(res => {
            console.log(res);
            var book = JSON.parse(JSON.stringify(res));
            console.log(book);
            this.display(book)
          })
        }
      })

    })

    document.getElementById("borrow").addEventListener("click", () => {
      view.innerHTML = "Please enter the internal ID of the Book to borrow it<br>";
    //  document.getElementById("bottom").innerHTML = "";
    bottom.hidden=false;
      var i1 = document.createElement("input"); //input element, text
      i1.setAttribute('type', "number");
      i1.setAttribute('name', "bookid");
      i1.setAttribute("id", "id_id");
      var s1 = document.createElement("input"); //input element, Submit button
      s1.setAttribute("id", "borrow_book");
      s1.setAttribute('type', "button");
      s1.setAttribute('value', "Submit");
      view.append(i1);
      view.append(s1);
      document.getElementById("borrow_book").addEventListener("click", () => {
        var inputbox = <HTMLInputElement>document.getElementById("id_id");

        var url = 'http://localhost:8082/LibraryWebSystem/libr/borrow';

        // The parameters we are gonna pass to the fetch function

        //    alert("here");
        var httpOptions = {
          headers: new HttpHeaders({
            'Content-type': 'application/json'
          })
        };
        var body = {
          "userid": DATA.id,
          "bookid": inputbox.value
        };
        const headers = new HttpHeaders().set('Content-Type', 'application/json; charset=utf-8');
        this.http.post(url, body,{ headers, responseType: 'text'}).subscribe({
         next(val) {alert(val); bottom.innerHTML=""; } 

        } );
      })



    })
    
    document.getElementById("Remove").addEventListener("click", () => {
      bottom.hidden=false;
      view.innerHTML="Remove Book by ID<br>";
      var i1 = document.createElement("input"); //input element, text
      i1.setAttribute('type', "number");
      i1.setAttribute('name',"name_id");
      i1.setAttribute("id", "id_id");      
      view.append(i1);      

      var s1 = document.createElement("input"); //input element, Submit button
      s1.setAttribute("id", "new_remove");
      s1.setAttribute('type', "button");
      s1.setAttribute('value', "Submit");
      view.append(s1); 
      document.getElementById("new_remove").addEventListener("click", ()=>{
        var inputbox = <HTMLInputElement>document.getElementById("id_id");
        var id = inputbox.value;
        if(id === '0' || null)
          alert("Internal Id can't be null or zero");
        else{
          var url = 'http://localhost:8082/LibraryWebSystem/libr/removebook';
          var httpOptions = {
            headers: new HttpHeaders({
              'Content-type': 'application/json'
            })
          };
          var body = {
            "bookid": inputbox.value,
          }
          const headers = new HttpHeaders().set('Content-Type', 'application/json; charset=utf-8');
          this.http.post(url, body,{ headers, responseType: 'text'}).subscribe({
           next(val) {alert(val); bottom.innerHTML="";} 
 
          } );
        }
      })
    })

    document.getElementById("out").addEventListener("click", () => {
      sessionStorage.clear();
      bottom.hidden=true;
      alert("Bye " + DATA.firstname + " !");
      this.router.navigateByUrl("/login");

    })

    document.getElementById("add").addEventListener("click", () => {
      console.log("add book here!");
      bottom.hidden=true;
      view.innerHTML = "Add a new Book here<br>Title:<br>";

      //Title
      var i1 = document.createElement("input"); //input element, text
      i1.setAttribute('type', "text");
      i1.setAttribute('name',"name_title");
      i1.setAttribute("id", "id_title");
      i1.setAttribute('required','required');
      view.append(i1);


      //author
      view.innerHTML += ("<br>Author:<br>")
      var i2 = document.createElement("input"); //input element, text
      i2.setAttribute('type', "text");
      i2.setAttribute('name',"name_author");
      i2.setAttribute("id", "id_author");
      view.append(i2);

      //page
      view.innerHTML += ("<br>Page Number:<br>")
      var i3 = document.createElement("input");
      i3.setAttribute('type', 'number');
      i3.setAttribute('name',"name_page");
      i3.setAttribute("id", "id_page");
      view.append(i3);

      //ISBN
      view.innerHTML += ("<br>ISBN:<br>")
      var i4 = document.createElement("input"); //input element, text
      i4.setAttribute('type', "text");
      i4.setAttribute('name',"name_isbn");
      i4.setAttribute("id", "id_isbn");      
      view.append(i4);

      //Publisher
      view.innerHTML += ("<br>Publisher:<br>")
      var i5 = document.createElement("input"); //input element, text
      i5.setAttribute('type', "text");
      i5.setAttribute('name',"name_publisher");
      i5.setAttribute("id", "id_publisher");      
      view.append(i5);

      //Tags
      view.innerHTML += ("<br>Tags:<br>")
      var i6 = document.createElement("input"); //input element, text
      i6.setAttribute('type', "text");
      i6.setAttribute('name',"name_tag");
      i6.setAttribute("id", "id_tag");      
      view.append(i6);      

      var s1 = document.createElement("input"); //input element, Submit button
      s1.setAttribute("id", "new_add");
      s1.setAttribute('type', "button");
      s1.setAttribute('value', "Submit");
      view.append(s1); 



      document.getElementById("new_add").addEventListener("click", ()=>{
        //alert("here!");
        var inputbox = <HTMLInputElement>document.getElementById("id_title");
        var title = inputbox.value;
        
        inputbox = <HTMLInputElement>document.getElementById("id_author"); 
        var author = inputbox.value;

        inputbox = <HTMLInputElement>document.getElementById("id_page"); 
        var page = inputbox.value;

        inputbox = <HTMLInputElement>document.getElementById("id_isbn"); 
        var isbn = inputbox.value;

        inputbox = <HTMLInputElement>document.getElementById("id_publisher"); 
        var publisher = inputbox.value;

        inputbox = <HTMLInputElement>document.getElementById("id_tag"); 
        var tag = inputbox.value;
        console.log(page);
        if(title=='')
          alert ("Title can't be empty");
        else if (author=='')
          alert ("Author can't be empty");
        else if (page==''||page==='0')
          alert("Page can't be zero");
        else if (isbn=='')
          alert("ISBN can't be empty");
        else if (publisher=='')
          alert("publisher can't be empty");
        else if (tag == '')
          alert("Tag can't be emtpy");
        else{
          console.log("Good");
          var url = 'http://localhost:8082/LibraryWebSystem/libr/addbook';
          var httpOptions = {
            headers: new HttpHeaders({
              'Content-type': 'application/json'
            })
          };
          var body = {
            "userid": DATA.id,
            "name": title,
            "author": author,
            "Isbn13" : isbn,
            "publisher" : publisher,
            "tag": tag,
            "page":page
          }
          this.http.post(url, body, httpOptions).subscribe(res => {
            console.log(typeof res);
            console.log(res);
            alert("Book Added");
          })

        }
        
        
      })
    })
    document.getElementById("removeuser").addEventListener("click", () => {
      view.innerHTML = "Delete User from Database<br>";
      bottom.hidden=true;
      var i1 = document.createElement("input"); //input element, text
      i1.setAttribute('type', "number");
      i1.setAttribute('name',"name_user");
      i1.setAttribute("id", "id_user");
      i1.setAttribute('required','required');
      view.append(i1);
      var s1 = document.createElement("input"); //input element, Submit button
      s1.setAttribute("id", "removeUser");
      s1.setAttribute('type', "button");
      s1.setAttribute('value', "Submit");
      view.append(s1); 
      document.getElementById("removeUser").addEventListener("click", ()=>{
        var inputbox = <HTMLInputElement>document.getElementById("id_user");
        var user = inputbox.value;
        var url = 'http://localhost:8082/LibraryWebSystem/libr/deregister';
        var httpOptions = {
          headers: new HttpHeaders({
            'Content-type': 'application/json'
          })
        };
        var body = {
          "librian" : DATA.id,
          "removeuser": user
   
        }

        const headers = new HttpHeaders().set('Content-Type', 'application/json; charset=utf-8');
        this.http.post(url, body,{ headers, responseType: 'text'}).subscribe({
         next(val) {alert(val); } 
        });

      })
    })
    document.getElementById("newuser").addEventListener("click", () => {
      view.innerHTML= "Add new basic user<br>Username:<br>";
      bottom.hidden=true;

      var i1 = document.createElement("input"); //input element, text
      i1.setAttribute('type', "text");
      i1.setAttribute('name',"name_user");
      i1.setAttribute("id", "id_user");
      i1.setAttribute('required','required');
      view.append(i1);


      //password
      view.innerHTML += ("<br>Password:<br>")
      var i2 = document.createElement("input"); //input element, text
      i2.setAttribute('type', "text");
      i2.setAttribute('name',"name_pass");
      i2.setAttribute("id", "id_pass");
      view.append(i2);

      //email
      view.innerHTML += ("<br>Email:<br>")
      var i3 = document.createElement("input");
      i3.setAttribute('type', 'email');
      i3.setAttribute('name',"name_email");
      i3.setAttribute("id", "id_email");
      view.append(i3);

      //First
      view.innerHTML += ("<br>First:<br>")
      var i4 = document.createElement("input"); //input element, text
      i4.setAttribute('type', "text");
      i4.setAttribute('name',"name_first");
      i4.setAttribute("id", "id_first");      
      view.append(i4);

      //Last
      view.innerHTML += ("<br>Last:<br>")
      var i5 = document.createElement("input"); //input element, text
      i5.setAttribute('type', "text");
      i5.setAttribute('name',"name_last");
      i5.setAttribute("id", "id_last");      
      view.append(i5);


      var s1 = document.createElement("input"); //input element, Submit button
      s1.setAttribute("id", "add_user");
      s1.setAttribute('type', "button");
      s1.setAttribute('value', "Submit");
      view.append(s1); 
      document.getElementById("add_user").addEventListener("click", ()=>{
        var inputbox = <HTMLInputElement>document.getElementById("id_user");
        var user = inputbox.value;
        
        inputbox = <HTMLInputElement>document.getElementById("id_pass"); 
        var pass = inputbox.value;

        inputbox = <HTMLInputElement>document.getElementById("id_email"); 
        var email = inputbox.value;

        inputbox = <HTMLInputElement>document.getElementById("id_first"); 
        var first = inputbox.value;

        inputbox = <HTMLInputElement>document.getElementById("id_last"); 
        var last = inputbox.value;

        if(user=='')
        alert ("user can't be empty");
      else if (pass=='')
        alert ("pass can't be empty");
      else if (email=='')
        alert("email can't be empty");
      else if (first=='')
        alert("first can't be empty");
      else if (last == '')
        alert("last can't be emtpy");
      else{
        console.log("Good");
        var url = 'http://localhost:8082/LibraryWebSystem/libr/register';
        var httpOptions = {
          headers: new HttpHeaders({
            'Content-type': 'application/json'
          })
        };
        var body = {
          "username": user,
          "password": pass,
          "firstname": first,
          "lastname" : last,
          "email" : email
        }

        const headers = new HttpHeaders().set('Content-Type', 'application/json; charset=utf-8');
        this.http.post(url, body,{ headers, responseType: 'text'}).subscribe({
         next(val) {alert(val); } 
        });




      }
      
      })


    })
    
    document.getElementById("myb").addEventListener("click", () => {
      view.innerHTML = "Books I Borrowed";
      bottom.hidden=true;
      var url = 'http://localhost:8082/LibraryWebSystem/libr/mybook';

      // The parameters we are gonna pass to the fetch function

      // alert("here");
      var httpOptions = {
        headers: new HttpHeaders({
          'Content-type': 'application/json'
        })
      };
      this.http.post(url, DATA, httpOptions).subscribe(res => {
        var jsondata = JSON.parse(JSON.stringify(res));
        //var d = new Date(1392094800000);
        //console.log(d);
        //console.log(jsondata);
        //var length = jsondata.length;
        this.mydisplay(jsondata);
        view.innerHTML += "<br>Return my books<br>";
        var i1 = document.createElement("input"); //input element, text
        i1.setAttribute('type', "number");
        i1.setAttribute('name', "bookid");
        i1.setAttribute("id", "id_id");
        var s1 = document.createElement("input"); //input element, Submit button
        s1.setAttribute("id", "return_book");
        s1.setAttribute('type', "button");
        s1.setAttribute('value', "Submit");
        view.append(i1);
        view.append(s1);
        document.getElementById("return_book").addEventListener("click", ()=>{
          var inputbox = <HTMLInputElement>document.getElementById("id_id");
          console.log(inputbox.value);
         // alert("return book not ready!");
          /*
          * Here!
          */
         var url = 'http://localhost:8082/LibraryWebSystem/libr/return';
        
         var body = {
           "userid": DATA.id,
           "bookid": inputbox.value,
         }
          const headers = new HttpHeaders().set('Content-Type', 'application/json; charset=utf-8');
         this.http.post(url, body,{ headers, responseType: 'text'}).subscribe({
          next(val) {alert(val); } 

         } );
     

        })
      });

    })
  }

}
