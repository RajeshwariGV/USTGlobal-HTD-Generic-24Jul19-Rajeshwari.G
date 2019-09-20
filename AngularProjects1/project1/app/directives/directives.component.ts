import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-directives',
  templateUrl: './directives.component.html',
  styleUrls: ['./directives.component.css']
})
export class DirectivesComponent implements OnInit {
condition = false;
  users = [
    {
      id: 1234,
      name: 'raji',
      city: 'chennai'
    },
    {
      id: 122333,
      name: 'bhavya',
      city: 'madanapalli'
    },
    {
      id: 2333333,
      name:'susmi',
      city: 'pune',
    },
    {
      id: 345657,
      name: 'sweety',
      city: 'simla'
    }
  ]

  constructor() { }
  removeUser(user) {
   let index = this.users.indexOf(user);
   this.users.splice(index, 1);
   this.condition = true
}
close(){
  this.condition = false;
}
  ngOnInit() {
  }

}
