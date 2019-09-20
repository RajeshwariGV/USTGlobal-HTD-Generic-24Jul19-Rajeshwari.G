import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { User } from './users/user';

@Injectable({
  providedIn: 'root'
})
export class FirebaseService {

  url:string = 'https://angular-http-972f6.firebaseio.com/';
  selectedUser: User = {
     name: null,
     email: null,
     phno: null,
     id: null
  }
  users = [];
  constructor(private http: HttpClient) {

   }
   
   getData() {
     this.http.get(`${this.url}users.json`).pipe(map(resData => {
       let userArray = [];
       for (let key in resData){
         userArray.push({...resData[key], id: key});
   }
       return userArray;

     })).subscribe(data => {
       this.users = data;
       console.log(data);
     }, err => {
       console.log(err);
     
     });
   }
  postData(data) {
    return this.http.post(`${this.url}/users.json`, data);
  }

  updateData(data) {
    return this.http.put(`${this.url}users/${data.id}.json`,data);
  }

deleteUser(data) {
  return this.http.delete(`${this.url}users/${data.id}.json`);
}

ngDoCheck() {
  this.getData();
  }
}
