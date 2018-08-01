function me(message) {
    console.log(message);
    var count = 5;
    var address = 'a';
    var f = [1, 2, 'addr', address];
    console.log(f);
    var a = 1;
    var b = 2;
    var c = a + b;
    var d = 'prasanna';
    var ColorBlue = 1;
    var ColorGreen = 2;
    var ColorRed = 3;
    var colors;
    (function (colors) {
        colors[colors["White"] = 0] = "White";
        colors[colors["Blue"] = 1] = "Blue";
        colors[colors["Green"] = 2] = "Green";
        colors[colors["Red"] = 4] = "Red";
    })(colors || (colors = {}));
    ;
}
var message = "Angular application using typescript";
console.log(message);
console.log(colors);
