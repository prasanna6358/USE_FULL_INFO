var Mouse = /** @class */ (function () {
    function Mouse(a, y) {
        this.a = a;
        this.y = y;
        this.a = a;
        this.y = y;
    }
    Mouse.prototype.addElements = function () {
        console.log("X is " + this.a + " Y is " + this.y + " sum is " + (this.a + this.y));
    };
    Object.defineProperty(Mouse.prototype, "X", {
        get: function () {
            return this.a;
        },
        set: function (value) {
            if (value < 0) {
                throw new Error("value cannot be less than Zero");
            }
            else
                this.a = value;
        },
        enumerable: true,
        configurable: true
    });
    return Mouse;
}());
var obj = new Mouse(2, 5);
obj.X = -5;
var d = obj.X;
console.log(d);
obj.addElements();
