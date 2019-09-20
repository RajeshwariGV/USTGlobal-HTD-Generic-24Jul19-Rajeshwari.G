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
