import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-two-way',
  templateUrl: './two-way.component.html',
  styleUrls: ['./two-way.component.css']
})
export class TwoWayComponent implements OnInit {
 ngonInit(): void {
   console.log('ngoninit implemented');
 }
   backgroundColor = 'red';

  constructor() { }
  buttonEvent(data){
   console.log(data);
  }
  // changeColor(){
  //   if(this.backgroundColor === 'red'){
  //     this.backgroundColor = 'blue';
  //   }else {
  //     this.backgroundColor = 'red';
  //   }
  // }
ChangeColor(data){
this.backgroundColor = data;
}

  
}
