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
