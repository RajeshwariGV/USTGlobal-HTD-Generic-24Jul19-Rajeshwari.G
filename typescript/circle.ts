namespace circleOperations{
    export namespace Circle {
    const PI = 3.14;
    export function circumferenceofcircle(radius: number) {
        console.log("The circumference of circle is" + 2*PI*radius);
       }
   export function areaOfcircle(radius: number) {
       console.log("The Area of circle is "+PI*radius*radius);
    }
  } 
}