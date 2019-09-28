import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-taskmanager',
  templateUrl: './taskmanager.component.html',
  styleUrls: ['./taskmanager.component.css']
})
export class TaskmanagerComponent implements OnInit {

  public lists:any=[];
  constructor() {}

  printForm(taskform: NgForm)
  {
    this.lists.push(taskform.value);
    // console.log(this.lists);
  }
  delete(task)
   {
     let data=this.lists.indexOf(task);
     this.lists.splice(data,1);
   }
  ngOnInit() {
  }

}
