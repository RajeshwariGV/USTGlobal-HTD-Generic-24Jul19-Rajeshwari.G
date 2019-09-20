import { Directive, ElementRef, HostListener } from '@angular/core';

@Directive({
  selector: '[appMyDirective]'
})
export class MyDirectiveDirective {

  constructor(private elementRef: ElementRef) {
    elementRef.nativeElement.style.background = 'pink';
    elementRef.nativeElement.style.color = 'white';
    elementRef.nativeElement.style.padding = '60px';
    elementRef.nativeElement.style.marginTop = '70px';
   }
  
    @HostListener('style.background') background: string;
    @HostListener('mouseenter')
mouseEnter(){
  this.background = "skyblue";
  //alert('mouse Entered');
  //console.log('mouse Entered');
  // this.elementRef.nativeElement.style.background = 'red';
  // this.elementRef.nativeElement.style.color = 'white';
  // this.elementRef.nativeElement.style.fontSize = '40px';
}

  @HostListener('mouseleave')
  mouseleave(){
    this.background = "purple";
  //alert('mouse Entered');
  //console.log('mouse Entered');
  
// this.elementRef.nativeElement.style.background = 'red';
//   this.elementRef.nativeElement.style.color = 'white';
//   this.elementRef.nativeElement.style.fontSize = '20px';
  }
}


