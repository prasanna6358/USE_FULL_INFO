
class Mouse{

    constructor(private _x?: number, private _y?: number){
    }

    addElements(){
        console.log("X is "+this._x +" Y is "+this._y+" sum is "+(this.x+this._y));
    }

    get x(){
        return this._x;
    }
    set x(value){
        if(value<0){
            throw new Error("value cannot be less than Zero");
        }
        else this._x = value;
    }
}

let obj = new Mouse(2,5);
obj.addElements();
obj.x =10;
var d = obj.x;
console.log(d);
obj.addElements();