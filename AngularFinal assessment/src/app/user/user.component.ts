import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http'

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  users:any[] = [];
  constructor(private http:HttpClient) {
    http.get<any>('https://jsonplaceholder.typicode.com/users')
    .subscribe(resData =>{
      this.users = resData;
    })
   }
   delete(data)
   {
     let index=this.users.indexOf(data);
     this.users.splice(index,1);
   }

  ngOnInit() {
  }

}
