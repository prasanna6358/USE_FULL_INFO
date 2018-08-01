var Mouse = /** @class */ (function () {
    function Mouse(_x, _y) {
        this._x = _x;
        this._y = _y;
    }
    Mouse.prototype.addElements = function () {
        console.log("X is " + this._x + " Y is " + this._y + " sum is " + (this.x + this._y));
    };
    Object.defineProperty(Mouse.prototype, "x", {
        get: function () {
            return this._x;
        },
        set: function (value) {
            if (value < 0) {
                throw new Error("value cannot be less than Zero");
            }
            else
                this._x = value;
        },
        enumerable: true,
        configurable: true
    });
    return Mouse;
}());
var obj = new Mouse(2, 5);
obj.addElements();
obj.x = 10;
var d = obj.x;
console.log(d);
obj.addElements();
