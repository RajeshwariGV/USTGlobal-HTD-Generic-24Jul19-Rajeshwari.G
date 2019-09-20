var rectangleOperations;
(function (rectangleOperations) {
    var rectangle;
    (function (rectangle) {
        function area(length, breadth) {
            console.log('Area of rectangle is ' + length * breadth);
        }
        rectangle.area = area;
        function perimeter(length, breadth) {
            console.log('perimeter of rectangle is' + 2 * (length + breadth));
        }
        rectangle.perimeter = perimeter;
    })(rectangle = rectangleOperations.rectangle || (rectangleOperations.rectangle = {}));
})(rectangleOperations || (rectangleOperations = {}));
var circleOperations;
(function (circleOperations) {
    var Circle;
    (function (Circle) {
        var PI = 3.14;
        function circumferenceofcircle(radius) {
            console.log("The circumference of circle is" + 2 * PI * radius);
        }
        Circle.circumferenceofcircle = circumferenceofcircle;
        function areaOfcircle(radius) {
            console.log("The Area of circle is " + PI * radius * radius);
        }
        Circle.areaOfcircle = areaOfcircle;
    })(Circle = circleOperations.Circle || (circleOperations.Circle = {}));
})(circleOperations || (circleOperations = {}));
/// <reference path="./rectangle.ts"/>
/// <reference path="./circle.ts"/>
rectangleOperations.rectangle.area(23, 34);
circleOperations.Circle.circumferenceofcircle(4);
